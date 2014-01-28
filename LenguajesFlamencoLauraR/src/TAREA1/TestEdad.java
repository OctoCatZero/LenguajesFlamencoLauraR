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
public class TestEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Persona p=new Persona();
    p.setEdad(-20);
    JOptionPane.showMessageDialog(null, "La edad es   " + p.getEdad());
    }
}
