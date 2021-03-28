/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listapuntos;

import java.util.Scanner;

/**
 *
 * @author PC-ELHID
 */
public class Lista {
    
    public Nodo primero;
    
    public Lista(){
        primero = null;
        
    }
    
    
    public int leerEntero(){
        System.out.println("Ingresar valor, -1 para finalizar");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
    
    public Lista crearLista(){
        int x;
        primero = null;
        
        do{
        x = leerEntero();
        if(x != -1){
            primero = new Nodo (x,primero);
        
        }
        }while(x != -1);
         return this;
    }
    //nuevos metodos que serviran para la tarea
    public Nodo buscarPosicion(int posicion){
        Nodo indice;
        int i;
        if(posicion < 0){
           return null; 
        }
        indice = primero;
        for(i = 1; (i < posicion)&&(indice != null); i++){
            indice = indice.enlace;
            
        }
        return indice;
    }
    
    //insertar de ultimo
    public Lista insertarUltimo(Nodo ultimo, int entrada){
        ultimo.enlace = new Nodo(entrada);
        ultimo = ultimo.enlace;
        return this;
        
    }
    
    public Lista insertarCabeza (Nodo cabeza, int valor){
        cabeza.enlace = new Nodo(valor);
        cabeza = cabeza.enlace;
        return this;
    }
    
    
    public Nodo buscarLista(int destino){
        Nodo indice;
        for(indice = primero; indice!=null; indice = indice.enlace){
            if(destino == indice.dato){  //destino.equals(indice.dato)//para buscar nombres string
                return indice;
            }
        }
        return null;
    }
    
    public void eliminar (int entrada){
        Nodo actual, anterior;
        boolean encontrado;
        //inicializa los apuntadores de memoria
        actual = primero;
        anterior = null;
        encontrado = false;
        //busqueda el nodo anterior quien es el nodo anterior
        while((actual != null)&&(!encontrado)){
            encontrado = (actual.dato == entrada);
            
            if(!encontrado){
                anterior = actual;
               actual = actual.enlace;
                
            }
        }//end while
        
        //enlace del nodo anterior con el siguiente
        if (actual != null){
            //distinguir si es el nodo inicial o cabeza
            //o si es cualquier otro nodo de la lista
            if(actual == primero){
                primero = actual.enlace;
            }else{
                anterior.enlace = actual.enlace;
            }
            actual = null;
            
        }
    }
    
    public Lista insertarLista(int testigo, int entrada){
        Nodo nuevo, anterior;
        anterior = buscarLista(testigo);
        
        if(anterior != null){
            nuevo = new Nodo(entrada);
            nuevo.enlace = anterior.enlace;
            anterior. enlace = nuevo;
        }
        return this;
    }
    
    public void visualizar()
    {
        Nodo n;
        int k = 0;
        n = primero;
        while (n != null)
        {
            System.out.println(n.dato + "");
            n = n.enlace;
            k++;
            System.out.println((k%15 != 0 ? "" : "\n"));
        }
    }
    
}//end class
