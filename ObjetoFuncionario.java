import java.util.Scanner;
public class ObjetoFuncionario {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Quantas fichas deseja fazer?");
        int fichas = ler.nextInt();

        ler.nextLine();

        for(int i = 0; i < fichas; i++) {

            System.out.println("Qual o nome do funcionário: ");
            f1.setNome(ler.nextLine());
            System.out.println("Qual o endereço do funcionário: ");
            f1.setEndereco(ler.nextLine());
            System.out.println("Qual o cpf do funcionário: ");
            f1.setCpf(ler.nextLine());
            System.out.println("Qual o telefone do funcionário: ");
            f1.setTelefone(ler.nextLine());
            System.out.println("Qual o cargo do funcionário: ");
            f1.setCargo(ler.nextLine());
            System.out.println("Qual a data de admissão do funcionário: ");
            f1.setDataDeAdmisssao(ler.nextLine());
            System.out.println("Qual a data de nascimento do funcionário: ");
            f1.setDataDeNascimento(ler.nextLine());
            System.out.println("Qual o email do funcionário: ");
            f1.setEmail(ler.nextLine());
            System.out.println("Qual o genêro do funcionário (F = Feminino M = Masculino B = Não Binário: ");
            f1.setSexo(ler.next().charAt(0));
            System.out.println("Qual o nível de escolaridade do funcionário: ");
            f1.setNivelDeEscolaridade(ler.next());
            ler.nextLine();

            System.out.println("---FICHA---");
            System.out.println(f1.getNome());
            System.out.println(f1.getEndereco());
            System.out.println(f1.getCpf());
            System.out.println(f1.getTelefone());
            System.out.println(f1.getCargo());
            System.out.println(f1.getDataDeAdmisssao());
            System.out.println(f1.getDataDeNascimento());
            System.out.println(f1.getEmail());
            System.out.println(f1.getSexo());
            System.out.println(f1.getNivelDeEscolaridade());


        }
    }
}
