import java.util.ArrayList;
import java.util.List;

public class LojaRoupas {

  
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCpf("11111111111");
        cliente.setNome("Joao Silva");
        cliente.setCashback(40);

        Funcionario vendedor = new Funcionario();
        vendedor.setCpf("22222222222");
        vendedor.setNome("Joana Darc");

        List<Produto> produtos = new ArrayList<>();

        Produto produto = new Produto();
        produto.setDescricao("Calça jeans");
        produto.setPreco(190);

        produtos.add(produto);

        produto = new Produto();
        produto.setDescricao("Camiseta basica");
        produto.setPreco(90);

        produtos.add(produto);

        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setVendedor(vendedor);
        pedido.setProdutosVendidos(produtos);
        pedido.calcularDesconto();
        System.out.printf("Valor total = %.2f", pedido.getValorTotal());
        System.out.println();
        System.out.printf("Desconto = %.2f", pedido.getDesconto());
        System.out.println();
    }

}
