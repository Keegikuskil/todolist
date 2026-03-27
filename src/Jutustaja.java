import java.util.Scanner;

public class Jutustaja {
    private String kasutajaNimi;

    public String küsiNime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palun sisesta oma kasutajanimi: ");
        kasutajaNimi = sc.nextLine();
        return kasutajaNimi;
    }
}
