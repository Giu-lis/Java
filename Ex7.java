/******************************************************************************
Leia a idade de cinco pessoas e exiba a soma e a média das idades. 

*******************************************************************************/
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0; 
        int numeroPessoas = 5; 

        System.out.println("Digite a idade de cinco pessoas: ");

        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt(); 
            somaIdades += idade;
        }

        double mediaIdades = somaIdades / numeroPessoas;
        System.out.println("\n   Resultados   ");
        System.out.println("Soma das idades: " + somaIdades);
        System.out.println("Média das idades: " + mediaIdades);

        scanner.close();
    }
}