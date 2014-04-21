

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.



import javax.swing.JOptionPane;

/**
 *
 * @author lauraflamenco
 */
package Tarea2;
import javax.swing.JOptionPane;

public class TestImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Imagen i=new Imagen();
    i.setAncho(-80);
    JOptionPane.showMessageDialog(null, "El ancho es  " + i.getAncho());
    
     i.setAlto(-70);
    JOptionPane.showMessageDialog(null, "El alto es  " + i.getAlto());
    }
}