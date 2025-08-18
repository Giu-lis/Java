import java.util.ArrayList;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> listaDeTarefas = new ArrayList<String>();
        int escolha;

        do {
            System.out.println("1.Ver a lista");
            System.out.println("2. Adicionar itens a lista");
            System.out.println("3. Remover itens da lista");
            System.out.println("4. Sair");
            escolha = ler.nextInt();
            ler.nextLine();
            switch (escolha) {

                case 1:
                    System.out.println(listaDeTarefas);
                    ler.nextLine();
                    break;
                case 2:
                    System.out.println("Insira um novo item: ");
                    listaDeTarefas.add(ler.nextLine());
                    break;
                case 3:
                    System.out.println("Remova um item: ");
                    listaDeTarefas.remove(ler.nextLine());
                    break;
            }
        } while (escolha != 4);
    }
}
