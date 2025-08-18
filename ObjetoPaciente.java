import java.util.Scanner;
public class ObjetoPaciente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Paciente p1 = new Paciente();

        System.out.println("Quantas fichas deseja fazer? ");
        int ficha = ler.nextInt();

        ler.nextLine();

        for (int i = 0; i < ficha; i++ ) {


            System.out.println("Insira o seu nome: ");
            p1.setNome(ler.nextLine());
            System.out.println("Insira o seu endereço: ");
            p1.setEndereco(ler.nextLine());
            System.out.println("Insira seu cpf");
            p1.setcpf(ler.nextLine());
            System.out.println("Insira o seu genêro (F = Feminino M = Masculino B = Não Binário): " );
            p1.setSexo(ler.next().charAt(0));
            System.out.println("Insira sua data de nascimento: ");
            p1.setDataDeNascimento(ler.next());
            ler.nextLine();
            System.out.println("Insira o email: ");
            p1.setEmail(ler.nextLine());
            System.out.println("Insira o seu número de telefone: ");
            p1.setTelefone(ler.nextLine());
            System.out.println("Insira o nível de escolaridade: ");
            p1.setNivelDeEscolaridade(ler.nextLine());
            ler.nextLine();



            System.out.println("---PACIENTE---");
            System.out.println(p1.getNome());
            System.out.println(p1.getEndereco());
            System.out.println(p1.getCpf());
            System.out.println(p1.getSexo());
            System.out.println(p1.getNivelDeEscolaridade());
            System.out.println(p1.getEmail());
            System.out.println(p1.getDataDeNascimento());
            System.out.println(p1.getTelefone());


        }

    }
}

