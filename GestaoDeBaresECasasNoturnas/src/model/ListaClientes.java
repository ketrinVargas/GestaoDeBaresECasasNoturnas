/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author rafael
 */
public class ListaClientes {

    private static final List<Cliente> listaCliente= new ArrayList();
    
    public static void addCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public static Cliente consultarCliente(int rg) throws Exception {
        for (Cliente cliente : listaCliente) {
            if (cliente.getRG() ==rg) {
                return cliente;
            }
        }
        throw new Exception ("Nenhum cliente encontrado com o respectivo rg");
    }

    public static List<String> listarPorNome(){
        List<String> lista = new ArrayList();
        Collections.sort(listaCliente, Comparator.comparing(Cliente::getNomeCaixaBaixa));
        for (Cliente c : listaCliente){
            lista.add(c.toString() + "\n");
        }
        return lista;
    }
    
    public static List<String> listaPorCategoria(){
        List<String> lista = new ArrayList();
        //Collections.sort(listaCliente, Comparator.comparing(Cliente::getCategoria));
        for (Cliente c : listaCliente){
            lista.add(c.toString() +"\n");
        }
        return lista;
    }
    
}
