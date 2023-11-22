/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2luis;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TablaDispersion {
    public Usuario[] users;
    public int size;
    public int total;
    
    public TablaDispersion(){
        this.users = new Usuario[999];
        this.size = 999;
        total = 0;
        Arrays.fill(this.users, new Usuario("", ""));
    }
    
    public int hash(String username){
        int n = 31;
        int index = 0;
        for (int i = 0; i < username.length(); i++) {      
            index = n*index + username.charAt(i); 
            if (index< 0){
                index*=-1;
            };
        }
//        System.out.println(index);
        index = index%998;
        return index;
    }
    
    public void add_user(String username, String priority){
        Usuario user = new Usuario(username, priority);
        int index = hash(username);
        if(this.users[index].username.equals("")){
            this.users[index] = user;
            total++;
        }else{
            if (total == size){
                System.out.println("Numero máximo de usuarios alcanzado");
            }else{
            while(index < size && !this.users[index].username.equals("")){
                index++;
                if (index == size){
                    index = 0;
                }
            }
            this.users[index] = user;
            total++;
            }
        }
    }
    
    public Usuario search_user(String username){
        int hash = hash(username);
        if(this.users[hash].username.equals(username)){
            return this.users[hash];
        }else{
            
        }
        int cont = 0;
        while(cont < total && hash < size && !this.users[hash].username.equals(username)){
            hash++;
            if (hash == size){
                    hash = 0;
                }
            cont ++;
            }
        if(this.users[hash].username.equals(username)){
        return this.users[hash];}
        else{
            System.out.println("No encontrado");
            return null;
        }
    }
    
    public void print_users(){
        for (int i = 0; i < size; i++) {
            if(!this.users[i].username.equals("")){
                System.out.println(this.users[i].username + ", " + this.users[i].priority);
            }
        }
    }
    
    public void delete_user(String username){
        int hash = hash(username);
        if(this.users[hash].username.equals(username)){
            this.users[hash] = new Usuario("", "");
        }else{
            while(hash < size && !this.users[hash].username.equals(username)){
            hash++;
            if (hash == size){
                    hash = 0;
                }
            }
            this.users[hash] = new Usuario("", "");
        }
        

    }
    
    public boolean delete_document(String username, String title){
        Usuario user = search_user(username);
        for (int i = 0; i < user.documents.length; i++) {
            if (user.documents[i].title.equals(title)) {
                user.documents[i] = new Documento("", 0, "",0);
                return true;
            }
        }
        return false;
    }
    
    public Documento search_document(String username, String title){
        Usuario user = search_user(username);
        if (user!= null){
            for (int i = 0; i < user.documents.length; i++) {
                if (user.documents[i].title.equals(title)) {
                    return user.documents[i];
            }
        }}
        return null;
    }
    
    public String print_users(String print){
        for (int i = 0; i < size; i++) {
            if(!users[i].username.equals("")){
                print+= users[i].username + " " + users[i].priority + "\n";
                print += users[i].print_docs();
            }
        }
        return print;
    }
}

