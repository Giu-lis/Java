/******************************************************************************

04

*******************************************************************************/
import java.util.Scanner;
public class bonus {
    public static void main (String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Double ano, salario, bonus1, bonus2;
        
        System.out.println("Entre com quantos anos que está na empresa: ");
        ano = ler.nextDouble();
        System.out.println("Entre com seu salário: ");
        salario = ler.nextDouble();
        
        bonus1 = (salario / 100)*20;
        
        bonus2 = (salario / 100)*10;
        
        if (ano>=5)
        System.out.println("Seu bônus é de " + bonus1);
        else 
        System.out.println("Seu bônus é de " + bonus2);
       
        
    }
    
}