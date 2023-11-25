/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2luis;

import ventanas.Menu;
import ventanas.Arbol;
import ventanas.ArchivoCSV;

/**
 *
 * @author andre
 */
public class Proyecto2Luis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        TablaDispersion t = new TablaDispersion();
//        t.add_user("alskjdsj", "sdlksfhdf");
//        t.add_user("iuduhgksud", "sdlksfhdf");
//        t.add_user("kdshfskd", "sdlksfhdf");
//        t.add_user("jhfwidf", "sdlksfhdf");
//        t.add_user("JAN", "sdlksfhdf");
//        t.add_user("oiwqhrkjbsdk", "sdlksfhdf");
//        t.add_user("oñsaihfdija", "sdlksfhdf");
//        
//
////        t.print_users();
////        System.out.println(t.search_user("JAN").username);
//
//
//        BinaryHeap heap = new BinaryHeap();
//        // Prueba de inserción
//        heap.insert("dsfsdfsd", 8, "SADfasfas", 27);
//        heap.insert("sadasd", 8, "SADfasfas", 23);
//        heap.insert("sdfsdfsdf", 8, "SADfasfas", 43);
//        heap.insert("cxvxcv", 8, "SADfasfas", 12);
//        heap.insert("myhjmhmh", 8, "SADfasfas", 32);
//        Usuario search_user = t.search_user("JAN");
//        search_user.add_document("myhjmhmh", 8, "SADfasfas", 32);
//        search_user.add_document("dsfsdfsd", 8, "SADfasfas", 27);
//
//
//        // Prueba de eliminación del mínimo
////        Documento min = heap.deleteMin();
////        System.out.println("Mínimo eliminado: " + min.time); // Debería imprimir 12
//
//        // Prueba adicional de inserción y eliminación
//        heap.insert("dsfsdfewtgsgssd", 8, "SADfasfas", 65);
//        heap.insert("weytgfjryt", 8, "SADfasfas", 21);
//        heap.insert("uluyuru", 8, "SADfasfas", 27);
//        heap.insert("cxvxchgfhv", 8, "SADfasfas", 75);
//        heap.insert("sfdfds", 8, "SADfasfas", 3);
//
//
//          for (int i = 0; i < heap.size; i++) {
//              System.out.println(heap.heap[i].time);
//        }
//        Documento doc = new Documento("weytgfjryt", 8, "SADfasfas", 21);
//        heap.delete_document(doc);
//        while (heap.size!= 0) {
//            System.out.println("Raiz: "+ heap.heap[0].time);
//
//            Documento currentMin = heap.deleteMin();
//            System.out.println("Mínimo eliminado: " + currentMin.time);
//        }
//        
//        Arbol v1 = new Arbol(heap);
//        v1.setVisible(true);
//            Menu m = new Menu(heap, t);
//            m.setVisible(true);
        ArchivoCSV csv = new ArchivoCSV();
        csv.setVisible(true);

    }
    
}
