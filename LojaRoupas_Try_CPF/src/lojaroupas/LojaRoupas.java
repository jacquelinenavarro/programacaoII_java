/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lojaroupas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LojaRoupas {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        try {
            cliente.setCpf("3333333333"); // CPF incompleto (correto com 11 digitos)
        } catch (InvalidCpfException ex) {
            Logger.getLogger(LojaRoupas.class.getName()).log(Level.SEVERE, "CPF inválido para o cliente", ex);
            // Encerra o programa se o CPF for inválido
        }
        cliente.setNome("Joao da Silva");
        cliente.setCashback(40);

        Funcionario vendedor = new Funcionario();
        try {
            vendedor.setCpf("22222222222");
        } catch (InvalidCpfException ex) {
            Logger.getLogger(LojaRoupas.class.getName()).log(Level.SEVERE, "CPF inválido para o vendedor", ex);
            // Encerra o programa se o CPF for inválido
        }
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