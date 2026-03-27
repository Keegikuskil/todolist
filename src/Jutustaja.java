import java.util.Scanner;

public class Jutustaja {
    private String kasutajaNimi;

    public void küsiNime()   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palun sisesta om nimi: ");
        kasutajaNimi = sc.nextLine();
        System.out.println("Tere " + kasutajaNimi);
    }



    public void küsiTegevust(TodoList todoList) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mida soovid teha?");
        System.out.println("1 - vaata ülesandeid");
        System.out.println("2 - lisa ülesanne");
        System.out.println("3 - salvesta ja lõpeta");

        String sisend = sc.nextLine();
        if (Integer.parseInt(sisend) == 1)  {
            todoList.näitaÜlesandeid();
        }
        else if (Integer.parseInt(sisend) == 2) {
            System.out.println("Mis on prioriteet? (roheline, kollane, punane)");
            String prioriteet = sc.nextLine();
            System.out.println("Mis on ülesane sisu?");
            String ülesandeSisu = sc.nextLine();
            todoList.lisaÜlesanne(prioriteet, ülesandeSisu);
            System.out.println("Ülesanne lisatud!");
        }

        else if (Integer.parseInt(sisend) == 3) {
            todoList.kirjutaÜlesandedFaili("ülesanded.txt");

        }
    }
}
