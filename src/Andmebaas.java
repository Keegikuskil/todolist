import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Andmebaas {

    public Kasutaja logiSisse(String kasutajanimi) throws Exception {
        kasutajanimi = kasutajanimi.toLowerCase();
        File fail = new File("andmebaas/" + kasutajanimi);
        if (fail.exists()) {
            File kogemuspunktideFail = new File("andmebaas/" + kasutajanimi + "/kogemuspunktid.txt");
            File ülesanneteFail = new File("andmebaas/" + kasutajanimi + "/ülesanded.txt");
            int kogemuspunktid = 0;
            try (Scanner sc = new Scanner(kogemuspunktideFail)) {
                while (sc.hasNextLine()) {
                    kogemuspunktid = Integer.parseInt(sc.nextLine());
                }
            }
            List<Ülesanne> ülesanded = new ArrayList<>();
            try (Scanner sc = new Scanner(ülesanneteFail))  {
                while (sc.hasNextLine())   {
                    String[] rida = sc.nextLine().split(";");
                    Ülesanne ülesanne = new Ülesanne(rida[0], rida[1]);
                    ülesanded.add(ülesanne);
                }
            }
            Kasutaja kasutaja = new Kasutaja(kasutajanimi, kogemuspunktid, ülesanded);
            return kasutaja;
        }
        else {
            fail.mkdirs();
            PrintWriter ülesanneteKirj = new PrintWriter("andmebaas/" + kasutajanimi + "/ülesanded.txt");
            PrintWriter kogemuspunktideKirj = new PrintWriter("andmebaas/" + kasutajanimi + "/kogemuspunktid.txt");
            List<Ülesanne> ülesanded = new ArrayList<>();
            Kasutaja kasutaja = new Kasutaja(kasutajanimi, 0, ülesanded);
            return kasutaja;
        }
    }

    public void salvestaAndmed(Kasutaja kasutaja) throws Exception  {
        try(PrintWriter ülesanneteKirj = new PrintWriter("andmebaas/" + kasutaja.getKasutajaNimi() + "/ülesanded.txt")) {
            for (Ülesanne ülesanne : kasutaja.getÜlesanded())   {
                ülesanneteKirj.println(ülesanne.vormistaFaili());
            }
        }
        try(PrintWriter kogemuspunktideKirj = new PrintWriter("andmebaas/" + kasutaja.getKasutajaNimi() + "/kogemuspunktid.txt"))   {
            kogemuspunktideKirj.println(kasutaja.getKogemuspunktid());
        }

    }
}
