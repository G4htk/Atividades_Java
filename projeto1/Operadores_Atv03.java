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
        
        System.out.println("Exemplos Operadores Aritm�ticos: ");
        System.out.println("Adi��o: " + (num1+num2));
        
        System.out.println("Subtra��o: " + (num1-num2));
        
        System.out.println("Divis�o: " + (num1/num2));
        
        System.out.println("Multiplica��o: " + (num1*num2));
        
        System.out.println("M�dulo ou Resto: " + (num1%num2));
        
        System.out.println("\n");
        
        System.out.println("Exemplos de Rela��es:");
        
        System.out.println("N�mero 1 maior ou igual que N�mero 2?");
        System.out.println((num1 >= num2));
        
        System.out.println("N�mero 1 menor ou igual que N�mero 2? ");      
        System.out.println((num1 <= num2));
        
        System.out.println("N�mero 1 igual N�mero 2?");
        System.out.println((num1 == num2));
        
        System.out.println("N�mero 1 diferente de N�mero 2? ");
        System.out.println((num1 != num2));
        
        System.out.println("Exemplos Operadores L�gicos: ");
        System.out.println("E: " + (num1>num2 && num1>0));
        
        System.out.println("OU: " + (num1>num2 || num1>20));
     
        
        System.out.print("Adicione seu nome: ");
        nome = scan.next();
        
        System.out.println(nome + " � um/a gostoso/a");
    }
}
