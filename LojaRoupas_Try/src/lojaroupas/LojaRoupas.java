/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojaroupas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author angela maria barbosa
 */
public class LojaRoupas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCpf("11111111111");
        cliente.setNome("Joao da Silva");
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
        try {
            pedido.calcularDesconto();
        } catch (PedidoVazioException ex) {
            Logger.getLogger(LojaRoupas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.printf("Valor total = %.2f", pedido.getValorTotal());
        System.out.println();
        System.out.printf("Desconto = %.2f", pedido.getDesconto());
    }

}
