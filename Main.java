package ativheranca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
            Veiculo veiculo = new Veiculo("Chevete", "Hatch", 1988, "branco");

            System.out.println("A marca do veiculo é:" + veiculo.getMarca());
            System.out.println("O modelo é: " + veiculo.getModelo());
            System.out.println("Ano: " + veiculo.getAno());
            System.out.println("Cor: " + veiculo.getCor());

            Moto moto = new Moto ("Honda", "CG 160", 2020, "preta", 162);

            System.out.println("A marca da moto é: " + moto.getMarca());
            System.out.println("O modelo é: " + moto.getModelo());
            System.out.println("O ano é: " + moto.getAno());
            System.out.println("A cor é: " + moto.getCor());
            System.out.println("E sua cilindrada é: " + moto.getCilindrada());

            Automovel automovel = new Automovel("Renault", "Sandero", 2006, "cinza", 4, "motor sla");

            System.out.println("A marca é: " + automovel.getMarca());
            System.out.println("O modelo é: " + automovel.getModelo());
            System.out.println("O ano é: " + automovel.getAno());
            System.out.println("A cor é: " + automovel.getCor());
            System.out.println("O numero de portas é: " + automovel.getNumeroDePortas());
            System.out.println("E o motor é: " + automovel.getMotor());

    }
}