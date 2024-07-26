package Turismo;

// Classe Principal para Testes

public class Main {
    public static void main(String[] args) {
        Translado translado = new Translado("Voo para Paris", 1200.00);
        Hospedagem hospedagem = new Hospedagem("Hotel 5 estrelas", 800.00);
        Passeio passeio = new Passeio("Tour pela cidade", 200.00);

        // Simulação de alta estação (sem desconto)
        Pacote pacoteAltaEstacao = new Pacote(translado, hospedagem, passeio, 0.0);

        // Simulação de baixa estação (com desconto de 20%)
        Pacote pacoteBaixaEstacao = new Pacote(translado, hospedagem, passeio, 0.2);

        // Criação do cliente e adição dos pacotes
        Cliente cliente = new Cliente("João Silva", "joao.silva@example.com");
        System.out.println("\nValores Alta Temporada:\n");
        cliente.adicionarPacote(pacoteAltaEstacao);

        System.out.println("\nValores Baixa Temporada:\n");

        cliente.adicionarPacote(pacoteBaixaEstacao);

        // Exibição dos detalhes do cliente e pacotes

        System.out.println(cliente);

    }
}
