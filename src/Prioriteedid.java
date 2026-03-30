import java.util.Map;

public class Prioriteedid {
    private static final Map<String, Integer> tabel = Map.of(
    "punane", 200,
    "kollane", 150,
    "roheline", 100,
    "valge", 50);

    public int getPunktid(String prioriteet) {
        return tabel.get(prioriteet);
    }
}
