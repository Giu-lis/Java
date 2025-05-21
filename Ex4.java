/******************************************************************************
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize for.

*******************************************************************************/
import java.util.Scanner;

public class Ex4 {

    public static void main (String[] args) {
        int i;
        int resultado;
        int num;
        Scanner ler;

        ler = new Scanner(System.in);

        System.out.print("Digite o número: ");
        num = ler.nextInt();

        for (i = 0; i <= 10; i++) { 
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

        ler.close();
    }
}