/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TAREA1;

/**
 *
 * @author lauraflamenco
 * 
 */
public class Circulo {
    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
       if(radio<0)radio=-radio;
        this.radio = radio;
    }
    
    
}