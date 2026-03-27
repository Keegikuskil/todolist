//import java.util.Date;

public class Ülesanne {
    private String ülesandeSisu;
    private String prioriteet;
    //private boolean kasOnLahendatud;
    //private Date lisamisKuupäev;
    //private Date tähtaeg;

    public String toString()    {
        return ülesandeSisu + ". Prioriteet - " + prioriteet;
    }

    public String vormistaFaili()   {
        return ((prioriteet).strip() + ";" + ülesandeSisu);
    }


    public Ülesanne(String ülesandeSisu, String prioriteet) {
        this.ülesandeSisu = ülesandeSisu;
        this.prioriteet = prioriteet;
    }

    //public void lahenda()   {
        //kasOnLahendatud = true;

}
