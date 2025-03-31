/******************************************************************************
05
*******************************************************************************/
import java.util.Scanner;
public class emprestimo {
    public static void main (String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Double ve, s, p, lp;
        int np;
        
        System.out.println("Para o emprésimo ser aprovado, insira seu salário: ");
        s = ler.nextDouble();
        System.out.println("Insira o número de parcelas: ");
        np = ler.nextInt();
        System.out.println("Qual o valor do empréstimo: ");
        ve = ler.nextDouble();
        
        p = ve / np;
        lp = s * 0.30;
        
        if (p <= lp) {
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Empréstimo não aprovado");
        }
        
    }
}