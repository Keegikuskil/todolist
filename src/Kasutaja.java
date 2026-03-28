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

    public void lisaÜlesanne(String ülesandesisu, String prioriteet, String kordusteArv) {
        Ülesanne ülesanne = new Ülesanne(ülesandesisu, prioriteet, Integer.parseInt(kordusteArv));
        ülesanded.add(ülesanne);
    }

    public String toString()    {
        return kasutajaNimi + " (" + määraTase() + ", " + määraTiitel() + ")";
    }

    private int määraTase() {
        int tase = Math.round(((float) kogemuspunktid) / 150);
        return tase;
    }

    private String määraTiitel()    {
        int tase = määraTase();
        if (tase <= 6)   {
            return "Algaja";
        }
        else if (tase < 11)  {
            return "Harrastaja";
        }
        else if (tase < 21) {
            return "Tegutseja";
        }
        else if (tase < 50) {
            return "Planeerija";
        }
        else if (tase < 200)  {
            return "Koordinaator";
        }
        else {
            return "Taskmaster";
        }
    }

    public void lisaKogemuspunkte(int lisaPunktid) {
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
