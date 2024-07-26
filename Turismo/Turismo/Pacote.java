package Turismo;

// Classe Pacote
class Pacote {
    private Translado translado;
    private Hospedagem hospedagem;
    private Passeio passeio;
    private double desconto;

    public Pacote(Translado translado, Hospedagem hospedagem, Passeio passeio, double desconto) {
        this.translado = translado;
        this.hospedagem = hospedagem;
        this.passeio = passeio;
        this.desconto = desconto;
    }

    public double calcularPrecoTotal() {
        double precoTotal = translado.getPreco() + hospedagem.getPreco() + passeio.getPreco();
        return precoTotal - (precoTotal * desconto);
    }

    @Override
    public String toString() {
        return translado.toString() + "\n" + hospedagem.toString() + "\n" + passeio.toString() + "\n"
                + "Desconto: "
                + (desconto * 100) + "%\n" + "Preço Total: " + calcularPrecoTotal();
    }
}
