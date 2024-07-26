package Turismo;

// Classe Hospedagem
class Hospedagem {
    private String descricao;
    private double preco;

    public Hospedagem(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Hospedagem: " + descricao + ", Preço: " + preco;
    }
}
