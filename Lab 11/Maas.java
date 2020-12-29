public class Maas {

    int maas;
    int altLimit;
    int calismaYili;
    int bonusYuzdesi;
    public Maas(int altLimit, int calismaYili, int bonusYuzdesi) {
        this.altLimit = altLimit;
        this.calismaYili = calismaYili;
        this.bonusYuzdesi = bonusYuzdesi;
    }

    public int MaasiHesapla(){
        maas = altLimit + calismaYili*1000;
        return maas;
    }
    public void ZamYap(){
        maas = maas*120/100;
    }
    public double BonusuHesapla(){
        return MaasiHesapla()*bonusYuzdesi/100;
    }
    public double IkramiyeyiHesapla(){
        return MaasiHesapla()/2;
    }

}
