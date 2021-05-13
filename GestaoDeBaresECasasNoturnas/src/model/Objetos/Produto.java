/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Objetos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arquivo;
import model.Enums.Classe;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Produto implements Serializable {
    private static int produtosRegistrados;
    private int cod;
    private String descricao;
    private int quantidade;
    private int quantidadeConsumida;
    private float precoCusto;
    private float precoVenda;

    public Produto(int produtosRegistrados, String descricao, int quantidade, float precoCusto, float precoVenda) {
        this.cod = produtosRegistrados++;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.quantidadeConsumida = 0;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

  
    public String toString(boolean ePraCliente) {
        if(ePraCliente){
            return "{" + " cod='" + getCod() + "'" + ", descricao='" + getDescricao() + "'" + ", preco='" + getPrecoVenda()
                    + "'" + "}";
        }else{
            return "{" + " cod='" + getCod() + "'" + ", descricao='" + getDescricao() + ", quantidade="  + getQuantidade() + ", quantidade consumida="  + getQuantidadeConsumida() + ",  precco custo=" + getPrecoCusto() +  "'" + ", preco='" + getPrecoVenda()
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
    
    public void rmQuantidade(int quantidade){
        this.quantidade -= quantidade;
        this.quantidadeConsumida += quantidade;
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

    private int getQuantidadeConsumida() {
        return this.quantidadeConsumida;
    }
    
    public static void inicia() {
        try {
            produtosRegistrados = (int) Arquivo.getArquivo(Classe.PRODUTO);
        } catch (IOException ex) {
            produtosRegistrados = 0;
        } catch (ClassNotFoundException ex) {
            produtosRegistrados = 0;
        } 
    }
    
    public static void encera() throws IOException{
        try {
            Arquivo.setArquivo(Classe.PRODUTO, produtosRegistrados);
        } catch (IOException ex) {
            Arquivo.iniciaArquivos(Classe.PRODUTO);
            encera();
        }
    }
}