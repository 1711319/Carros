/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.*;
import java.util.*;

public class Carro_Class {
    
    String marca; //String da Marca
    String modelo; //String do Modelo
    String cor; //String da Cor
    int vel_maxima; // Velocidade Maxima [Inteiro]
    int velocidade; // Velocidade [Inteiro]
    int ano; //Ano [Inteiro]
    //Estas Variáveis são para testes na apçlicação
    String marca_teste="Mercedes"; //Marca de teste
    String modelo_teste="G43"; //Modelo de teste
    String cor_teste="Black"; // Cor de Teste
    int ano_teste=2020;// Ano de teste
    int vel_maxima_teste=200; // Vewlocidade Maxima de teste
    
    public void acelerar(){velocidade++;}
    
    public int obterVelocidade(){return velocidade;}
    
    public void travar(){velocidade--;}
         
    public String obterMarca(){return marca;}     
     
    public String obterModelo(){return modelo;}     
    
    public int obterAno(){return ano;}
    
    public String obterCor(){return cor;}  
    
    public int obterVelMAax(){return vel_maxima;}
    
    public String obterMarcaTeste(){return marca_teste;}     
     
    public String obterModeloTeste(){return modelo_teste;}     

    public String obterCorTeste(){return cor_teste;}  
    
    public int obterVelMaxTeste(){return vel_maxima_teste;}
    
    public int obterAnoTeste(){return ano_teste;}  
    
    public void inserirDados(String marca, String modelo, String cor, int velMaxima, int velocidade, int ano, String caminho) {
        try (PrintWriter escritor = new PrintWriter(new FileWriter(caminho, true))) {
            escritor.println(marca + ";" + modelo + ";" + cor + ";" + velMaxima + ";" + velocidade + ";" + ano);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    
    public static List<String[]> lerDados(String arquivo) {
        List<String[]> dados = new ArrayList<>();
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");
                dados.add(campos);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo: " + e.getMessage());
        }
        return dados;
    }
    
}
