
package ejemplolista;

import Db_Connection.clsConexion;
import Listapuntos.Lista;
import Sorteo.clsSorteo;
import ejemplos.ClsEjemplos;
import static java.util.Collections.list;
import java.util.List;
import objListaOrdENADA.ListaOrdenada;

/**
 *
 * @author PC-ELHID
 */
public class EjemploLista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       // new ClsEjemplos().ejemplo1();
        //Lista lst = new Lista().crearLista();
        
        
      new clsConexion().getConexion();
      List <String> miLista = new clsConexion().getNomsLista();
      new clsSorteo().hacerSorteo(miLista);

//        ListaOrdenada lista;
//        lista = new ListaOrdenada();
//        lista.insertaOrden(77);
//        lista.insertaOrden(1);
//        lista.insertaOrden(8);
//        lista.insertaOrden(100);
//        lista.insertaOrden(38);
//        lista.insertaOrden(4);
//        
//        
//        System.out.println("Elementos en la lista: \n");
//        lista.visualizar();

        int pausa;
        pausa =0;
    }
    
}
