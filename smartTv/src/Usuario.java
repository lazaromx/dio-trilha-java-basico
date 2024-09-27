public class Usuario {
    public static void main (String[] args){
        SmartTv tv = new SmartTv();
        System.out.println("Tv ligada? " + tv.ligada);
        System.out.println("Qual canal? " + tv.canal);
        System.out.println("Qual volume? " + tv.volume);

        tv.ligar();
        System.out.println("Tv ligada? " + tv.ligada);


        tv.subirCanal();
        System.out.println(tv.canal);
        tv.mudarCanal(15);
        System.out.println(tv.canal);




    }
}
