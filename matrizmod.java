/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class matrizmod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizori = new int[3][4];
        int[][] matrizmod = new int[3][4];

        System.out.println("Digite os elementos da matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizori[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrizmod[i][j] = matrizori[i][j];
                if (matrizmod[i][j] < 0) {
                    matrizmod[i][j] = 0;
                }
            }
        }

        System.out.println("\n--- Matriz Original ---");
        printMatriz(matrizori);

        System.out.println("\n--- Matriz Modificada (número negativos substituídos por 0) ---");
        printMatriz(matrizmod);

        scanner.close();
    }

    public static void printMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}