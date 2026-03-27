import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.PrintWriter;

public class Peaklass {
    public static void main(String[] args) throws Exception {
        String failinimi = "ülesanded.txt";
        TodoList todoList = new TodoList(loeÜlesanded(failinimi));

        for (Ülesanne ülesanne : todoList.getÜlesanded() )    {
            System.out.println(ülesanne);
        }

        todoList.lisaÜlesanne("punane", "Osta kingituseks kohuke");

        kirjutaÜlesandedFaili(todoList.getÜlesanded(), failinimi);
    }


    private static List<Ülesanne> loeÜlesanded(String failinimi) throws Exception {
        File fail = new File(failinimi);
        List<Ülesanne> ülesanded = new ArrayList<>();

        try(Scanner scanner = new Scanner(fail, "UTF-8"))   {
            while (scanner.hasNextLine())   {
                String[] rida = scanner.nextLine().split(";");
                Ülesanne ülesanne = new Ülesanne(rida[1], rida[0], Integer.parseInt(rida[2]));
                ülesanded.add(ülesanne);
            }

        }
        return ülesanded;
    }

    private static void kirjutaÜlesandedFaili(List<Ülesanne> ülesanded, String failinimi)   throws Exception {
        File fail = new File(failinimi);
        try (PrintWriter out = new PrintWriter(fail))   {
            for (Ülesanne ülesanne : ülesanded) {
                out.println(ülesanne.vormistaFaili());
            }
        }
    }
}
