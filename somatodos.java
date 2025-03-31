/******************************************************************************

15

*******************************************************************************/
import java.util.Scanner;

public class somatodos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
     
        for (int i = 0; i <=15; i++ ) {
            soma += i;
        }
        System.out.println("A soma de todos os número de um a quinze é " + soma);

 
    }
}