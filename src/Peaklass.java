import java.util.Scanner;

public class Peaklass {
    public static void main(String[] args) throws Exception {
        Jutustaja jutustaja = new Jutustaja();
        Andmebaas andmebaas = new Andmebaas();

        String kasutajaNimi = jutustaja.küsiNime();
        Kasutaja kasutaja = andmebaas.logiSisse(kasutajaNimi);

        jutustaja.tervita(kasutaja);
        jutustaja.näitaÜlesandeid(kasutaja);

        while (true)    {
            jutustaja.küsiTegevust(kasutaja, andmebaas);
        }

    }
}