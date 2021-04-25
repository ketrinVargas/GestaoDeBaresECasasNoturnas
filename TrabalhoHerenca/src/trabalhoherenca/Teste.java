/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoherenca;

import static java.time.Clock.system;
import java.util.Scanner;

public class Teste {

        public static void main(String[] args) {
            Fornecedor fornecedor = null;
            fornecedor.setNome(" Fornecedor 1");
            fornecedor.setEndereco(" Rua nota 10");
            fornecedor.setTelefone("3333-3333");
            
            System.out.println("Nome :" + fornecedor.getNome());
            System.out.println("Enederco :" +fornecedor.getEndereco());
            System.out.println("Telefone :" +fornecedor.getTelefone());
     
            System.out.printf("Insira o valor do seu credito e dividas respectivamentes");
            Scanner vc = new Scanner(System.in);
            float valorC = vc.nextFloat();
            Scanner vd = new Scanner(System.in);
            float valorD = vd.nextFloat();
             
            System.out.println("Seu Saldo :" + fornecedor.obterSaldo(valorC, valorD));
    }
    
}
