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
public class Atv10 {
    public static void main(String []args){
        int num;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        num = scan.nextInt();
        
        if(num > 10 && num < 100){
            System.out.printf("Ele elevado a 2 é: %.5f ", Math.pow(num, 2));
        }
        else {
            System.out.printf("Raiz Quadrada dele é: %.5f", Math.sqrt(num));
        }
    }
    
}
