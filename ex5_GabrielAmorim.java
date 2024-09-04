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
public class Atv05 {
   public static void main(String[]args) {
    double numero;
    Scanner scan = new Scanner (System.in);
    
       System.out.println("Insira o número aqui: ");
       numero = scan.nextDouble();
       
       if (numero % 2 == 0) {
           System.out.println("Número é par");
       }
       else { System.out.println("Número é impar.");
       }
   }
    
}
