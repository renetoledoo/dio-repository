public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("******** Extrato Conta Corrente ********");
        System.out.println("Agência : " + super.agencia);
        System.out.println("Número : " + super.numero);
        System.out.println("Saldo : " + super.saldo);
    }
}
