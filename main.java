public class main {
    public static void main(String[] args) {
        televisor tv1 = new televisor(1);
        canal canal1 = new canal("Familia Sacana", 1);
        canal canal2 = new canal("play boy Tv", 2);
        canal  canal3 = new canal("cultura cannabis", 3);
        tv1.ligar();
        tv1.adicionarCanal(canal1);
        tv1.adicionarCanal(canal2);
        tv1.mudarCanal(1);
        tv1.aumentarVolume();   
        tv1.diminuirVolume();
        tv1.desligar();
              
        
        televisor tv2 = new televisor(2);
        
        tv2.ligar();
        tv2.adicionarCanal(canal3);
        tv2.mudarCanal(1); 
        tv2.aumentarVolume();
        tv2.diminuirVolume();
        tv2.desligar();

    }
     

}
