public class SaklamaAlani {
    private double sicaklik;
    private double nem;
    private int doluluk;

    public SaklamaAlani(double sicaklik, double nem, int doluluk) {
        this.sicaklik = sicaklik;
        this.nem = nem;
        this.doluluk = doluluk;
    }

    public void alanBilgisiGoster() {
        System.out.println("Sıcaklık: " + sicaklik + "°C, Nem: " + nem + "%, Doluluk: " + doluluk + "%");
    }
}
