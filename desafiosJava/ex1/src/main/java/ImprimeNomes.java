import java.util.Scanner;
public class ImprimeNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++) {
            nomes[i] = sc.nextLine();
            if(i == 2){
                System.out.println(nomes[i]);
            }
            if(i == 6){
                System.out.println(nomes[i]);
            }
            if(i == 8){
                System.out.println(nomes[i]);
            }
        }

    }
}
