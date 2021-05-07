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
public class Produto {
    private static int produtosRegistrados = 0;
    private int cod;
    private String descricao;
    private int quantidade;
    private float precoCusto;
    private float precoVenda;

    public Produto(String descricao, int quantidade, float precoCusto, float precoVenda) {
        this.cod = produtosRegistrados++;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

  
    public String toString(boolean ePraCliente) {
        if(ePraCliente){
            return "{" + " cod='" + getCod() + "'" + ", descricao='" + getDescricao() + "'" + ", preco='" + getPrecoVenda()
                    + "'" + "}";
        }else{
            return "{" + " cod='" + getCod() + "'" + ", descricao='" + getDescricao() + ", quantidade="  + getQuantidade() + ",  precco custo=" + getPrecoCusto() +  "'" + ", preco='" + getPrecoVenda()
                    + "'" + "}";
        }
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void addQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public float getPrecoCusto() {
        return this.precoCusto;
    }

    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public float getPrecoVenda() {
        return this.precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
}