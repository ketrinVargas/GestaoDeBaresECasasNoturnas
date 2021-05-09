/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.Enums.Classe;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class Arquivo {
    
    private static String pasta = "C:\\Users\\rafae\\Documents\\Faculdade\\SEGUNDO_SEMESTRE\\POO\\TP3\\";
    private static String extensao =".txt";
    
    public static void iniciaArquivos(Classe classe) throws IOException{
        File a = new File(pasta+classe+extensao);  
        if (!a.exists()) {
            a.createNewFile();
        }
    }
    
    public static Object getArquivo(Classe classe) throws FileNotFoundException, IOException, ClassNotFoundException{
        File a = new File(pasta+classe+extensao);
        ObjectInputStream entrada = new ObjectInputStream( new FileInputStream(a));
        Object obj = entrada.readObject();
        entrada.close();
        return obj;
    }
    
    public static void setArquivo(Classe classe, Object objeto) throws FileNotFoundException, IOException{
        File a = new File(pasta+classe+extensao);
        ObjectOutputStream saida = new ObjectOutputStream( new FileOutputStream(a));
        saida.writeObject(objeto);
        saida.close();
    }
}
