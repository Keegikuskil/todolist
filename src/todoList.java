import java.util.ArrayList;
import java.util.List;

public class todoList {
    private List<Ülesanne> ülesanded = new ArrayList<>();

    public void lisaÜlesanne(Ülesanne ülesanne) {
        ülesanded.add(ülesanne);
    }
}
