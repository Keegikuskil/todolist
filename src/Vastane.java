import java.util.List;

public abstract class Vastane {
    public void eludeArv(Kasutaja kasutaja) {
        List<Ülesanne> ülesanded = kasutaja.getÜlesanded();

        for (int i=0, elusid=0; i<ülesanded.size(); i++) {
            //elusid += prioriteedid().get(ülesanded(i));
        //võtta ülesanne ning tagastada selle prioriteedi punktiarv prioriteetPunktideks abiga
        }

    };
    public abstract void saaHaiget();

    public abstract void teeHaiget();
}
