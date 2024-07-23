public class Cliente extends Pessoa implements Desconto {
    private double cashback;

    public Cliente(String nome) {
        super(nome);
        this.cashback = 0.0;
    }

    @Override
    public double aplicarDesconto(double valor) {
        double cashbackAtual = valor * 0.10;
        this.cashback = Math.min(this.cashback + cashbackAtual, valor * 0.20);
        return valor - this.cashback;
    }

    public double getCashback() {
        return cashback;
    }
}
