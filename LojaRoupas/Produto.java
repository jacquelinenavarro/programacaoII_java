// Classe Produto implementando a interface Desconto
public class Produto extends Pessoa implements Desconto {
    private double preco;

    public Produto(String nome, double preco) {
        super(nome);  // Chama o construtor da classe Pessoa
        this.preco = preco;
    }

    @Override
    public double aplicarDesconto(double valor) {
        // Implementação do método de desconto
        return valor * 0.9;  // Exemplo de desconto de 10%
    }

    public double getPreco() {
        return preco;
    }
}
