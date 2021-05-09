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
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.Arquivo;
import model.Enums.Classe;
import model.Objetos.Cliente;
import model.Objetos.Consumo;


/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class ListaClientes {

    private static List<Cliente> listaCliente;
    private static List<Cliente> ultimaLista;
    
     public static boolean addCliente(Cliente cliente){
        listaCliente.add(cliente);
        return false;
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
        Collections.sort(listaCliente, Comparator.comparing(Cliente::getCategoria));
        for (Cliente c : listaCliente){
            lista.add(c.toString() +"\n");
        }
        return lista;
    }
    
    public static void inicia(){
        try {
            listaCliente = (List<Cliente>) Arquivo.getArquivo(Classe.LISTA_CLIENTE);
        } catch (IOException ex) {
            listaCliente = new ArrayList();
        } catch (ClassNotFoundException ex) {
            listaCliente = new ArrayList();            
        }
    }
    
    public static void encera() throws IOException{
        try {
            Arquivo.setArquivo(Classe.LISTA_CLIENTE, listaCliente);
        } catch (IOException ex) {
            Arquivo.iniciaArquivos(Classe.LISTA_CLIENTE);
            encera();
        }
    }

       public static boolean remove(int rg){
       for (Cliente m : listaCliente){
          if (rg == m.getRG()){
              listaCliente.remove(m);
              return true;
          }
       }
       return false;
    }

  
     public static boolean editar(int rg, Cliente clienteNovo){
      boolean result = false;
      for (Cliente m : listaCliente){
          if (rg == m.getRG()){
             int index = listaCliente.indexOf(m);
             listaCliente.set(index, clienteNovo);
             result = true;
         }
       }
      return result;
   }
     
     public static List<Cliente> getLista(Object obj, String procura, Method metodo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
       ultimaLista = new ArrayList();
       for(Cliente m : listaCliente){
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
