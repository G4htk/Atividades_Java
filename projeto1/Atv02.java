/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto1;
import java.util.Scanner;

/**
 *
 * @author 60000723
 */
public class Atv02 {
    public static void main(String[] args){
        String nome, genero, cor;
        int idade;
        boolean esporte;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, informe seu: \n");
        
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.print("\n");
        
        System.out.println("Gênero: ");
        genero = scan.next();
        System.out.print("\n");
        
        System.out.println("Cor favorita: ");
        cor = scan.next();
        System.out.print("\n");
        
        System.out.println("Idade");
        idade = scan.nextInt();
        System.out.print("\n");
        
        System.out.println("Pratica esportes?  ");
        esporte = scan.nextBoolean();
    }
    
}
