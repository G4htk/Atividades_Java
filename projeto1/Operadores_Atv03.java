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
public class Operadores_Atv03 {
    public static void main(String args[]){
        int num1, num2;
        String nome;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe num1: ");
            num1 = scan.nextInt();
        System.out.println("Informe num2: ");
            num2 = scan.nextInt();
        
        System.out.println("Exemplos Operadores Aritméticos: ");
        System.out.println("Adição: " + (num1+num2));
        
        System.out.println("Subtração: " + (num1-num2));
        
        System.out.println("Divisão: " + (num1/num2));
        
        System.out.println("Multiplicação: " + (num1*num2));
        
        System.out.println("Módulo ou Resto: " + (num1%num2));
        
        System.out.println("\n");
        
        System.out.println("Exemplos de Relações:");
        
        System.out.println("Némero 1 maior ou igual que Número 2?");
        System.out.println((num1 >= num2));
        
        System.out.println("Número 1 menor ou igual que Número 2? ");      
        System.out.println((num1 <= num2));
        
        System.out.println("Número 1 igual Número 2?");
        System.out.println((num1 == num2));
        
        System.out.println("Número 1 diferente de Número 2? ");
        System.out.println((num1 != num2));
        
        System.out.println("Exemplos Operadores Lógicos: ");
        System.out.println("E: " + (num1>num2 && num1>0));
        
        System.out.println("OU: " + (num1>num2 || num1>20));
     
        
        System.out.print("Adicione seu nome: ");
        nome = scan.next();
        
        System.out.println(nome + " é um/a gostoso/a");
    }
}
