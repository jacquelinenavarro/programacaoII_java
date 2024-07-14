/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author angela maria barbosa
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = new Medico();
        pessoa = new Enfermeiro();
        pessoa = new Paciente();
        
        FuncionarioHospital funcionario = new Medico();
        funcionario = new Enfermeiro();
        Paciente paciente = new Paciente();
        paciente.setNome("Josias Vicente");
        
        Endereco end = new Endereco();
        end.setBairro("Dois Irmaos");
        end.setCep("54125010");
        end.setCidade("Recife");
        end.setComplemento("");
        end.setLogradouro("Rua Dois Rios");
        end.setNumero(512);
        end.setUf("PE");
        
        paciente.setEnderecoResidencial(end);
        
        System.out.println(paciente.toString());
    }
    
}
