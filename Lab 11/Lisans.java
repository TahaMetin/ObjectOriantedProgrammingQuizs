public class Lisans extends Ogrenci {
    public Lisans(String adi, int gecmeNotu, int kredisi, int not1, int not2) {
        super(adi, gecmeNotu, kredisi, not1, not2);
    }


    public boolean MezunOlmaHakkiVarMi() {
        if(OrtalamaHesapla()/25 > 2) return true;
        else return false;
    }

    public boolean OnurOgrencisiMi(){
        if(OrtalamaHesapla()/25 > 2) return true;
        else return false;
    }

    public void BilgileriYazdir() {
        System.out.print(adi+" isimli ogrencimiz "+ ortalama/25 + " ortalama ile okulumuzdan");
        if(MezunOlmaHakkiVarMi()){
            if(OnurOgrencisiMi()) System.out.println(" onur ogrencisi olaran mezun olmustur");
            else System.out.println(" mezun olmustur");
        }else System.out.println(" mezun olamamistir");
    }
}
