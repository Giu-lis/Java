/******************************************************************************
Faça um algoritmo que leia 10 números inteiros e, ao final, escreva quantos estão entre 0 e 100.
*******************************************************************************/
import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        
        System.out.println("Digite 10 números: ");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o" + i + "º número: ");
            num = scanner.nextInt();
            
        if (num > 0 && num <= 100) {
                System.out.println("O número " + num + "º está entre 0 e 100");
        } else {
            System.out.println("Esse número não está entre 0 e 100");
        }

        }
        
        
        scanner.close();
    }
}