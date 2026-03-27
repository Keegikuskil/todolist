//import java.util.Date;

public class Ülesanne {
    private String ülesandeSisu;
    private String prioriteet;
    private int järjekorraNumber;
    //private boolean kasOnLahendatud;
    //private Date lisamisKuupäev;
    //private Date tähtaeg;

    public int getJärjekorraNumber() {
        return järjekorraNumber;
    }

    public String toString()    {
        return ülesandeSisu + ". Prioriteet - " + prioriteet + ". Kood: " + järjekorraNumber;
    }

    public String vormistaFaili()   {
        return ((prioriteet).strip() + ";" + ülesandeSisu + ";" + järjekorraNumber);
    }


    public Ülesanne(String ülesandeSisu, String prioriteet, int järjekorraNumber) {
        this.ülesandeSisu = ülesandeSisu;
        this.prioriteet = prioriteet;
        this.järjekorraNumber = järjekorraNumber;
    }

    //public void lahenda()   {
        //kasOnLahendatud = true;

}
