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
public class Atv07 {
    public static void main(String []args){
        int num1, num2;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe dois números: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        System.out.println("\n Resultado das seguintes equações:");
        
        System.out.println("Maior que: " + (num1 > num2));
        System.out.println("\nMenor que: " + (num1 < num2));
        System.out.println("\nIguais: " + (num1 == num2));
        System.out.println("\nDiferentes: " + (num1 != num2));
    }
    
}
