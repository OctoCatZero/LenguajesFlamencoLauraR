/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TAREA1;

import javax.swing.JOptionPane;

/**
 *
 * @author lauraflamenco
 */
public class TestCirculo {
    
 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Circulo c=new Circulo();
    c.setRadio(-20);
    JOptionPane.showMessageDialog(null, "El radio es " + c.getRadio());
    }
}
