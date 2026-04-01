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
            elusidJuurde = prioriteedid.getPunktidPrioriteetidest(ülesanded.get(i).getPrioriteet());
            elusid += elusidJuurde;
        }
        this.elusid = elusid;
    }

    public int getElusid() {
        return elusid;
    }

    void saaHaiget(Ülesanne ülesanne) {
        Prioriteedid prioriteedid = new Prioriteedid();
        this.elusid = this.elusid - prioriteedid.getPunktidPrioriteetidest(ülesanne.getPrioriteet());
    }
}