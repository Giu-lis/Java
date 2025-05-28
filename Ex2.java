/******************************************************************************
Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*******************************************************************************/
import java.util.Scanner;
public class Ex2
{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int matriz [] []  = new int [3] [3];
		int somac1 = 0;
		int somac2 = 0;
		int somac3 = 0;
		
		System.out.println("Digite os elementos da matriz 3x3: ");
		
		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz[i].length; j++) {
		        System.out.print("Elemento [" + i + "] [" + j + "]: ");
		        matriz[i][j] = ler.nextInt();
		    }
		    
		    somac1 += matriz[i][0];
		    somac2 += matriz[i][1];
		    somac3 += matriz[i][2];
		}
		
		
		System.out.println("A soma da coluna 1 é: " + somac1);
		System.out.println("A soma da coluna 2 é: " + somac2);
		System.out.println("A soma da coluna 3 é: " + somac3);
		

	}
}