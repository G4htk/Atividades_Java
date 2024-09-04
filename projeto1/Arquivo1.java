
import java.util.Scanner;

/**
 *
 * @author 60000723
 */
public class Arquivo1 {
    public static void main(String[] args) {
        String nome;
        System.out.print("Ola Mundo!");
        System.out.println("Ola Mundo!");
        System.out.print("\n");
        System.out.print("apos o println.");
        System.out.println("println = joga o cursor para  a linha de baixo");
        System.out.print("\n");
        nome = "Fernando Boleto";
        int idade;
        idade = 34;
        int idade1;
         idade1 = 17;
        double altura;
        altura = 1.80; 
        String ola;
        ola = "Bom dia";
        boolean yn;
       yn = false;
       char letra;
       letra = 'F';
       Scanner scan = new Scanner(System.in); //Cria um objeto Scanner e instancia-lo.
    System.out.print("Informe seu nome: ");
    nome = scan.next();
        
        
       
                System.out.println("Ola " + nome + " de idade " + idade1 +" anos");
                System.out.println("\n");
                nome = "Julia Montada";
                System.out.println("Ola " + nome + " idade " + idade +" anos " + altura +" metros" );
                System.out.print("\n");
                System.out.println(ola + nome + " idade sendo " + idade1 + " essa informação está correta?");
                System.out.print(yn);
                System.out.print("Letra favorita = " + letra);
    }    
    
}
