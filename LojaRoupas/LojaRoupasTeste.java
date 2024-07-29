public class LojaRoupasTeste {
    public static void main(String[] args) {
        Produto camiseta = new Produto("Cod01", "Camisa", 150.0);
        Produto calca = new Produto("Cod02", "Calca", 80.0);
        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();

        double valorVenda = camiseta.getPreco() + calca.getPreco();
        double valorComDescontoCliente = cliente.aplicarDesconto(valorVenda);
        double valorComDescontoFuncionario = funcionario.aplicarDesconto(valorVenda);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Cashback acumulado: $" + cliente.getCashback());
        System.out.println("Valor da venda com desconto de cliente: $" + valorComDescontoCliente);
        System.out.println("Valor da venda com desconto de funcionário: $" + valorComDescontoFuncionario);
    }
}
