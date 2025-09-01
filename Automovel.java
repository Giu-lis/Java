package ativheranca;

class Automovel extends Veiculo {
    private int numeroDePortas;
    private String motor;

    public Automovel(String marca, String modelo, int ano, String cor, int numeroDePortas, String motor) {
        super(marca, modelo, ano, cor);
        this.numeroDePortas = numeroDePortas;
        this.motor = motor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
