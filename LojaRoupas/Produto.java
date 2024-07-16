// Classe Produto implementando a interface Desconto

public class Produto extends Pessoa implements Desconto {
    private double preco;

    public Produto(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor; 
    }

    public double getPreco() {
        return preco;
    }
}