import java.util.ArrayList;
import java.util.Scanner;


public class ex08 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer>preco = new ArrayList<Integer>();
        ArrayList<String>produto = new ArrayList<String>();
        ArrayList<Integer>maiorQue = new ArrayList<Integer>();
        ArrayList<String>produtoMaior = new ArrayList<String>();


        System.out.println("Quantos produtos você vai verificar? ");
        int verificar = ler.nextInt();




        ler.nextLine();
        for (int i = 0; i < verificar; i ++) {
            System.out.println("Qual o nome do produto? ");
            produto.add(ler.nextLine());


            System.out.println("Qual o valor do produto?");
            preco.add(ler.nextInt());


            ler.nextLine();
        }


        for (int i = 0; i < verificar; i++) {
            if (preco.get(i) > 50) {
                maiorQue.add(preco.get(i));
                produtoMaior.add(produto.get(i));
            }
        }
        System.out.println(maiorQue);
        System.out.println(produtoMaior);
    }
}
