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
    private List<Item> itensConsumidos;
    private float valorTotal;

    public Consumo( int rg) {
        this.cod = consumosRegistrados++;
        this.rg = rg;
        itensConsumidos = new ArrayList();
        ListaConsumo.addConsumo(this);
    }

    @Override
    public String toString() {
        return "Consumo{" + "cod=" + cod + ", rg=" + rg + ", itensConsumidos=" + itensConsumidos.toString() + ", valorTotal=" + valorTotal + '}';
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

    
    private void atualizaTotal(){
        float valor = 0;
        for (Item i: itensConsumidos){
            float preco =  i.getProduto().getPrecoVenda();
            int quantidade = i.getQuantidade();
            valor = valor + (preco*quantidade);
        }
        this.valorTotal = valor;
    }

}