package Modificador;

public class Pessoa {
    String nome;
    int velocidade;
    String profissao;
    private Automovel automovel;

    public void Carro (String nome, String cor, int velocidade ) {
        automovel = new Automovel();
        automovel.setNome(nome);
        automovel.setCor(cor);
        automovel.setVelocidade(velocidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
}
