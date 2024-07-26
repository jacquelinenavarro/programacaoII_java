/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turismo;

/**
 *
 * @author angela maria barbosa
 */
public class ProdutoTuristico {
    private String nome;
    private double preco;
    private boolean isAltaEstacao;

    public boolean isIsAltaEstacao() {
        return isAltaEstacao;
    }

    public void setIsAltaEstacao(boolean isAltaEstacao) {
        this.isAltaEstacao = isAltaEstacao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        if (isAltaEstacao)
            return preco * 1.1;
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
