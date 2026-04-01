public class TestKlass {
    public static void main(String[] args) throws Exception {
        Andmebaas testAndmebaas = new Andmebaas();
        Jutustaja testJutustaja = new Jutustaja();

        //Andmebaasi meetodid
        String testNimi = "Joonas";
        Kasutaja testKasutaja = testAndmebaas.logiSisse(testNimi);

        //Kasutaja testimine
        System.out.println(testKasutaja);
        System.out.println(testKasutaja.getElud());
        testKasutaja.lisaÜlesanne("kontrolltööks kordamine", "roheline");
        testKasutaja.lisaÜlesanne("juhendajaga kokkusaamine", "punane");
        System.out.println(testKasutaja);
        System.out.println(testKasutaja.määraTase());
        System.out.println(testKasutaja.getKasutajaNimi());
        System.out.println(testKasutaja.getÜlesanded());
        System.out.println(testKasutaja.getKogemuspunktid());


    }
}
