/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lojaroupas;

import java.util.List;

/**
 *
 * @author angela maria barbosa
 */
public class Cliente extends Pessoa {
     private double cashback;
     private List<Pedido> pedidosRealizados;

    public double getCashback() {
        return cashback;
    }

    public void setCashback(double cashback) {
        this.cashback = cashback;
    }

    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(List<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }
     
     
     
}
