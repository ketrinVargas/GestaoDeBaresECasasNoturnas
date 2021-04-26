/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author rafae
 */
public class ListaProdutoConsumido {
    
    private static List<Item> listaProdutoConsumido = new ArrayList();
    
    public static void addItem(Item item){
        listaProdutoConsumido.add(item);
    }
    
    public static List<String> listarProdutoPorCodigo(){
        List<String> lista = new ArrayList();
        Collections.sort(listaProdutoConsumido, Comparator.comparing(Item::getCodProduto));
        for (Item i : listaProdutoConsumido){
            lista.add(i.toString());
        }
        return lista;
    }
    
}
