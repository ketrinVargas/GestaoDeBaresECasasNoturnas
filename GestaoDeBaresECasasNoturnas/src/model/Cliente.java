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
    private Categoria cat;
    private float credito;

    /**
     *
     * @param RG 
     * @param cat VIP, CAMAROTE, PISTA 
     * @param nome 
     * @param credito
     */
    public Cliente(int RG, Categoria cat, String nome, int credito) {
        this.RG = RG;
        this.cat = cat;
        this.nome = nome;
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "{" +
            " RG='" + getRG() + "'" +
            ", Categoria='" + this.cat.toString() + "'" +
            ", Nome='" + getNome() + "'" +
            ", Credito='" + getCredito() + "'" +
            "}";
    }

    public int getRG() {
        return this.RG;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNomeCaixaBaixa() {
        return this.nome.toLowerCase();
    }
    

    public float getCredito() {
        return this.credito;
    }
    
    public void credita(int credito){
        this.credito += credito;
        
    }

    public void debita(float debito) throws Exception {
        if(this.credito >= debito){
            this.credito = (this.credito-debito);
        }else{ throw new Exception ("Cliente não possui saldo suficiente");}
    }

}
