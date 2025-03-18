public class MaliModul {
    private double gelir;
    private double gider;

    public MaliModul(double gelir, double gider) {
        this.gelir = gelir;
        this.gider = gider;
    }

    public void karZararHesapla() {
        double kar = gelir - gider;
        System.out.println("Kar/Zarar: " + kar + " TL");
    }
}