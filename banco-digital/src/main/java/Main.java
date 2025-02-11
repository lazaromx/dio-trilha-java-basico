public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Lázaro");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.depositar(1000);
        poupanca.depositar(500);

        corrente.transferir(100, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
