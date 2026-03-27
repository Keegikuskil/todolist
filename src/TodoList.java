import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Ülesanne> ülesanded = new ArrayList<>();

    public TodoList(List<Ülesanne> ülesanded) {
        this.ülesanded = ülesanded;
    }

    public List<Ülesanne> getÜlesanded() {
        return ülesanded;
    }

    public void lisaÜlesanne(String prioriteet, String ülesandeSisu) {
        Ülesanne ülesanne = new Ülesanne(ülesandeSisu, prioriteet);
        ülesanded.add(ülesanne);
    }

    public void eemaldaÜlesanne(Ülesanne ülesanne)  { ülesanded.remove(ülesanne);}
}
