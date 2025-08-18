import java.util.ArrayList;
import java.util.Scanner;


public class ex05 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;


        System.out.println("Insira uma frase: ");
        frase = ler.nextLine();


        String[] palavras = frase.split(" ");


        ArrayList<String>frases = new ArrayList<String>();


        for(String palavra: palavras){
            frases.add(palavra);
        }


        System.out.println("A quantidade de palavras é: " + frases.size());


        for (String comecaA: frases){
            if (comecaA.startsWith("A")) {
                System.out.println("Palavras que começam com A: " + comecaA);
            } else if (comecaA.startsWith("a")) {
                System.out.println("Palavras que começas com a: " + comecaA);
            }
        }


    }
}

