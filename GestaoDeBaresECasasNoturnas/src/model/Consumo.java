/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ketrim
 */
public class Consumo {
    private static int consumosRegistrados = 0;
    private int cod;
    private int rg;
    private boolean eVip;
    private List<Item> itensConsumidos;
    private float valorTotal;

    public Consumo( int cod, int rg, boolean eVip) {
        this.cod = consumosRegistrados++;
        this.rg = rg;
        this.eVip = eVip;
        itensConsumidos = new ArrayList();
    }

    @Override
    public String toString() {
        String itens = "";
        for(Item i : itensConsumidos){
            itens=itens+i.toString();
        }
                    
        return "Consumo{" + "cod=" + cod + 
                ", rg=" + rg + 
                ", itensConsumidos=" + itens +  
                ", valorTotal=" + valorTotal + '}';
    }

    public int getCod() {
        return this.cod;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void addItem(int quantidade, int codProduto) throws Exception{
        //pega o produto
        Produto produto = ListaProduto.consultarProduto(codProduto);
        
        //cria o item
        Item item = new Item(quantidade, produto);
        
        //adiciona o item
        itensConsumidos.add(item);
    }
    
    public int getRg() {
        return this.rg;
    }

    
    public void atualizaTotal(){
        if(eVip){
            this.valorTotal = 200;
        }else{
            float valor = 0;
            for (Item i: itensConsumidos){
                float preco =  i.getProduto().getPrecoVenda();
                int quantidade = i.getQuantidade();
                valor = valor + (preco*quantidade);
            }
            this.valorTotal = valor;
        }
            
      
    }
    
    public int[] getProdutoQuantidade(){
        int[] produtoQuantidade = new int[100];
        for(Item i : itensConsumidos){
            int id = i.getCodProduto();
            produtoQuantidade[id] = i.getQuantidade();
        }
        return produtoQuantidade;
    }

}