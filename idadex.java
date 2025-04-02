/******************************************************************************
22
Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
*******************************************************************************/
import java.util.Scanner;
public class idadex {
        public static void main (String [] args) {
            Scanner ler = new Scanner (System.in);
            int idade = 0, qtdIdade = 0, qtdIdadeM = 0, qtdIdadeH = 0;
            int mulheres = 0, homens = 0;
            double mediaIdade, mediaIdadeM, mediaIdadeH;
            String sexo = "";
            char f, m;
            
            for (int i = 1; i <=7; i++){
             System.out.println("Entre com o sexo da " + i + "ª pessoa | F = feminino e M = masculino");
             sexo = ler.nextLine();
             System.out.println("Entre com a idade da " + i + "ª pessoa");
             idade = ler.nextInt();
             ler.nextLine();
             
             qtdIdade +=idade;
             
             if (sexo.equals("f") ) {
                 qtdIdadeM +=idade;
                 mulheres ++;
             } else if (sexo.equals("m")) {
                 qtdIdadeH +=idade;
                 homens ++;
             }

        }    
        mediaIdade = qtdIdade / 7;
        mediaIdadeM = qtdIdadeM / mulheres;
        mediaIdadeH = qtdIdadeH / homens;
        
        System.out.println("A média das idade gerais é " + mediaIdade);
        System.out.println("A média da idade feminina é " + mediaIdadeM);
        System.out.println("A média da idade masculina é " + mediaIdadeH);
    }
        
}