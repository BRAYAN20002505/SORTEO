
package Sorteo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author PC-ELHID
 */

public class clsSorteo {
    
    Scanner read = new Scanner(System.in);
//   public void ejemplo1()
//    {
//        String[] array = {"Zacarias","Maria","Jose","Luis"};
//        
//        //Usamos Arrays para convertir en una lista
//        List <String> miLista = Arrays.asList(array);
//        
//        
//        //System.out.println(miLista);
//       
//        Collections.sort(miLista);
//        
//        System.out.println("Lista ordenada = "+miLista);
//        
//        int donde = Collections.binarySearch(miLista, "Brayan");
//        System.out.println("Gabriel se encuentra en el idx =" +donde);
//        Collections.shuffle(miLista);
//        //System.out.println("Mi lista revuelta =" + miLista);
//    }//Ejemplo 1
    
   public void hacerSorteo(List lista)
   {
       System.out.println("COMENZAMOS EL GRAN SORTEO!!!!!!!!!!!");
       pausa();
       System.out.println("En Un momento Se Nos Mostrara una lista de ganadores... =V ");
       pausa();
       System.out.println("Cuanto ganadores creen que son? =O");
       int G = read.nextInt();
       
       System.out.println("Iniciaremos Oficialmente El Gran Sorteo -.-!!!!!!!!!!!");
       pausa();
        System.out.println("Empeiza La Cuenta Regresiva!!!!!!!!!!!");
       pausa();
        System.out.println("COMENZAMOS !!!!!!!!!!!");
       pausa();
       System.out.println("En 3 ... 2 ... 1...");
       ganadores(lista, G);
   }
    
   public List desordenLista(List lista)
   {
       Collections.shuffle(lista);//desordena el index de la lista aleatoriamente
       return lista;
   }
   
   public List ganadores(List lista,int G)
   {
       List<String> listaGanadores = Arrays.asList();
       String a ;
       String array[]  = new String[G];
       for (int i = 0; i < G; i++)
       {
           desordenLista(lista);
           array[i] = lista.get(i).toString();
//           System.out.println(lista);
//           a = lista.get(i).toString();
//            listaGanadores.add(a);
       }
       System.out.println("Y Nuestros Ganadores son...");
       
       for (int i = 0; i < array.length; i++)
       {
         System.out.println(array[i]);  
       }
       
       //return lista;
        System.out.println("MUCHAS FELICIDADES!!!!!!!!!!!");
        System.out.println("USTEDES SON NUESTROS GANADORES");
       pausa();
        return lista;
   }
   //para retardar la interaccion 
   public void pausa()
   {
       try {
           Thread.sleep(1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(clsSorteo.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
