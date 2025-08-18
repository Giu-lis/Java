import java.util.Scanner;
public class ObjetoConvenio {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Convenio c1 = new Convenio();

        System.out.println("Quantas fichas deseja fazer?");
        int ficha = ler.nextInt();

        ler.nextLine();

        System.out.println("Qual o nome do convênio?");
        c1.setNome(ler.nextLine());
        System.out.println("Qual o nome do plano?");
        c1.setPlano(ler.nextLine());
        System.out.println("Qual o valor do plano?");
        c1.setTarifa(ler.nextDouble());

        ler.nextLine();

        System.out.println("---FICHA---");
        System.out.println(c1.getNome());
        System.out.println(c1.getPlano());
        System.out.println(c1.getTarifa());
    }
}
