/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Objetos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import model.Listas.ListaProduto;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arquivo;
import model.Enums.Classe;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Consumo implements Serializable {
    private static int consumosRegistrados = 0;
    private int cod;
    private int rg;
    private boolean eVip;
    private List<Item> itensConsumidos;
    private float valorTotal;
    private boolean pago;

    public Consumo( int rg, boolean eVip) {
        this.cod = consumosRegistrados++;
        this.rg = rg;
        this.eVip = eVip;
        itensConsumidos = new ArrayList();
        this.pago = false;
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
        
        produto.rmQuantidade(quantidade);
        
        //adiciona o item
        itensConsumidos.add(item);
    }
    
    public int getRg() {
        return this.rg;
    }
    
    public boolean foiPago(){
        return pago;
    }
    
    public void definirPago(){
        this.pago = true;
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
    
    public static void inicia() {
        try {
            consumosRegistrados = (int) Arquivo.getArquivo(Classe.CONSUMO);
        } catch (IOException ex) {
            consumosRegistrados = 0;
        } catch (ClassNotFoundException ex) {
            consumosRegistrados = 0;
        }
    }
    public static void encera() throws IOException{
        try {
            Arquivo.setArquivo(Classe.CONSUMO, consumosRegistrados);
        } catch (IOException ex) {
            Arquivo.iniciaArquivos(Classe.CONSUMO);
            encera();
        }
    }

}