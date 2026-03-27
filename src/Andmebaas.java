import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Andmebaas {
    private String kasutajanimi;

    public Andmebaas(String kasutajanimi) {
        this.kasutajanimi = kasutajanimi;
    }



    public Kasutaja logiSisse() throws Exception {
        File fail = new File("andmebaas/" + kasutajanimi);
        if (fail.exists()) {
            System.out.println("Tere taas " + kasutajanimi + "!");
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
            FileWriter ülesanneteKirj = new FileWriter("andmebaas/" + kasutajanimi + "/ülesanded.txt");
            FileWriter kogemuspunktideKirj = new FileWriter("andmebaas/" + kasutajanimi + "/kogemuspunktid.txt");
            System.out.println("Tere tulemast " + kasutajanimi + "!");
            List<Ülesanne> ülesanded = new ArrayList<>();
            Kasutaja kasutaja = new Kasutaja(kasutajanimi, 0, ülesanded);
            return kasutaja;
        }
    }
}
