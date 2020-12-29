public class AkademikPersonel extends Personel {

    String bolum;
    String fakutle;
    String yayınSayisi;


    public AkademikPersonel(int altLimit, int calismaYili, int bonusYuzdesi, int odaNo, int haftalikCalismaSaati, int mesaiSaati) {
        super(altLimit, calismaYili, bonusYuzdesi, odaNo, haftalikCalismaSaati, mesaiSaati);
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setFakutle(String fakutle) {
        this.fakutle = fakutle;
    }

    public void setYayınSayisi(String yayınSayisi) {
        this.yayınSayisi = yayınSayisi;
    }

    @Override
    public void BilgileriYazdir() {
        System.out.println(isim +" isimli akademik personel " + MaasiHesapla() + " tl maas almaktadir.");
    }
    public double MesailiMaas(){
        return MaasiHesapla() + mesaiSaati*500;
    }
}
