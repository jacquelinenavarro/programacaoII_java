package Banco;

public class ContaNegocio extends Conta {

    private Double limiteEmprestimo;

    public ContaNegocio() {
        super();
    }

    public ContaNegocio(int numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo (Double valorEmprestimo){
        if (valorEmprestimo <= limiteEmprestimo){            
        
            saldo += valorEmprestimo -10;
        }      
        
    }

}
