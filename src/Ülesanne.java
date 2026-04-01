public class Ülesanne {
    private String ülesandeSisu;
    private String prioriteet;


    public String toString()    {
        return ülesandeSisu + ". Prioriteet - " + prioriteet + ".";
    }

    public String vormistaFaili()   {
        return (ülesandeSisu + ";" + prioriteet.strip().toLowerCase());
    }

    public Ülesanne(String ülesandeSisu, String prioriteet) {
        this.ülesandeSisu = ülesandeSisu;
        this.prioriteet = prioriteet;
    }

    public String getPrioriteet() {
        return prioriteet;
    }

}
