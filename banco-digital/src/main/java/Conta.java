public abstract class Conta implements IConta {

    //Classe abstrada não pode ser instanciada, a não ser por seus filhos;
    //Não faz sentido alguém criar uma conta sem dizer se é poupança ou corrente;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    private Cliente cliente;
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimriInfosConta(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
