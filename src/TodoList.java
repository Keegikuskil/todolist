import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Random;

public class TodoList {
    private List<Ülesanne> ülesanded;
    private Random random = new Random();
    private int juhuarv = random.nextInt(1, 10000000);  //Pole ideaalne lahendus, et eristada ülesandeid. Korduvad numbrid jnejne

    public TodoList(List<Ülesanne> ülesanded) {
        this.ülesanded = ülesanded;
    }

    public List<Ülesanne> getÜlesanded() {
        return ülesanded;
    }

    public void näitaÜlesandeid()   {
        for (Ülesanne ülesanne : ülesanded) {
            System.out.println(ülesanne);
        }
    }

    public void lisaÜlesanne(String prioriteet, String ülesandeSisu) {
        Ülesanne ülesanne = new Ülesanne(ülesandeSisu, prioriteet, juhuarv);
        ülesanded.add(ülesanne);
    }

    public void kirjutaÜlesandedFaili(String failinimi) throws Exception {
        File fail = new File(failinimi);
        try (PrintWriter out = new PrintWriter(fail))   {
            for (Ülesanne ülesanne : ülesanded) {
                out.println(ülesanne.vormistaFaili());
            }
        }
    }
}

    //Lahendaülesanne vajab tegemist
    /*
    public void lahendaÜlesanne(int järjekorraNumber) {
        //Ülesanne lahendatudÜlesanne;
        boolean leitud = false;
        for (Ülesanne ülesanne : ülesanded) {
            if (ülesanne.getJärjekorraNumber() == järjekorraNumber) {
                Ülesanne lahendatudÜlesanne = ülesanne;
                leitud = true;
                break;
            }
        }
        if (leitud) {
            ülesanded.remove(lahendatudÜlesanne);
        }
    }

}

     */
