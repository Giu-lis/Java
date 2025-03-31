/******************************************************************************

19

*******************************************************************************/
import java.util.Scanner;

public class nomeidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome, nomemenor="";
        int idade = 0, idade1=200;
            
             
          
         for (int i = 1; i <=10; i++) {
             System.out.println("Entre com o nome da " + i + " ª pessoa");
             nome = ler.nextLine(); 
             System.out.println("Entre com a idade da " + i + " ª pessoa");
             idade = ler.nextInt();
             ler.nextLine();
             if (idade < idade1) {
                 idade1 = idade;
                 nomemenor = nome;
             }
         }
           System.out.println("A pessoa mais nova é " + nomemenor);
           System.out.println("Ela tem " + idade1);
    }
}