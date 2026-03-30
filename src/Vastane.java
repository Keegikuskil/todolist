import java.util.List;

public class Vastane {
    int elud;

    void eludeArv(Kasutaja kasutaja) {


    }
    int prioriteetEludeks(Kasutaja kasutaja) {
        List<Ülesanne> ülesanded = kasutaja.getÜlesanded();
        Prioriteedid prioriteedid = new Prioriteedid();
        List<Integer> elusid = new List<>();
        for (int i=0, elusidJuurde = 0; i<ülesanded.size(); i++) {
            elusidJuurde = prioriteedid.getPunktidPrioriteetidest(String.valueOf(ülesanded.get(i)));
            elusid.add(elusidJuurde);
        }
    }
    // void saaHaiget();
}
