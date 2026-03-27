import java.util.List;

public class TodoList {
    private List<Ülesanne> ülesanded;

    public TodoList(List<Ülesanne> ülesanded) {
        this.ülesanded = ülesanded;
    }

    public List<Ülesanne> getÜlesanded() {
        return ülesanded;
    }
}