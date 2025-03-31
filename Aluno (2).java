/******************************************************************************

Exercicio de apresentar o nome do aluno, suas notas e mostrar se foi aprovado ou reprovado

*******************************************************************************/
import java.util.Scanner;
public class Aluno {
    public static void main (String[] args) {
    
    
    Scanner ler = new Scanner(System.in);
    String name;
    double nota1, nota2, nota3, media;
    
    System.out.println("Insira o nome do aluno: ");
    name = ler.nextLine();
    System.out.println("Insira a primeira nota: ");
    nota1 = ler.nextInt();
    System.out.println("Insira a segunda nota: ");
    nota2 = ler.nextInt();
    System.out.println("Insira a terceira nota: ");
    nota3 = ler.nextInt();
    
    media = (nota1 + nota2 + nota3)/3;
    
    
    if(media>=7)
    System.out.println("O(A) Aluno(a) " + (name) + " foi aprovado(a)!");
    else 
    System.out.println("O(A) Aluno(a) " + (name) + " foi reprovado(a)");
    
    }
    
}