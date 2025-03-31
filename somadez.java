/******************************************************************************

17

*******************************************************************************/
import java.util.Scanner;

public class somadez {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, soma = 0;
     
        
     
         for (int i = 1; i <=10; i++ ) {
             System.out.println("O" + i + "º número");
             n = ler.nextInt();
             soma += n;
         } 
        
         System.out.println("A soma de todos os números é: " + soma);
 
    }
}