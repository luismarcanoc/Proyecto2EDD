/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import static javax.accessibility.AccessibleRole.SEPARATOR;
import javax.swing.JFileChooser;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyecto2luis.BinaryHeap;
import proyecto2luis.Documento;

/**
 *
 * @author andre
 */
public class Arbol extends javax.swing.JFrame {

    public static BinaryHeap bh;

    /**
     * Creates new form Ventana1
     */
    public Arbol(BinaryHeap h) {
        this.bh = h;
        initComponents();
        
        
    }
    public int drawTree(Graphics g, Documento x, int x0, int x1, int y, int index){

        int m = (x0 + x1) / 2;
        g.setColor(Color.BLUE);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.lightGray);
        g.setFont(new Font("Arial",Font.BOLD,20));
        String t = String.valueOf(x.time);
        g.drawString(t, m+20, y+30);
        int posL = bh.leftChildIndex(index);
        int posR = bh.rightChildIndex(index);
        if (bh.heap[posL] != null) {
            int x2 = drawTree(g, bh.heap[posL],x0,m,y+50, posL);
            g.drawLine(m+25, y+40, x2+25, y+50);
        }
        if (bh.heap[posR] != null) {
            int x2 = drawTree(g, bh.heap[posR],m,x1,y+50, posR);
            g.drawLine(m+25, y+40, x2+25, y + 50);
        }
        return m;
    }

    public void draw(Graphics g, int m, int y, Documento x){
        g.setColor(Color.BLUE);
        g.fillOval(m, y, 50, 40);
        g.setColor(Color.lightGray);
        g.setFont(new Font("Arial",Font.BOLD,20));
        String t = String.valueOf(x.time);
        g.drawString(t, m+20, y+30);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawTree(g, bh.heap[0], 0, this.getWidth()-25, 100, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        time.setText("jLabel1");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 150, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbol(  bh).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}