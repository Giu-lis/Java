import java.util.Scanner;

public class ObjetoCadeira {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Cadeira c1 = new Cadeira();

        for (int i = 0; i < 3; i++) {

            System.out.println("Insira o tipo da cadeira: ");
            c1.setTipo(ler.nextLine());
            System.out.println("Insira a cor da cadeira: ");
            c1.setCor(ler.nextLine());
            System.out.println("Insira o material da cadeira: ");
            c1.setMaterial(ler.nextLine());
            System.out.println("Insira a marca da cadeira: ");
            c1.setMarca(ler.nextLine());
            System.out.println("Insira a quantidade de pés da cadeira: ");
            c1.setQtdDePes(ler.nextInt());
            ler.nextLine();

            System.out.println("---CADEIRA---");
            System.out.println(c1.getTipo());
            System.out.println(c1.getCor());
            System.out.println(c1.getMaterial());
            System.out.println(c1.getMarca());
            System.out.println(c1.getQtdDePes());
        }
    }
}
