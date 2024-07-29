package Banco;

public class TesteBanco {
    public static void main(String[] args) {
        Conta conta = new Conta(1001, "Jacqueline Navarro", 100.0);
        ContaNegocio contaNegocio = new ContaNegocio(1002, "Jose Silva", 200.0, 500.0);

        // UPCasting
        Conta conta1 = contaNegocio;
        Conta conta2 = new ContaNegocio(1003, "Bob Silva", 0.0, 200.0);
        Conta conta3 = new ContaPoupanca(1004, "Ana Maria", 0.0, 0.01);

        // DOWNCasting

        ContaNegocio conta4 = (ContaNegocio) conta2;
        conta4.emprestimo(100.0);

        // ContaNegocio conta5 = (ContaNegocio)conta3;
        if (conta3 instanceof ContaNegocio) {
            ContaNegocio conta5 = (ContaNegocio) conta3;
            conta5.emprestimo(200.0);
            System.out.println("Emprestimo realizado!");

        }
        if (conta3 instanceof ContaPoupanca) {
            ContaPoupanca conta5 = (ContaPoupanca) conta3;
            conta5.atualizarSaldoConta();
            System.out.println("Saldo atualizado!");
        }
         // Print do saldo na conta:
         System.out.println("Saldo na conta de Jacqueline Navarro: " + conta.getSaldo());
         System.out.println("Saldo na conta de Jose Silva: " + contaNegocio.getSaldo());


    }

}
