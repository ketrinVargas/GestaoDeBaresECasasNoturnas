/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoherenca;

/**
 *
 * @author ketrim
 */
public class Fornecedor extends Pessoa {
    
    private float valorCredito;
    private float valorDivida;
    
    public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

   
    public float getValorCredito() {
        return valorCredito;
    }

   
    public void setValorCredito(float valorCredito) {
        this.valorCredito = valorCredito;
    }

  
    public float getValorDivida() {
        return valorDivida;
    }

    
    public void setValorDivida(float valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public float obterSaldo( float valorCredito, float valorDivida){
       float Saldo = 0;
       
        if( valorCredito != valorDivida){
            Saldo = valorCredito -= valorDivida;
        }
        return Saldo;
    }
    
   
  
    
    
}
