/******************************************************************************
Execute um programa que recoheça quem é maior de idade

*******************************************************************************/
import java.util.Scanner;
public class idade {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade; 
        
        System.out.println("Insira a idade aqui: ");
        idade = ler.nextInt();
        
        if (idade>=18)
        System.out.println("Você é maior de idade");
        else 
        System.out.println("Você não é maior de idade");
    }
}