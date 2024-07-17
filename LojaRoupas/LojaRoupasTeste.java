// Classe de teste

public class LojaRoupasTeste {
    public static void main(String[] args) {
        Produto camiseta = new Produto("Camiseta", 50.0);
        Produto calca = new Produto("Calça", 80.0);
        Cliente cliente = new Cliente("Jacqueline Navarro");
        Funcionario funcionario = new Funcionario("João Silva");

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