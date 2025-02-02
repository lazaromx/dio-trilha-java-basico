import java.util.Scanner;

public class Carro {
    Scanner sc = new Scanner(System.in);

    public void ligar(){
        if(confereCambio() && confereCombustivel()){
            System.out.println("Carro ligado");
        }else {
            System.out.println("Carro não ligou!");
        }
    }

    private boolean confereCambio(){
        System.out.println("Em qual cambio está posicionado: ");

        String cambio = sc.next().toUpperCase();

        System.out.println("Conferindo Cambio...");

        if(cambio.equals("P") || cambio.equals("N")){
            System.out.println("Cambio posicionado em " + cambio + "\n");
            return true;
        }
        else{
            System.out.println("Cambio não está posicionado em P ou N\n");
            return false;
        }
    }

    private boolean confereCombustivel(){
        System.out.println("Quanto tem de combustivel");

        int gasolina = sc.nextInt();

        System.out.println("Conferindo combustivel...");

        if(gasolina != 0){
            System.out.println("Tem gasolina\n");
            return true;
        }
        else{
            System.out.println("Não tem gasolina\n");
            return false;
        }
    }

}
