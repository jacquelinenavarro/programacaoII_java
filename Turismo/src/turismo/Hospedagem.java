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
public class Hospedagem extends ProdutoTuristico {
    private Date dataCheckin;
    
    private Date dataCheckout;
    
    private int qtdDiarias;
    
    private int qtdeAdultos;
    
    private int qtdeCriancas;

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public Date getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public int getQtdDiarias() {
        return qtdDiarias;
    }

    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }

    public int getQtdeAdultos() {
        return qtdeAdultos;
    }

    public void setQtdeAdultos(int qtdeAdultos) {
        this.qtdeAdultos = qtdeAdultos;
    }

    public int getQtdeCriancas() {
        return qtdeCriancas;
    }

    public void setQtdeCriancas(int qtdeCriancas) {
        this.qtdeCriancas = qtdeCriancas;
    }
    
    
}
