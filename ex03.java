import java.util.ArrayList;
import java.util.Scanner;


public class ex03 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer>numeros = new ArrayList<Integer>();


        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);
        numeros.add(12);
        numeros.add(14);
        numeros.add(16);
        numeros.add(18);
        numeros.add(20);


        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i)%4 == 0) {
                numeros.remove(i);
            }


        } System.out.println(numeros);
    }
}
