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

    public java.util.HashMap<String, Integer> prioriteedid() {
        java.util.HashMap<String, Integer> prioriteetPunktideks = new java.util.HashMap<>;
        prioriteetPunktideks.put("punane", 200);
        prioriteetPunktideks.put("kollane", 150);
        prioriteetPunktideks.put("roheline", 100);
        prioriteetPunktideks.put("valge", 50);
        return prioriteetPunktideks;
    }

}
