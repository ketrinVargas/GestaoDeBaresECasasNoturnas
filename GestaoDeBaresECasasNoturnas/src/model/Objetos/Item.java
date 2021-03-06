/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Objetos;

import java.io.Serializable;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Item implements Serializable{
    private int quantidade;
    private Produto produto;

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public Item(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        //remove quantidade
    }
    
    public int getCodProduto(){
        return produto.getCod();
    }
    
    @Override
    public String toString(){
        return "Item{" + " Quantidade=" + this.quantidade + ", Produto=" + this.produto.toString(true);
                
    }
    
    
    
    
    
}
