/******************************************************************************
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número utilizando um laço de repetição. Utilize while.
*******************************************************************************/
import java.util.Scanner;
public class Ex3 {

    public static void main (String[] args) {
        int i;
        int resultado;
        int num;
        Scanner ler;

        i = 1;

        ler = new Scanner(System.in);

        System.out.print("Digite o número: ");
        num = ler.nextInt();

        while (i <= 10) {
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
            i++;
        }

    }
}