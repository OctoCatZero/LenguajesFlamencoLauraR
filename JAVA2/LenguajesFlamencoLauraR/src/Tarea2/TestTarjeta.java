



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import javax.swing.JOptionPane;

/**
 *
 * @author lauraflamenco
 */
public class TestTarjeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      
         Tarjeta t=new Tarjeta();
         t.setNumero_de_tarjeta(1);
        
        JOptionPane.showMessageDialog(null, "El Numero de tarjeta es  " +  t.getNumero_de_tarjeta());
        t.setNombre_del_cliente("");
        JOptionPane.showMessageDialog(null, "El nombre del cliente es  " +  t.getNombre_del_cliente()); 
        
        
    }
}