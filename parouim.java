/******************************************************************************
06

*******************************************************************************/
import java.util.Scanner;
public class parouim {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, par, impar;
        
        System.out.println("Insira um número: ");
        numero = ler.nextInt();
        
        if (numero % 2 == 0)
        System.out.println("Esse número é par");
        else
        System.out.println("Esse número é ímpar");
        
    }
}