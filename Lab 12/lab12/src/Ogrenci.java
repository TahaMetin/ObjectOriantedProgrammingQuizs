// Muhammed Taha Metin 190201023
public class Ogrenci {
    private String ad,soyad,ogrenciNO;
    Ders[] dersler = new Ders[6];
    int sayac=0;

    public Ogrenci(String ad, String soyad, String ogrenciNO, Ders[] dersler) {
        this.ad = ad;
        this.soyad = soyad;
        this.ogrenciNO = ogrenciNO;
        this.dersler = dersler;
    }
    public Ogrenci() {
    }
    void DersEkle(Ders ders){
        dersler[sayac]=ders;
        sayac++;
    }
    void BilgileriYaz(){
        System.out.println(ad+ " " + soyad + "  " +ogrenciNO);
    }
    double OrtalamaNot(){
        int toplam=0;
        for (Ders ders :
                dersler) {
            toplam += ders.getNot();
        }
        return toplam/(double)dersler.length;
    }
    void DersleriListele(){
        for (Ders ders :
                dersler) {
            System.out.println("ders: " + ders.getAd() + "\ndödemi: " + ders.getDonem() + "\nNotu: "+ ders.getNot());
            System.out.println("-------------------------");
        }
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getOgrenciNO() {
        return ogrenciNO;
    }

    public void setOgrenciNO(String ogrenciNO) {
        this.ogrenciNO = ogrenciNO;
    }

    public Ders[] getDersler() {
        return dersler;
    }

    public void setDersler(Ders[] dersler) {
        this.dersler = dersler;
    }


}
