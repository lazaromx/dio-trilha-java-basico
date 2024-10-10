import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = sc.nextDouble();
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperaçao" : "Reprovado";
        System.out.println(resultado);
    }
}
