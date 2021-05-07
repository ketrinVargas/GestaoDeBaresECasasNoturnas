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
 * @author rafael
 */
public class ListaProduto {
    
    private static List<Produto> listaProduto = new ArrayList();
    
    public static void addProduto(Produto produto){
        listaProduto.add(produto);
    }
    
    public static Produto consultarProduto(int cod) throws Exception{
        for(Produto p : listaProduto){
            if (p.getCod() == cod){
                return p;
            }
        }
        throw new Exception ("Produto não encontrado");
    }
    
    public static List<String> listarProdutoPorCodigo(){
        List<String> lista = new ArrayList();
        Collections.sort(listaProduto, Comparator.comparing(Produto::getCod));
        for (Produto p : listaProduto){
            lista.add(p.toString(false) + "\n");
        }
        return lista;
    }
    
    public static int getTamanho(){
        return listaProduto.size();
    }
    
}
