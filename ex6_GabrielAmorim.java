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
public class Atv06 {
    public static void main(String []args) {
        double numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número: ");
        numero = scan.nextInt();
        System.out.println("Elevado a 2");
        System.out.print(Math.pow(numero, 2));
        
         System.out.println("\nElevado a 4");
         System.out.print(Math.pow(numero, 4));
         
          System.out.println("\nElevado a 6");
          System.out.print(Math.pow(numero, 6));
          
           System.out.println("\nElevado a 8");
           System.out.print(Math.pow(numero, 8));
           
            System.out.println("\nElevado a 10");
            System.out.print(Math.pow(numero, 10));
        
        
    }
    
}
