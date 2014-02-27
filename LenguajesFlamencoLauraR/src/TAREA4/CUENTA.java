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
public class CUENTA {
    private String Tipo;
    private Integer Saldo;

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public Integer getSaldo() {
        return Saldo;
    }

    public void setSaldo(Integer Saldo) throws SaldoNegativoException  {
        Validaciones.ValidarSaldo(Saldo);
        this.Saldo = Saldo;
    }

    
    }




    