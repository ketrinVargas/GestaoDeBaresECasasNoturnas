/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enums;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public enum Classe {
    LISTA_CLIENTE("ListaClientes"),
    LISTA_CONSUMO("ListaConsumo"), 
    LISTA_PRODUTO("ListaProduto"),
    CONSUMO("Consumo"),
    PRODUTO("Produto");
    
    
    public String texto;
    Classe(String nome){
        this.texto = nome;
    }
    
}
