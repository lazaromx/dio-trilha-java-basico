public class DadosCliente {
    private int numeroAgencia;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public int getNumeroAgencia() {
        System.out.println("Numero da Agência " + numeroAgencia);
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getAgencia() {
        System.out.println("Agência " + agencia);

        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        System.out.println("Nome do cliente " + nomeCliente);
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        System.out.println("Seu saldo é " + saldo);
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mensagem(){
        System.out.println("--------------------\nOlá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + getAgencia() + ", conta " + getNumeroAgencia() + " e seu " + getSaldo() + " já está disponível para saque.");
    }
}
