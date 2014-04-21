/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author lauraflamenco
 En la carpeta  capitulo1 vas a encontrar La clase Imagen, en ella
         vas a agregar los artibutos alto, de tipo int , ancho de tipo int. 
         * Practicale el encapsulamiento  e impon la regla de
         que los atributos no sean negativos (trasnformalos a positivos). 
       Crear Una clase TestImagen con metodo main y en ella crea un objeto 
        de tipo Imagen, asignale un valores negativos a alto y ancho y verifica que se cambien a positivos. E la clase Tarjeta implementa dos atributos, 
        numeroTarjeta de tipo int y nombreCliente de tipo String.  Crea los metodos get y set correspondientes a cada atributo.
        ¿Que tendrias que hacer para que  aarezca siempre el nombre "Juan" cuando no se le asigne nombre a un objeto de tipo Tarjeta?
    
    
 * 
 */
package Tarea2;

public class Imagen {
    
    private int alto;
    

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        if(alto<0)alto=-alto;
        this.alto = alto;
    }
    private int ancho;

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if(ancho<0)ancho=-ancho;
        this.ancho = ancho;
    }
    
}
