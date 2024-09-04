
package projeto1;

import java.util.Scanner;

/**
 *
 * @author 60000723
 */
public class exer01 {
    public static void main (String[] args) {
        String nome;
        int idade;
        Double tamanho;
        boolean sn;
        char camisa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe suas informações.");
        System.out.println("Nome: ");
        nome = scan.next();
        System.out.print("\n");
        System.out.println("Idade: ");
        idade = scan.nextInt();
        System.out.println("\n");
        System.out.println("Altura: ");
        tamanho = scan.nextDouble();
        System.out.println("\n");
        System.out.print("Solteiro: ");
        sn = scan.nextBoolean();
        System.out.println("\n");
        System.out.println("Camisa P, M ou G: ");
        camisa = scan.next().charAt(0);        
    }
}
