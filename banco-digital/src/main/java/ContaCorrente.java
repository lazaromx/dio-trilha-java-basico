public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
//    private static int SEQUENCIAL = 1;
//    public ContaCorrente(){
//        super.agencia = Conta.AGENCIA_PADRAO;
//        super.numero = SEQUENCIAL++;
//    }

    @Override
    public void imprimirExtrato(){
        System.out.println("-------Extrato conta corrente-------");
        super.imprimriInfosConta();
    }
}
