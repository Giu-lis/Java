/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Ex1 {

    public static void main (String[] args) {
        int i = 1;

        while (i <= 100) {
            if (i <= 50 && i % 2 == 0) {
                System.out.println("Números pares - " + i);
            } else if (i > 50 && i % 2 != 0) {
                System.out.println("Números ímpares - " + i);
            }

            i++;
        }

        System.out.println();
    }
}