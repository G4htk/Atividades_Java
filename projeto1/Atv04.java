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
public class Atv04 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Informe os n�meros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        
        if(num1 > num2) {
            System.out.println("N�mero 1 � maior");
        }
        
        else if(num1 < num2){
            System.out.println("N�mero 2 � maior");
        }
        
        else{
            System.out.println("S�o iguais");
        }
        
        
    }
    
}
