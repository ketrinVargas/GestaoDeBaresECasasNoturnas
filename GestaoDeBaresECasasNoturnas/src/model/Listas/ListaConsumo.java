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
import java.util.List;
import model.Arquivo;
import model.Enums.Classe;
import model.Objetos.Consumo;
import model.Objetos.Produto;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class ListaConsumo {
    
    private static List<Consumo> listaConsumo;
    private static List<Consumo> ultimaLista;
    
    public static boolean addConsumo(Consumo consumo) throws Exception{
        if(consumo.equals(null)){
            throw new  Exception ("Objeto nullo");
        }else{
            
           listaConsumo.add(consumo);
        }
        return false;
        
    }
    
    /**
     *
     * @param rgdo cliente
     * @return Consumo do cliente
     * @throws Exception consumo não encontrado
     */
    public static Consumo consultarConsumo(int rg) throws Exception{
        for(Consumo c : listaConsumo){
            if (!c.foiPago() && c.getRg() == rg){
                return c;
            }
        }
        throw new Exception ("Nenhum consumo encontrado");
    }
    
    public static  boolean pagarConsumo(int rg) throws Exception {
        //pegar o consumo     
        Consumo consumo = consultarConsumo(rg);
        
        //pegar o valor do consumo
        float valorConsumido = consumo.getValorTotal();

        consumo.definirPago();
        return false;
    }
    
    public static List<String> mostrarCustoLucro() throws Exception{
        int[] produtoQuantidade = new int[1000];
        for (Consumo c : listaConsumo){
            int[] produtoQ = c.getProdutoQuantidade();
            for(int i=0; i< produtoQ.length; i++){
                produtoQuantidade[i] =+ produtoQ[i];
            }
        }
        float custoTotal = 0;
        float lucroTotal = 0;
        List<String> relatorio = new ArrayList();
        for( int i = 0;i < ListaProduto.getTamanho(); i++){
            Produto p = ListaProduto.consultarProduto(i);
            custoTotal += (p.getPrecoCusto()*produtoQuantidade[i]);
            lucroTotal += (p.getPrecoVenda()*produtoQuantidade[i]);
            relatorio.add(produtoQuantidade[i] + p.toString(false) + "\n");
        }
        relatorio.add("Custo: " + custoTotal + "\n");
        relatorio.add("FaturamentoTotal: " + lucroTotal + "\n");
        relatorio.add("Lucro Total: " + (lucroTotal - custoTotal) + "\n");
        return relatorio;
    }
    
    public static List<String> mostrarConsumosAtivos(){
        List<String> listaFinal = new ArrayList();
        for(Consumo c : listaConsumo){
            if(!c.foiPago()){
                listaFinal.add(c.toString());
            }
        }
        return listaFinal;
    }    
    
    public static void inicia(){
        try {
            listaConsumo = (List<Consumo>) Arquivo.getArquivo(Classe.LISTA_CONSUMO);
        } catch (IOException ex) {
            listaConsumo = new ArrayList();
        } catch (ClassNotFoundException ex) {
            listaConsumo = new ArrayList();            
        }
    }
    
    public static void encera() throws IOException{
        try {
            Arquivo.setArquivo(Classe.LISTA_CONSUMO, listaConsumo);
        } catch (IOException ex) {
            Arquivo.iniciaArquivos(Classe.LISTA_CONSUMO);
            encera();
        }
    }
    
    public static List<Consumo> getLista(Object obj, String procura, Method metodo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
       ultimaLista = new ArrayList();
       for(Consumo m : listaConsumo){
           if (obj.getClass().isInstance(m)){
               if (procura==null){
                   ultimaLista.add(m);
               }else{
                   if (String.valueOf(metodo.invoke(m)).trim().toLowerCase().contains(procura.toLowerCase().trim())){
                       ultimaLista.add(m);
                   }
               }
           }
       }
       return ultimaLista;
   }
    

   
}
