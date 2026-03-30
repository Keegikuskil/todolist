import java.util.Map;

public class Prioriteedid {
    public static final Map<String, Integer> tabel = Map.of(
    "punane", 200,
    "kollane", 150,
    "roheline", 100,
    "valge", 50);

    public Map<String, Integer> getTabel() {
        return tabel;
    }
    public Integer getPunktidPrioriteetidest(String prioriteet) {
        return tabel.get(prioriteet);
    }
}
