/******************************************************************************
Exercicio 001
Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

*******************************************************************************/
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.println("Insira um número: ");
        num = ler.nextInt();
        
        System.out.println("O número informado foi: " + num);
        
    }
}