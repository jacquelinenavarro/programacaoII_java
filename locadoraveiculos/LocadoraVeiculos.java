package locadoraveiculos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocadoraVeiculos {

    public static void main(String[] args) {
        // Criar cliente
        Cliente cliente = new Cliente();
        cliente.setCpf("11111111111");
        cliente.setNome("João da Silva");
        cliente.setDesconto(50);

        // Criar funcionário
        Funcionario funcionario = new Funcionario();
        funcionario.setCpf("22222222222");
        funcionario.setNome("Maria Souza");

        // Criar lista de veículos
        List<Veiculo> veiculos = new ArrayList<>();

        // Adicionar carro à lista de veículos
        Carro carro = new Carro();
        carro.setModelo("Fusca");
        carro.setPrecoDiaria(100);
        carro.setNumeroPortas(4);
        veiculos.add(carro);

        // Adicionar moto à lista de veículos
        Moto moto = new Moto();
        moto.setModelo("CB500");
        moto.setPrecoDiaria(70);
        moto.setPossuiCarenagem(true);
        veiculos.add(moto);

        // Criar pedido
        Pedido pedido = new Pedido();
        pedido.setCliente(cliente);
        pedido.setFuncionario(funcionario);
        pedido.setVeiculosAlugados(veiculos);
        pedido.setDataAluguel(new Date());

        // Calcular desconto
        pedido.calcularDesconto();

        // Exibir detalhes do cliente
        System.out.println("Detalhes do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Desconto disponível: " + cliente.getDesconto());
        System.out.println();

        // Exibir detalhes do pedido
        System.out.println("Detalhes do Pedido:");
        System.out.println("Data do Aluguel: " + pedido.getDataAluguel());
        System.out.println("Valor Total: " + pedido.getValorTotal());
        System.out.println("Desconto Aplicado: " + pedido.getDesconto());
        System.out.println();

        // Exibir detalhes dos veículos no pedido
        System.out.println("Veículos Alugados:");
        for (Veiculo veiculo : pedido.getVeiculosAlugados()) {
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Preço Diária: " + veiculo.getPrecoDiaria());
            if (veiculo instanceof Carro) {
                System.out.println("Número de Portas: " + ((Carro) veiculo).getNumeroPortas());
            } else if (veiculo instanceof Moto) {
                System.out.println("Possui Carenagem: " + ((Moto) veiculo).isPossuiCarenagem());
            }
            System.out.println();
        }
    }
}
