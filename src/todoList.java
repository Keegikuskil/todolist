import java.util.ArrayList;
import java.util.List;

public class todoList {
    private List<Ülesanne> ülesanded = new ArrayList<>();

    public void lisaÜlesanne(Ülesanne ülesanne) {
        ülesanded.add(ülesanne);
    }

    public void eemaldaÜlesanne(Ülesanne ülesanne)  { ülesanded.remove(ülesanne);}
}
