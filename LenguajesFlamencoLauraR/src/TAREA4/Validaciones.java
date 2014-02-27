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
public class Validaciones {
    
  public static void ValidarSaldo(int saldo) throws SaldoNegativoException
    {
        if (saldo< 0) throw new SaldoNegativoException();
    }

}
