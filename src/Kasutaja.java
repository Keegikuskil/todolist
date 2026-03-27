import java.util.ArrayList;
import java.util.List;

public class Kasutaja {
    private String kasutajaNimi;
    private int kogemuspunktid;
    private List<Ülesanne> ülesanded = new ArrayList<>();

    public Kasutaja(String kasutajaNimi, int kogemuspunktid, List<Ülesanne> ülesanded) {
        this.kasutajaNimi = kasutajaNimi;
        this.kogemuspunktid = kogemuspunktid;
        this.ülesanded = ülesanded;
    }

    private void lisaKogemuspunkte(int lisaPunktid) {
        kogemuspunktid += lisaPunktid;
    }

    public String getKasutajaNimi() {
        return kasutajaNimi;
    }

    public int getKogemuspunktid() {
        return kogemuspunktid;
    }

    public List<Ülesanne> getÜlesanded() {
        return ülesanded;
    }
}
