/******************************************************************************

18

*******************************************************************************/
import java.util.Scanner;

public class somaidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, soma = 0, maior = 0;
        double media = 0; 
     
        
     
         for (int i = 1; i <=20; i++ ) {
             System.out.println("A " + i + "ª idade");
             n = ler.nextInt();
             soma += n;
             media = soma/20;
             if ( n>=18) {
                 maior ++;
             }
         } 
         
        
         System.out.println("A soma de todas as idade é: " + soma);
         System.out.println(" A média da soma das idade é: " + media);
         System.out.println("Os maiores de idade são: " + maior);
 
    }
}