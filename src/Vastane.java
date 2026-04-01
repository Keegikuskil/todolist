import java.util.List;
import java.util.Random;

public class Vastane {
    public int elusid;

    Vastane(int elusid) {
        this.elusid = elusid;
    }

    void prioriteedidEludeks(Kasutaja kasutaja) {
        List<Ülesanne> ülesanded = kasutaja.getÜlesanded();
        Prioriteedid prioriteedid = new Prioriteedid();
        int elusid = 0;
        Random random = new Random();
        for (int i=0, elusidJuurde = 0; i<ülesanded.size(); i++) {
            elusidJuurde = prioriteedid.getPunktidPrioriteetidest(ülesanded.get(i).getPrioriteet());
            elusid += elusidJuurde;
        }
        this.elusid = random.nextInt(50, elusid/ülesanded.size());
    }

    public int getElusid() {
        return elusid;
    }

    void saaHaiget(Ülesanne ülesanne) {
        Prioriteedid prioriteedid = new Prioriteedid();
        this.elusid = this.elusid - prioriteedid.getPunktidPrioriteetidest(ülesanne.getPrioriteet());
    }
}