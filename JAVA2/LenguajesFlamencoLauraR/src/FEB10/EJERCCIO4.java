/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FEB10;

/**
 *
 * @author lauraflamenco
 */



 // CORREGIR CON CASTING FORZADO LOS QUE ESTUVIERON MAL DEL EJERCCIO ANTERIOR 

public class EJERCCIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte x=2;
        short y=2;
        int z=2;
        long w=2;
        
        z=x;
        w=x;
        y=x;
            
        y=(short)z;
        
        
        z=(int)w;
        x=(byte)w;
                
        w=y;
        
        x=(byte)z;
       
    }
    
}
