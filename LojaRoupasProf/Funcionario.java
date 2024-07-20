import java.util.Date;
import java.util.List;

public class Funcionario extends Pessoa {
    private Date dataAdmissao;
    private double salario;
    private List<Pedido> pedidosVendidos;

    public List<Pedido> getPedidosVendidos() {
        return pedidosVendidos;
    }

    public void setPedidosVendidos(List<Pedido> pedidosVendidos) {
        this.pedidosVendidos = pedidosVendidos;
    }
     
    

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
