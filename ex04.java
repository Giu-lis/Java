import java.util.ArrayList;
import java.util.Scanner;


public class ex04 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Double>notas = new ArrayList<Double>();
        double soma = 0;
        double media;
        double acimaDaMedia = 0;


        System.out.println("Quantas provas foram realizadas? ");
        int provas = ler.nextInt();


        for (int i = 0; i < provas; i++) {
            System.out.println("Insira a nota das provas: ");
            notas.add(ler.nextDouble());
            soma += notas.get(i);
        }


        media = soma/provas;


        for (int i = 0; i < provas; i++) {
            if (notas.get(i) > 7); {
                acimaDaMedia++;
            }
        }


        System.out.println(media);
        System.out.println(acimaDaMedia);


    }
}
