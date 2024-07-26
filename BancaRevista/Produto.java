package BancaRevista;

public class Produto {
    private int codigo;
    private String nome;
    private double valorUnitario;
    private int estoque;

    public Produto(int codigo, String nome, double valorUnitario, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.estoque = estoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getEstoque() {
        return estoque;
    }

    public void incluirEstoque(int quantidade) {
        estoque += quantidade;
    }

    public void tirarEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque indisponível!!");
        }
    }
}
