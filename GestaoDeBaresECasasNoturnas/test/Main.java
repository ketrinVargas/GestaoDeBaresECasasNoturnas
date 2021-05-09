/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import model.Objetos.Cliente;
import model.Objetos.Consumo;
import model.Objetos.Produto;
import model.Listas.ListaClientes;
import model.Listas.ListaConsumo;
import model.Listas.ListaProduto;
import model.Enums.Categoria;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Enums.Classe;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Main {
    
       public static Cliente rafael;
       public static Cliente ketrin;
       public static Cliente marina;
       public static Consumo consumoRafael;
       public static Produto entradaCamarote;
       public static Produto entradaVip;
       public static Produto entradaPista;
       public static Consumo consumo;
       
       
       public static void main(String[] args) throws Exception{
           
           for(Classe c : Classe.values()){
               //Arquivo.iniciaArquivos(c);
           }
           
           ListaClientes.inicia();
           ListaConsumo.inicia();
           ListaProduto.inicia();
           Consumo.inicia();
           Produto.inicia();

           
           //////ENTRADA///////////
           entradaCamarote  = new Produto("Entrada camarote", 00, 0, 30);
           entradaCamarote.addQuantidade(100);
           entradaVip  = new Produto("Entrada vip", 00, 0, 200);
           entradaVip.addQuantidade(100);
           entradaPista  = new Produto("Entrada pista", 00, 0, 15);
           entradaPista.addQuantidade(100);
           ListaProduto.addProduto(entradaCamarote);
           ListaProduto.addProduto(entradaVip);
           ListaProduto.addProduto(entradaPista);
           
           //////////PRODUTOS//////////
           
           
           
           ////////////CLIENTES//////////
           rafael = new Cliente(7372951, Categoria.CAMAROTE, "Rafael", 1000);
           ketrin = new Cliente(7894561, Categoria.PISTA, "ketrin", 100);
           marina = new Cliente(1234567, Categoria.VIP, "marina", 10);
           ListaClientes.addCliente(rafael);
           ListaClientes.addCliente(marina);
           ListaClientes.addCliente(ketrin);
           rafael.credita(10000);
          
           
           //////////CONSUMO//////////////
           consumoRafael = new Consumo(7372951, false);
           ListaConsumo.addConsumo(consumoRafael);
  
           consumoRafael.addItem(1, 0);
           consumoRafael.atualizaTotal();
           
            consumo = ListaConsumo.consultarConsumo(7372951);
            consumo.atualizaTotal();
            float valorTotal  = consumo.getValorTotal();
            Cliente cliente =  ListaClientes.consultarCliente(7372951);
            cliente.debita(valorTotal);
            ListaConsumo.pagarConsumo(7372951);
            
            
           
            imprimeTudo();
            
            ListaClientes.encera();
            ListaConsumo.encera();
            ListaProduto.encera();
            Consumo.encera();
            Produto.encera();
           
       }
       
       
       public static void imprimeTudo() throws Exception{
           //System.out.println("");
           
           
           System.out.println("Clientes cadastrados:");
           System.out.println(rafael.toString());
           System.out.println("");
           System.out.println("Consumos cadastrados");
           System.out.println(ListaConsumo.mostrarConsumosAtivos());
           System.out.println("");
           System.out.println("Produtos cadastrados");
           System.out.println(entradaCamarote.toString(false));
           System.out.println("");
           System.out.println("Clientes ordenados pelo nome");
           System.out.println(ListaClientes.listarPorNome());
           System.out.println("");
           System.out.println("Clientes ordenados pela categoria");
           System.out.println(ListaClientes.listaPorCategoria());
           System.out.println("");
           System.out.println("Lista de Produtos ordenados pelo cod");
           System.out.println(ListaProduto.listarProdutoPorCodigo());
           System.out.println("");
           System.out.println("Lista de produtos consumidos ordenados pelo cod");
           System.out.println("");
           System.out.println("");
           System.out.println("Mostrar custo x lucro");
           System.out.println(ListaConsumo.mostrarCustoLucro());
       }
}

       
       
           
       
