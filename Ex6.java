/******************************************************************************
Faça um programa que calcule e exiba a soma dos números pares de 1 a 100 utilizando um laço de repetição. Utilize for
*******************************************************************************/
public class Ex6 {

    public static void main (String[] args) {
        int soma;
        int i;

        soma = 0;
        i = 1;

        for(i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                soma+=i;
            }
            i++;
        }

        System.out.println("O valor da soma dos números pares de 1 a 100 é: " + soma);

    }
}