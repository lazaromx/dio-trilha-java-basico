import java.util.Scanner;
import java.util.InputMismatchException;

public class SobreMim {
    public static void main (String[] args){
        /*String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        */
        try{
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Olá me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é: " + altura + "cm");

            sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos de idade e altura precisam ser númericos");
        }


    }
}
