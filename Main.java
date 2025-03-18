public class Main {
    public static void main(String[] args) {
        // Modülleri oluşturun
        AkilliKasa kasa = new AkilliKasa();
        PastaneReyonu pastane = new PastaneReyonu(50, 1.2);
        SaklamaAlani saklamaAlani = new SaklamaAlani(22.5, 50, 80);
        StokRaporu rapor = new StokRaporu();
        TedarikModeli tedarik = new TedarikModeli();
        PersonelModulu personel = new PersonelModulu();
        MaliModul mali = new MaliModul(5000, 2000);

        // Fonksiyonları çağırın
        kasa.ödemeYap(100.0);
        pastane.urunBilgisiGoster();
        saklamaAlani.alanBilgisiGoster();
        rapor.raporGoster();
        tedarik.siparisTahminEt();
        personel.musteriDestegiVer();
        mali.karZararHesapla();
    }
}