/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupas;

import java.util.Date;
import java.util.List;

/**
 *
 * @author angela maria barbosa
 */
public class Pedido {
    private Cliente cliente;
    private Funcionario vendedor;
    private List<Produto> produtosVendidos;
    private Date dataCompra;
    private double valorTotal;
    private double desconto;
    private boolean isFuncionario;
    
    public void calcularDesconto() throws PedidoVazioException{        
        if (produtosVendidos == null || produtosVendidos.isEmpty()) {
            throw new PedidoVazioException();
        }
        this.desconto = 0;
        if (this.valorTotal == 0){
            for (Produto item : produtosVendidos){
                this.valorTotal += item.getPreco();
            }
        }
        if (isFuncionario){
            this.desconto = valorTotal * 0.2;
        } else {
            if (cliente.getCashback() > 0){
                double valorMax = valorTotal * 0.2;
                if (cliente.getCashback() < valorMax){
                    this.desconto = cliente.getCashback();
                } else {
                    this.desconto = valorMax;                            
                }
            }
            cliente.setCashback(cliente.getCashback() - desconto);
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public boolean isIsFuncionario() {
        return isFuncionario;
    }

    public void setIsFuncionario(boolean isFuncionario) {
        this.isFuncionario = isFuncionario;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public List<Produto> getProdutosVendidos() {
        return produtosVendidos;
    }

    public void setProdutosVendidos(List<Produto> produtosVendidos) {
        this.produtosVendidos = produtosVendidos;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
    
}
