package Modificador;

import java.util.Scanner;

public class ObjetoPessoaAutomovel {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        String cor, nome;
        int velocidade;

        System.out.println("Informe o nome do carro: ");
        nome = ler.nextLine();

        System.out.println("Informe a cor do carro: ");
        cor = ler.nextLine();

        System.out.println("Informe a velocidade do carro: ");
        velocidade = ler.nextInt();

        pessoa.Carro(nome, cor, velocidade);

        Automovel carro = pessoa.getAutomovel();

        System.out.println("O carro comprado foi " + carro.getNome()+ " da cor " + carro.getCor()+ " que atinge a velocidade de " + carro.getVelocidade() + " km/h");
    }
}
