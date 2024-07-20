// Classe Funcionario implementando a interface Desconto
public class Funcionario extends Pessoa implements Desconto {
    private double desconto;

    public Funcionario(String nome) {
        super(nome);
        this.desconto = 0.20;
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor * (1 - this.desconto);  // Valor com desconto = (valor original) × (1 − desconto)
    }
}
