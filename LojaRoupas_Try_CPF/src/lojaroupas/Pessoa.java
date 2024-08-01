package lojaroupas;

import java.util.Date;

abstract class Pessoa {
    private Endereco enderecoResidencial;
    private Endereco enderecoComercial;
    private String nome;
    private String cpf;
    private Date dataNascimento;

    public Endereco getEnderecoResidencial() {
        return enderecoResidencial;
    }

    public void setEnderecoResidencial(Endereco enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    public Endereco getEnderecoComercial() {
        return enderecoComercial;
    }

    public void setEnderecoComercial(Endereco enderecoComercial) {
        this.enderecoComercial = enderecoComercial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws InvalidCpfException {
        if (!isValidCpf(cpf)) {
            throw new InvalidCpfException("CPF inválido: " + cpf);
        }
        this.cpf = cpf;
    }

    private boolean isValidCpf(String cpf) {
        // Adicione aqui a lógica de validação do CPF
        return cpf != null && !cpf.isEmpty() && cpf.matches("\\d{11}");
        // (\\d corresponde a qualquer dígito numérico (entre 0 e 9), o 11 é a
        // quantidade que eu quero que tenha.)
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
