import java.util.ArrayList;
import java.util.Scanner;


public class ex07 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer>numeros = new ArrayList<Integer>();
        int maior = 0, menor = Integer.MAX_VALUE, menosUm = -1;
        int numero;


        do {
            System.out.println("Insira números: ");
            numero = ler.nextInt ();


            if (numero != menosUm){
                numeros.add(numero);
            }


            if (numero < menor){
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }


        }
        while (numero != menosUm);


        System.out.println(menor + " " + maior);
    }
}
