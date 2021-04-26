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
 * @author rafae
 */
public class ListaConsumo {
    
    private static final List<Consumo> listaConsumo= new ArrayList();
    
    public static void addConsumo(Consumo consumo){
        listaConsumo.add(consumo);
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

        //debitaValor
        ListaClientes.consultarCliente(rg).debita(valorConsumido);
        
        //remover consumo
        listaConsumo.remove(consumo);
    }
    
}
