package Turismo;

import java.util.ArrayList;
import java.util.List;

// Classe Cliente
class Cliente {
    private String nome;
    private String email;
    private List<Pacote> pacotes;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.pacotes = new ArrayList<>();
    }

    public void adicionarPacote(Pacote pacote) {
        pacotes.add(pacote);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(nome).append(", Email: ").append(email).append("\nPacotes:\n");
        for (Pacote pacote : pacotes) {
            sb.append(pacote).append("\n");
        }
        return sb.toString();
    }
}
