import java.util.List;
import java.util.Scanner;

public class Jutustaja {
    private String kasutajaNimi;

    public String küsiNime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palun sisesta oma kasutajanimi: ");
        kasutajaNimi = sc.nextLine();
        return kasutajaNimi;
    }

    public void küsiJaLisaÜlesanne(Kasutaja kasutaja)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mis on ülesande sisu?");
        String ülesandeSisu = sc.nextLine();
        System.out.println("Mis on ülesande prioriteet? (punane, kollane, roheline, valge)");
        String prioriteet = sc.nextLine().strip().toLowerCase();
        kasutaja.lisaÜlesanne(ülesandeSisu, prioriteet);
        System.out.println("Ülesanne lisatud!");
    }

    public void näitaÜlesandeid(Kasutaja kasutaja)  {
        List<Ülesanne> ülesanded = kasutaja.getÜlesanded();
        System.out.println("Sul on hetkel ülesandeid " + ülesanded.size());
        System.out.println("Need on: ");
        for (Ülesanne ülesanne : ülesanded) {
            System.out.println(ülesanne);
        }
    }
}
