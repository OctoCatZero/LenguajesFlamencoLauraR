/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TAREA1;

/**
 *
 * @author lauraflamenco
 */
public class Persona {
    private float  Edad;

    public float getEdad() {
        return Edad;
    }

    public void setEdad(float Edad) {
        if(Edad<18)Edad=18;
     
        this.Edad = Edad;
    }
    
}
