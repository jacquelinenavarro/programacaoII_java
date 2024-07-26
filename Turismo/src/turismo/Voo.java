/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turismo;

import java.util.Date;

/**
 *
 * @author angela maria barbosa
 */
public class Voo extends ProdutoTuristico {
    private Date dataIda;
    
    private Date dataVolta;
    
    private double valorTotal;
    
    private double taxaEmbarque;
    
    private boolean bagagemMao;
    
    private boolean deapacharMala;

    public boolean isBagagemMao() {
        return bagagemMao;
    }

    public void setBagagemMao(boolean bagagemMao) {
        this.bagagemMao = bagagemMao;
    }

    public boolean isDeapacharMala() {
        return deapacharMala;
    }

    public void setDeapacharMala(boolean deapacharMala) {
        this.deapacharMala = deapacharMala;
    }
    
    

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }
    
    
}
