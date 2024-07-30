package locadoraveiculos;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private Funcionario funcionario;
    private List<Veiculo> veiculosAlugados;
    private Date dataAluguel;
    private double valorTotal;
    private double desconto;
    private boolean isFuncionario;

    public void calcularDesconto() {
        this.desconto = 0;
        if (veiculosAlugados != null && !veiculosAlugados.isEmpty()) {
            if (this.valorTotal == 0) {
                for (Veiculo veiculo : veiculosAlugados) {
                    this.valorTotal += veiculo.getPrecoDiaria();
                }
            }
            if (isFuncionario) {
                this.desconto = valorTotal * 0.2;
            } else {
                if (cliente.getDesconto() > 0) {
                    double valorMax = valorTotal * 0.2;
                    if (cliente.getDesconto() < valorMax) {
                        this.desconto = cliente.getDesconto();
                    } else {
                        this.desconto = valorMax;
                    }
                }
                cliente.setDesconto(cliente.getDesconto() - desconto);
            }
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

    public boolean isFuncionario() {
        return isFuncionario;
    }

    public void setFuncionario(boolean isFuncionario) {
        this.isFuncionario = isFuncionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Veiculo> getVeiculosAlugados() {
        return veiculosAlugados;
    }

    public void setVeiculosAlugados(List<Veiculo> veiculosAlugados) {
        this.veiculosAlugados = veiculosAlugados;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }
}
