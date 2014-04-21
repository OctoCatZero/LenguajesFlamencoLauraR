/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SERIALIZACION;
import java.io.*;
/**
 *ver Hadoop---Apache
 * @author lauraflamenco
 */
public class GuardarUsuario {

    public void guardar (Usuario u) throws Exception{
        
    
            File file=new File ("archivaldo.xxx");
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos =new ObjectOutputStream(fos);
            oos.writeObject(u);
            
    //sigue el metodo leer
    
            
            
            
    }
    
    
    
    
}
