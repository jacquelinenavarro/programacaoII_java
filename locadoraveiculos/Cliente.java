package locadoraveiculos;

import java.util.List;

public class Cliente extends Pessoa {
    private double desconto;
    private List<Pedido> pedidosRealizados;

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(List<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }
}
