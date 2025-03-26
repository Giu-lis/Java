/*
  Segundo Programa em Java
  Desenvolva um programa que calcule a soma de dois números

*/

import java.util.Scanner; // Ler as entradas do teclado
public class Soma
{
	public static void main(String[] args) {
	    double a, b, soma; // Declarar variáveis
	    Scanner ler = new Scanner(System.in);
	    
	    // Entrada de dados
	    System.out.println("Informe o primeiro valor: ");
	    a = ler.nextDouble();
	    
	    System.out.println("Informe o segundo número: ");
	    b = ler.nextDouble();
	    
	    // Processamento
	    soma = a + b;
	    
	    // Saída
	    System.out.println("O resultado é: " + soma);
	    
	}
}