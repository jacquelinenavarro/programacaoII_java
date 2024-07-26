/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turismo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author angela maria barbosa
 */
public class PacoteTuristico {
    private Cliente cliente;
    
    private Funcionario consultorTuristico;
    
    private List<ProdutoTuristico> pacote = new ArrayList<>();
    
    public PacoteTuristico(){
        this.pacote = new ArrayList<>();
    }
    public void adicionarProduto(ProdutoTuristico p){
        this.pacote.add(p);
    }
    public double calcularPrecoTotal(){
        double valorTotal = 0;
        
        for (ProdutoTuristico produto : pacote){
            valorTotal += produto.getPreco();
        }
        
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getConsultorTuristico() {
        return consultorTuristico;
    }

    public void setConsultorTuristico(Funcionario consultorTuristico) {
        this.consultorTuristico = consultorTuristico;
    }

    public List<ProdutoTuristico> getPacote() {
        return pacote;
    }

    public void setPacote(List<ProdutoTuristico> pacote) {
        this.pacote = pacote;
    }
    
    
}
