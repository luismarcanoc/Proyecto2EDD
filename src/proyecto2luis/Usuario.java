/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2luis;

import java.util.Arrays;

/**
 *
 * @author andre
 */
public class Usuario {
    public String username;
    public String priority;
    public Documento[] documents;
    
    public Usuario(String u, String p){
        this.username = u;
        this.priority = p;
        this.documents = new Documento[1];
        this.documents[0] = null;
        
    }
    
    public void add_document(String t, int s, String y, int c){
        boolean found = false;
        for (int i = 0; i < this.documents.length; i++) {
            if(this.documents[i] == null || this.documents[i].title.equals("")){
                this.documents[i] =  new Documento(t,s,y,c);
                found = true;
                break;
            }
                
        }
        if(!found){
            Documento[] more_documents = new Documento[this.documents.length*2];
            Arrays.fill(more_documents, new Documento("", 0, "",0));
            for (int i = 0; i < this.documents.length; i++) {
                more_documents[i] = this.documents[i];
            }
            more_documents[this.documents.length] = new Documento(t,s,y,c);
            this.documents = more_documents;
        }
    }
    
    public void send_to_printer(Documento doc, BinaryHeap printer){
        printer.insert(doc.title, doc.size, doc.type, doc.time);
        System.out.println("AÑADIDO EXITOSAMENTE A LA COLA DE IMPRESIÓN");
    }
    
    public String print_docs(){
        String docs = "";
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] != null && !documents[i].title.equals("")) {
                String send = "";
                if(documents[i].enviado){
                    send = "En cola";
                }
                docs += "       " + documents[i].title + " "+documents[i].type + ": " + send + "\n";
            }
        }
        return docs;
    }
    

}
