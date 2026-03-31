public class Ülesanne {
    private String ülesandeSisu;
    private String prioriteet;
    private int kordusteArv;


    public String toString()    {
        return ülesandeSisu + ". Prioriteet - " + prioriteet + ". Korduste arv - " + kordusteArv;
    }

    public String vormistaFaili()   {
        return (ülesandeSisu + ";" + prioriteet.strip().toLowerCase() + ";" + kordusteArv);
    }

    public void setKordusteArv(int kordusteArv) {
        this.kordusteArv = kordusteArv;
    }

    public Ülesanne(String ülesandeSisu, String prioriteet, int kordusteArv) {
        this.ülesandeSisu = ülesandeSisu;
        this.prioriteet = prioriteet;
        this.kordusteArv = kordusteArv;
    }

    public String getPrioriteet() {
        return prioriteet;
    }

}
