/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author lauraflamenco
 */
public class Tarjeta {
    private int numero_de_tarjeta;
private String nombre_del_cliente;

    public int getNumero_de_tarjeta() {
        return numero_de_tarjeta;
    }

    public void setNumero_de_tarjeta(int numero_de_tarjeta) {
        this.numero_de_tarjeta = numero_de_tarjeta;
    }

    public String getNombre_del_cliente() {
        return nombre_del_cliente;
    }

    public void setNombre_del_cliente(String nombre_del_cliente) {
        
    
        if (nombre_del_cliente.equals("")) nombre_del_cliente = "Juan";
        
        this.nombre_del_cliente = nombre_del_cliente;
    }
}