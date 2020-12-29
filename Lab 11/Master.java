public class Master extends LisansUstu {
    public Master(String adi, int gecmeNotu, int kredisi, int not1, int not2, int tezNotu) {
        super(adi, gecmeNotu, kredisi, not1, not2,tezNotu);
    }

    @Override
    public boolean MezunOlmaHakkiVarMi() {
        if(OrtalamaHesapla()/25 > 2 && teziGectiMi()) return true;
        else return false;
    }

    @Override
    public boolean OnurOgrencisiMi() {
        if(MezunOlmaHakkiVarMi() && OrtalamaHesapla()%25>2.5) return true;
        else return false;
    }


    @Override
    public void BilgileriYazdir() {
        System.out.print(adi+" isimli ogrencimiz "+ ortalama/25 + " ortalama ile okulumuzdan");
        if(MezunOlmaHakkiVarMi()){
            if(OnurOgrencisiMi()) System.out.println(" onur ogrencisi olaran mezun olmustur");
            else System.out.println(" mezun olmustur");
        }else System.out.println(" mezun olamamistir");
    }
}

