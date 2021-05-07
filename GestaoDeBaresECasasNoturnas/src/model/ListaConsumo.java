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
 * @author rafael
 */
public class ListaConsumo {
    
    private static final List<Consumo> listaConsumo= new ArrayList();
    
    public static void addConsumo(Consumo consumo) throws Exception{
        if(consumo.equals(null)){
            throw new  Exception ("Objeto nullo");
        }else{
            
           listaConsumo.add(consumo);
        }
        
    }
    
    /**
     *
     * @param rgdo cliente
     * @return Consumo do cliente
     * @throws Exception consumo não encontrado
     */
    public static Consumo consultarConsumo(int rg) throws Exception{
        for(Consumo c : listaConsumo){
            if (c.getRg() == rg){
                return c;
            }
        }
        throw new Exception ("Nenhum consumo encontrado");
    }
    
    public static  void pagarConsumo(int rg) throws Exception {
        //pegar o consumo     
        Consumo consumo = consultarConsumo(rg);
        
        //pegar o valor do consumo
        float valorConsumido = consumo.getValorTotal();

        //remover consumo
        listaConsumo.remove(consumo);
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
            listaFinal.add(c.toString());
        }
        return listaFinal;
    }
    
}
