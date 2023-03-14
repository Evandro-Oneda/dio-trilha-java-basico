public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTV = new SmartTv();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Canal Atual?: " + smartTV.canal);

        smartTV.mudarCanal(13);
        System.out.println("Canal Atual?: " + smartTV.canal);

        System.out.println("Volume atual:" + smartTV.volume);


        System.out.println("TV Ligada?: " + smartTV.ligada);
        System.out.println("Canal Atual?: " + smartTV.canal);
        System.out.println("Volume Atual?: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV Ligada?:"+ smartTV.ligada);

    
    }
}
