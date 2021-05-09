/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.Listas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arquivo;
import model.Enums.Classe;
import model.Objetos.Cliente;
import model.Objetos.Produto;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class ListaProduto {
    
    private static List<Produto> listaProduto;
    private static List<Produto> ultimaLista;
    
     public static boolean addProduto(Produto produto){
        listaProduto.add(produto);
        return false;
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
    
    public static void inicia(){
        try {
            listaProduto = (List<Produto>) Arquivo.getArquivo(Classe.LISTA_PRODUTO);
        } catch (IOException ex) {
            listaProduto = new ArrayList();
        } catch (ClassNotFoundException ex) {
            listaProduto = new ArrayList();            
        }
    }
    
    public static void encera() throws IOException{
        try {
            Arquivo.setArquivo(Classe.LISTA_PRODUTO, listaProduto);
        } catch (IOException ex) {
            Arquivo.iniciaArquivos(Classe.LISTA_PRODUTO);
            encera();
        }
    }
    
        public static boolean remove(int cod){
       for (Produto m : listaProduto){
          if (cod == m.getCod()){
              listaProduto.remove(m);
              return true;
          }
       }
       return false;
    }

  
     public static boolean editar(int cod, Produto produtoNovo){
      boolean result = false;
      for (Produto m : listaProduto){
          if (cod == m.getCod()){
             int index = listaProduto.indexOf(m);
             listaProduto.set(index, produtoNovo);
             result = true;
         }
       }
      return result;
   }
     
     public static List<Produto> getLista(Object obj, String procura, Method metodo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
       ultimaLista = new ArrayList();
       for(Produto p : listaProduto){
           if (obj.getClass().isInstance(p)){
               if (procura==null){
                   ultimaLista.add(p);
               }else{
                   if (String.valueOf(metodo.invoke(p)).trim().toLowerCase().contains(procura.toLowerCase().trim())){
                       ultimaLista.add(p);
                   }
               }
           }
       }
       return ultimaLista;
   }
    
}
