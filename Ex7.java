/******************************************************************************
Escreva um programa que calcule e exiba o valor da potência de um número informado pelo usuário elevado a um expoente também
informado pelo usuário, utilizando laços de repetição. Dica: Inicie a variável resultado com o valor 1.
Ex:
Base: 2
Expoente:7 
Resultado:128
*******************************************************************************/
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        int resultado;
        int base;
        int expoente;
        Scanner ler;

        resultado = 1;

        ler = new Scanner(System.in);

        System.out.println("Digie uma base: ");
        base = ler.nextInt();

        System.out.println("Digite um expoente: ");
        expoente = ler.nextInt();

        for (int i = 1; i <= expoente; i++) { 
            resultado = resultado * base; 
        }

        System.out.println("O resultado é: " + resultado);
    }
}