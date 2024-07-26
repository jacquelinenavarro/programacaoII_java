/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turismo; 

import java.util.Date;

/**
 *
 * @author angela maria barbosa
 */
public class Turismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setCpf("11111111111");
        cliente.setNome("Firmo da Silva");
        cliente.setCashback(40);
        
        Funcionario vendedor = new Funcionario();
        vendedor.setCpf("22222222222");
        vendedor.setNome("Joana Darc");
        
        ProdutoTuristico produto = null;
        boolean isAltaEstacao = true;
        Date dataIni = new Date();
        Date dataFim = new Date();
        
        produto = new Voo();
        produto.setPreco(1500);
        produto.setIsAltaEstacao(isAltaEstacao);
        ((Voo)produto).setDataIda(dataIni);
        ((Voo)produto).setDataVolta(dataFim);
        
        PacoteTuristico pacote = new PacoteTuristico();
        pacote.adicionarProduto(produto);
        
        produto = new Hospedagem();
        produto.setPreco(800);
        produto.setIsAltaEstacao(isAltaEstacao);
        ((Hospedagem)produto).setDataCheckin(dataIni);
        ((Hospedagem)produto).setDataCheckout(dataFim);
        
        
        pacote.adicionarProduto(produto);
        
        GuiaTuristico guia = new GuiaTuristico();
        guia.setNome("Joao");
        guia.setIdiomas("PT e EN");
        
        produto = new PasseioGuiado();
        produto.setPreco(200);
        produto.setIsAltaEstacao(isAltaEstacao);
        
        
        pacote.adicionarProduto(produto);
        
        System.out.printf("Preco total=%.2f\n", pacote.calcularPrecoTotal());
        
        
    }
    
}
