public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("volume atual: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("volume atual: " + volume);

    }

    public void subirCanal(){
        canal++;
        System.out.println("canal atual: " + canal);

    }

    public void descerCanal(){
        canal--;
        System.out.println("canal atual: " + canal);

    }

    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("canal atual: " + canal);

    }

}
