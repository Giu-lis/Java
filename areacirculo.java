/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class areacirculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    double  area, raio;

        System.out.println("Insira o raio do círculo:");
        raio= ler.nextDouble();
        area = (Math.PI)*(Math.pow(raio,2));
        System.out.println("A área de um círculo com raio " + raio + " é igual a " + area + " metros quadrados.");





    }
}