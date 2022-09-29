package com.mycompany.teste999;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author m132854
 */
public class ManipuladorArquivo {
        public void gravar() throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter("C:\\Users\\m132854\\Documents\\Trabalhos//aula.txt"));
        String linha = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva Algo: ");
        linha = scanner.nextLine();
        buffWrite.append("/N" + linha);
        buffWrite.close();
        
    }
}
