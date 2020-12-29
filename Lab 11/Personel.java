public abstract class Personel extends Maas  implements Kisi {

    int odaNo;
    int haftalikCalismaSaati;
    int mesaiSaati;

    public Personel(int altLimit, int calismaYili, int bonusYuzdesi,int odaNo,int haftalikCalismaSaati,int mesaiSaati) {
        super(altLimit, calismaYili, bonusYuzdesi);
        this.odaNo = odaNo;
        this.haftalikCalismaSaati = haftalikCalismaSaati;
        this.mesaiSaati = mesaiSaati;
    }

    public abstract double MesailiMaas();

    public double SaatlikKazanc(){
        return MaasiHesapla()/(haftalikCalismaSaati*4);
    }
    public void OdaninYeriniYaz(){
        if(odaNo >50) System.out.println("oda muhendislik fakultesinde");
        else System.out.println("oda ... fakultesinde");
    }
}
