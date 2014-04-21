/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto;

/**
 *
 * @author campitos
 */
public class Leer {

    /**
     * Usuario{nombre=juan, edad=41, email=rapidclimate@gmail.com}
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
      
          for (Archivo a : GuardarArchivo.leer()) {
   
            System.out.println(a);
        }
        
   //  System.out.println(   GuardarArchivo.leer());
    }
    
}
