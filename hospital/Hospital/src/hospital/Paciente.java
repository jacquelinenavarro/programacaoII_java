/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author angela maria barbosa
 */
public class Paciente extends Pessoa implements Doador{
    private Date dataInternacao;

    @Override
    public List<Orgao> doar() {
        List<Orgao> orgaos = new ArrayList<>();
        //operacoes como uma consulta bd etc
        return orgaos;
    }

    @Override
    public String toString() {
        return getNome() + "\nEndereco:\n" + getEnderecoResidencial().toString();
    }
    
    

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(Date dataInternacao) {
        this.dataInternacao = dataInternacao;
    }
}
