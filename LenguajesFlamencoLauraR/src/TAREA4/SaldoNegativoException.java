/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TAREA4;

/**
 *
 * @author lauraflamenco
 */
public class SaldoNegativoException extends Exception{
    public SaldoNegativoException () {
        super ("No se permite Saldo Negativo");
    
}
}

