import java.util.Scanner;

public class ContaTerminal{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        DadosCliente dadosCliente = new DadosCliente();

        System.out.println("Por favor, digite seu nome! ");
        dadosCliente.setNomeCliente(sc.next());
        System.out.println("Por favor, digite o nome da Agência! ");
        dadosCliente.setAgencia(sc.next());
        System.out.println("Por favor, digite o número da Agência! ");
        dadosCliente.setNumeroAgencia(sc.nextInt());
        System.out.println("Por favor, digite seu saldo! ");
        dadosCliente.setSaldo(sc.nextInt());

        dadosCliente.getNomeCliente();
        dadosCliente.getAgencia();
        dadosCliente.getNumeroAgencia();
        dadosCliente.getSaldo();
        dadosCliente.mensagem();

    }
}