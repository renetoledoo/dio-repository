public class Principal {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1250.0);
        Conta contaPoupanca = new ContaPoupanca();

        contaCorrente.transferir(250, contaPoupanca);


        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
