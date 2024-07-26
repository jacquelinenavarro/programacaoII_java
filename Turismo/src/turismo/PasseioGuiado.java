/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package turismo;

/**
 *
 * @author angela maria barbosa
 */
public class PasseioGuiado extends ProdutoTuristico {
    private String localizacao;
    
    private String detalhesPercurso;
    
    private GuiaTuristico guia;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDetalhesPercurso() {
        return detalhesPercurso;
    }

    public void setDetalhesPercurso(String detalhesPercurso) {
        this.detalhesPercurso = detalhesPercurso;
    }

    public GuiaTuristico getGuia() {
        return guia;
    }

    public void setGuia(GuiaTuristico guia) {
        this.guia = guia;
    }
    
    
}
