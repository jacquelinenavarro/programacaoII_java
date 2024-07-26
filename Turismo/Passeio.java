package Turismo;

// Classe Passeio
class Passeio {
    private String descricao;
    private double preco;

    public Passeio(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Passeio: " + descricao + ", Preço: " + preco;
    }
}
