//import java.util.Date;

public class Ülesanne {
    private String ülesandeSisu;
    private String prioriteet;
    private boolean kasOnLahendatud;
    //private Date lisamisKuupäev;
    //private Date tähtaeg;


    public Ülesanne(String ülesandeSisu, String prioriteet, boolean kasOnLahendatud) {
        this.ülesandeSisu = ülesandeSisu;
        this.prioriteet = prioriteet;
        this.kasOnLahendatud = kasOnLahendatud;
    }

    public void lahenda()   {
        kasOnLahendatud = true;
    }

}
