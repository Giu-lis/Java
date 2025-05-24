/******************************************************************************
Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores que 10.

*******************************************************************************/
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("Digite 20 números: ");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o" + i + "º número: ");
            num = scanner.nextInt();
            
        if (num > 10) {
                System.out.println("O número " + num + "º é maior que dez");
            }

        }
        
        
        scanner.close();
    }
}