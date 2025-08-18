import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;


public class ex06 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        Random random = new Random();


        for (int i = 0; i < 10; i++){
            int numerosAleatorios = random.nextInt(100);
            numeros.add(numerosAleatorios);
        }
        Collections.sort(numeros);
        for (int valores: numeros){
            System.out.println(valores + " ");
        }


    }
}
