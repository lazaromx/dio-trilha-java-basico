public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){
            System.out.println("-------Extrato conta poupança-------");
            super.imprimriInfosConta();
    }

//    private static int SEQUENCIAL = 1;
//    public ContaPoupanca(){
//        super.agencia = Conta.AGENCIA_PADRAO;
//        super.numero = SEQUENCIAL++;
//    }

}
