/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ketrim
 */
public class Cliente {

    private int RG;
    private String nome;

    private float credito;

    public Cliente(int RG, String nome, int credito) {
        this.RG = RG;
        this.nome = nome;
        this.credito = credito;
        ListaClientes.addCliente(this);
    }

    @Override
    public String toString() {
        return "{" +
            " RG='" + getRG() + "'" +
            ", nome='" + getNome() + "'" +
            ", credito='" + getCredito() + "'" +
            "}";
    }

    public int getRG() {
        return this.RG;
    }

    public String getNome() {
        return this.nome;
    }

    public float getCredito() {
        return this.credito;
    }

    public void debita(float debito) throws Exception {
        if(this.credito >= debito){
            this.credito = (this.credito-debito);
        }else{ throw new Exception ("Cliente não possui saldo suficiente");}
    }

}
