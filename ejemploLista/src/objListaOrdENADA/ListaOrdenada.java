/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objListaOrdENADA;

import Listapuntos.Lista;
import Listapuntos.Nodo;

/**
 *
 * @author PC-ELHID
 */
public class ListaOrdenada extends Lista {
    
    public ListaOrdenada(){
        super();
        
    }
    
    
    public ListaOrdenada insertaOrden(int entrada)
    {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        if (primero == null) {
            
            primero = nuevo;
        } else if (entrada < primero.getDato())
        {
            nuevo.setEnlace(primero);
            primero = nuevo;
        } else {
            //busqueda del nodo anterior, a partir de aqui se hara la insercion
            Nodo anterior, p;
            anterior = p = primero;
            while ((p.getEnlace() != null) && (entrada > p.getDato()))
            {
                anterior = p;
                p = p.getEnlace();
                
            }
            if (entrada > p.getDato())//se inserta despues del ultimo nodo
            {
                anterior = p;
            }
            nuevo.setEnlace(anterior.getEnlace());
            anterior.setEnlace(nuevo);
        }
        return this;
    }

}