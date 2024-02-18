public abstract class Conta implements  IConta{

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 0;

    protected int agencia; 
    protected int numero; 
    protected double saldo;


    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void sacar() {
         
    }

    public void depositar() {

    }

    public void transferir() {

    }

    @Override
    public void sacar(double valor) {
     saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo =+valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       if(valor <= saldo) {
          contaDestino.saldo += valor;
       } else {
            System.out.println("Saldo Insuficiente");
       }
    }

}
