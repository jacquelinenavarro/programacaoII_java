package Banco;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(){    
        super();    
    }
    
    public ContaPoupanca(int numero, String titular, Double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    public void atualizarSaldoConta(){
        saldo += saldo * taxaJuros;
        
    }
    
    
}
