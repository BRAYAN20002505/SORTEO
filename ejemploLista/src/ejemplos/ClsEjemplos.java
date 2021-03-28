package ejemplos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author PC-ELHID
 */


public class ClsEjemplos {
    public void ejemplo1(){
        String[] array ={"Zacarias","Maria","Abel","Bety","Fabricio"};
        List<String> milista = Arrays.asList(array);
        //milista.add("hola");//agregar otro nombre
        imprimirTodo(milista);
        //System.out.println("Lista antes orden"+milista);
        Collections.sort(milista);
        System.out.println("Lista ordenada="+milista);
        int donde= Collections.binarySearch(milista,"Fabricio");
        System.out.println("Se Encuentra el idx="+donde);
        Collections.shuffle(milista);
       // System.out.println("Revueltos="+milista);
       imprimirTodo(milista);
    }
    
    public void imprimirTodo(Collection coll){
        Iterator iter = coll.iterator();
        
        while(iter.hasNext()){
            System.out.println("ELEMNETO = "+iter.next());
        }
    }
    
    public void pruebaArreglo(){
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("uno");
         lista.add("dos");
         
        String[] a = new String[20];
        lista.toArray(a);
        String[] b = lista.toArray(new String[10]);
    }
    
    
}//end class
