/******************************************************************************

exercicio area triangulo

*******************************************************************************/
import java.util.Scanner;
public class Areatriangulo {
    public static void main (String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Double base, altura, area;
        
        System.out.println("Insira o valor da base: ");
        base = ler.nextDouble();
        System.out.println("Insira o valor da altura: ");
        altura = ler.nextDouble();
        
        
        area = (base + altura)/2;
        
        System.out.println("O valor da área é: " + area);
    }
}
