/******************************************************************************
4. Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
*******************************************************************************/
import java.util.Scanner;
public class Ex4
{
	public static void main(String[] args) {
	    int linha =3, coluna =3;
		int [][] matriz = {
		    
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		    
		};
		
		
		ij(matriz);
		
		int[][] transposta = new int [coluna][linha];
		for (int i = 0; i < linha; i++) {
		    for (int j = 0; j < coluna; j++) {
		        transposta[j][i] = matriz [i][j];
		    }
		}
		
		ij(transposta);
	 }
	 
	 public static void ij(int[][] matriz){
	     System.out.println("A matriz é: ");
	     for (int[]linha : matriz){
	         for (int coluna : linha){
	             System.out.print(coluna + " ");
	         }
	         
	        System.out.println();
	     }
	 }
}

