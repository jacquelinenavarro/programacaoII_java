// Classe Pessoa
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Interface Desconto
public interface Desconto {
    double aplicarDesconto(double valor);
}