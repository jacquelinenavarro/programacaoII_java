public class Produto extends Pessoa implements Desconto {
    private double preco;

    public Produto(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    public Produto(double preco) {
        this.preco = preco;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.9;
    }

    public double getPreco() {
        return preco;
    }
}
