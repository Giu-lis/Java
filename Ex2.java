/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Ex2 {

    public static void main (String[] args) {
        int i;

        for (i = 1; i <= 100; i++) {
            if (i <= 50 && i % 2 == 0) { 
                System.out.println("Números pares de 1 a 50: - " + i);
            } else if (i > 50 && i % 2 != 0) { 
                System.out.println("Números ímpares de 51 a 100 - " + i);
            }
        }

        System.out.println();
        
    }
}