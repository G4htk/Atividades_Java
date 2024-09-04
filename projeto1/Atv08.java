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
public class Atv08 {
    public static void main(String []args){
    double leitura_in, leitura_fin, consumo, media;
    int dias;
    Scanner scan = new Scanner(System.in);
    
            System.out.println("Agua: ");
            System.out.println("Leitura Inicial: ");
            leitura_in = scan.nextDouble();
            
            System.out.println("Leitura Final: ");
            leitura_fin = scan.nextDouble();
            
            consumo = (leitura_fin - leitura_in);
            dias = 30;
            media = (consumo / dias);
            
            System.out.println("Relatório de consumo: ");
            System.out.println("Consumo: " + consumo + " \nMédia diária:" + media);
            
            
}
    
}
