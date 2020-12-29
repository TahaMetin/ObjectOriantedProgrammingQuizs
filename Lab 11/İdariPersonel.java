public class İdariPersonel extends Personel {

    String unvan;
    String sorumluOlduguSey;
    int yonetimTecrubesiYil;



    public İdariPersonel(int altLimit, int calismaYili, int bonusYuzdesi, int odaNo, int haftalikCalismaSaati, int mesaiSaati) {
        super(altLimit, calismaYili, bonusYuzdesi, odaNo, haftalikCalismaSaati, mesaiSaati);

    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public void setSorumluOlduguSey(String sorumluOlduguSey) {
        this.sorumluOlduguSey = sorumluOlduguSey;
    }

    public void setYonetimTecrubesiYil(int yonetimTecrubesiYil) {
        this.yonetimTecrubesiYil = yonetimTecrubesiYil;
    }

    @Override
    public void BilgileriYazdir() {
        System.out.println(isim +" isimli idari personel " + MaasiHesapla() + " tl maas almaktadir.");

    }
    public double MesailiMaas(){
        return MaasiHesapla() + mesaiSaati*1000;
    }
}
