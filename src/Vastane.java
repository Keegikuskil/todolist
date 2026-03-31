import java.util.List;

public class Vastane {
    int elusid;

    Vastane(int elusid) {
        this.elusid = elusid;
    }

    void prioriteedidEludeks(Kasutaja kasutaja) {
        List<Ülesanne> ülesanded = kasutaja.getÜlesanded();
        Prioriteedid prioriteedid = new Prioriteedid();
        int elusid = 0;
        for (int i=0, elusidJuurde = 0; i<ülesanded.size(); i++) {
            elusidJuurde = prioriteedid.getPunktidPrioriteetidest(String.valueOf(ülesanded.get(i)));
            elusid += elusidJuurde;
        }
        this.elusid = elusid;
    }
    void saaHaiget(Ülesanne ülesanne) {
        Prioriteedid prioriteedid = new Prioriteedid();
        this.elusid = this.elusid - prioriteedid.getPunktidPrioriteetidest(String.valueOf(ülesanne.getPrioriteet());
    };
}
