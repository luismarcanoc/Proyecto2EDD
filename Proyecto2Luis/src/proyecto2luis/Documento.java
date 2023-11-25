/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2luis;

/**
 *
 * @author andre
 */
public class Documento {
    public String title;
    public int size;
    public String type;
    public Documento left;
    public Documento right;
    public int time;
    public boolean enviado;
    
    public Documento(String t, int s, String y, int c){
        this.title = t;
        this.size = s;
        this.type = y;
        this.left = this.right = null;
        this.time = c;
        this.enviado = false;
    }
    
    
}
