import java.util.Scanner;
public class ObjetoAviao {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Aviao av1 = new Aviao();


        for (int i = 0; i < 3; i++) {

            System.out.println("Insira o tipo do avião: ");
            av1.setTipo(ler.nextLine());
            System.out.println("Insira a cor do avião: ");
            av1.setCor(ler.nextLine());
            System.out.println("Insira a velocidade do avião por hora:");
            av1.setVelocidade(ler.nextInt());
            System.out.println("Insira a quantidade de assentos: ");
            av1.setQtdDeAssento(ler.nextInt());
            ler.nextLine();

            System.out.println("---AVIÃO---");
            System.out.println(av1.getTipo());
            System.out.println(av1.getCor());
            System.out.println(av1.getVelocidade());
            System.out.println(av1.getQtdDeAssunto());


        }





    }
}
