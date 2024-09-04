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
public class Atv01 {
    public static void main(String[] args) {
        double nota;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Coloque aqui sua nota: ");
        nota = scan.nextDouble();
        
        if(nota>=6){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        
        if (nota<6 && nota>4){
            System.out.println("Precisa fazer substitutiva");
        }
        
        
    }
    
}
