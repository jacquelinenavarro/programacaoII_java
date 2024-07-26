package Turismo;

// Classe Translado/Voo
class Translado {
    private String descricao;
    private double preco;

    public Translado(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Translado: " + descricao + ", Preço: " + preco;
    }
}
