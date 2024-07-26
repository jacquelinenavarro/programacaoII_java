package BancaRevista;

public class Venda {
    private int id;
    private Cliente cliente;
    private Funcionario funcionario;
    private Produto produto;
    private int quantidade;

    public Venda(int id, Cliente cliente, Funcionario funcionario, Produto produto, int quantidade) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularTotal() {
        return produto.getValorUnitario() * quantidade;
    }
}
