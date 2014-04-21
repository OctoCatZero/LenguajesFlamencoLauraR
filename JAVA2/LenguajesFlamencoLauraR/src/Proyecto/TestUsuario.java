/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 * https://github.com/daton/lenguajes.git
 *
 * @author campitos
 */
public class TestUsuario {

    public static void main(String[] args) throws Exception {
        Usuario u = new Usuario("raton vaquero", 6, "rata@gmail.com");
      GuardarArchivo.guardar(u);

        for (Usuario usu : GuardarArchivo.leer()) {
            System.out.println(usu);
        }
    }

}
