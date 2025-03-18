public class PastaneReyonu {
    private int adet;
    private double tarti;

    public PastaneReyonu(int adet, double tarti) {
        this.adet = adet;
        this.tarti = tarti;
    }

    public void urunBilgisiGoster() {
        System.out.println("Adet: " + adet + ", Tartı: " + tarti + " kg");
    }
}

