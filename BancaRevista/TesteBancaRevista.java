package BancaRevista;

public class TesteBancaRevista {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Revista", 10.0, 100);
        Cliente cliente = new Cliente(1, "João", "Rua A, 123");
        Funcionario funcionario = new Funcionario(1, "Maria", 2000.0);
        Venda venda = new Venda(1, cliente, funcionario, produto, 5);

        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Funcionario: " + venda.getFuncionario().getNome());
        System.out.println("Produto: " + venda.getProduto().getNome());
        System.out.println("Quantidade: " + venda.getQuantidade());
        System.out.println("Total: " + venda.calcularTotal());
    }
}