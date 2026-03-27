import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) throws Exception {
        Jutustaja jutustaja = new Jutustaja();
        String kasutajaNimi = jutustaja.küsiNime();
        Andmebaas andmebaas = new Andmebaas(kasutajaNimi);
        andmebaas.logiSisse();
    }
}