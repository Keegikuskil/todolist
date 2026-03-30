import java.util.List;
import java.util.Scanner;

public class Jutustaja {
    private String kasutajaNimi;

    public void küsiTegevust(Kasutaja kasutaja, Andmebaas andmebaas) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mida sa teha soovid?");
        System.out.println("1 - Lisa ülesanne");
        System.out.println("2 - Alusta mänguga");
        System.out.println("3 - Vaata ülesandeid");
        System.out.println("4 - Salvesta ja lõpeta");
        int sisend = Integer.parseInt(sc.nextLine());
        this.teeTegevus(sisend, kasutaja, andmebaas);
    }

    private void teeTegevus(int sisend, Kasutaja kasutaja, Andmebaas andmebaas) throws Exception {
        if (sisend == 1)    {
            this.küsiJaLisaÜlesanne(kasutaja);
        }
        else if (sisend == 2)    {
            System.out.println("Alustasin mänguga");
        }
        else if (sisend == 3)   {
            this.näitaÜlesandeid(kasutaja);
        }
        else {
            andmebaas.salvestaAndmed(kasutaja);
            System.exit(0);
        }
    }

    public String küsiNime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palun sisesta oma kasutajanimi: ");
        kasutajaNimi = sc.nextLine();
        return kasutajaNimi;
    }

    public void tervita(Kasutaja kasutaja)  {
        System.out.println("Tere, " + kasutaja);
    }

    public void küsiJaLisaÜlesanne(Kasutaja kasutaja)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mis on ülesande sisu?");
        String ülesandeSisu = sc.nextLine();
        System.out.println("Mis on ülesande prioriteet? (punane, kollane, roheline, valge)");
        String prioriteet = sc.nextLine().strip().toLowerCase();
        System.out.println("Mitu korda seda ülesannet lahendada saab?");
        String kordusteArv = sc.nextLine().strip();
        kasutaja.lisaÜlesanne(ülesandeSisu, prioriteet,kordusteArv);
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
