/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Objetos;

import java.io.Serializable;
import model.Enums.Categoria;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Cliente implements Serializable {

    private int RG;
    private String nome;
    private String cat;
    private float credito;

    /**
     *
     * @param RG 
     * @param cat VIP, CAMAROTE, PISTA 
     * @param nome 
     * @param credito
     */
    public Cliente(int RG, String cat, String nome, int credito) {
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
    
    public String getCategoria(){
        return this.cat;
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
