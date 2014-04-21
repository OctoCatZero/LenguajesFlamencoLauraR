/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author lauraflamenco
 */
public class Archivo implements Serializable {
    String nombre;
    File archivito;

    @Override
    public String toString() {
        return "Archivo{" + "nombre=" + nombre + ", archivito=" + archivito + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getArchivito() {
        return archivito;
    }

    public void setArchivito(File archivito) {
        this.archivito = archivito;
    }

    public Archivo(String nombre, File archivito) {
        this.nombre = nombre;
        this.archivito = archivito;
    }
    
}
