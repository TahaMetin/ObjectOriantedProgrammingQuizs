import java.util.ArrayList;

public abstract class Ogrenci extends Ders implements Kisi  {

    ArrayList<Ders> dersler= new ArrayList<Ders>();
    double ortalama;
    public Ogrenci(String adi, int gecmeNotu, int kredisi, int not1, int not2) {
        super(adi, gecmeNotu, kredisi, not1, not2);
    }

    public void DersleriListele(){
        for (Ders ders:dersler) {
            System.out.print("ders adi: " + adi+ "\nOrtalama: " +ortalama +"\nGecti mi: ");
            if(ders.DerstenGectiMi())   System.out.println("evet");
            else System.out.println("hayir");
        }
    }
    public void DersEkle(String adi, int gecmeNotu, int kredisi,int not1,int not2){
        Ders yeniDers = new Ders(adi,gecmeNotu,kredisi,not1,not2);
        dersler.add(yeniDers);
    }
    public void DersSil(String ad){
        for (int i = 0; i < dersler.size(); i++) {
            if(dersler.get(i).adi==ad){
                dersler.remove(i);
                return;
            }
        }
    }
    public double OrtalamaHesapla(){
        int agirlikliToplam=0;
        int toplamAgirlik=0;
        for (Ders ders :
                dersler) {
            agirlikliToplam += ders.AgirlikliNotOrtalamasi();
            toplamAgirlik += ders.kredisi;
        }
        ortalama =agirlikliToplam/toplamAgirlik;
        return ortalama;
    }

    public abstract boolean MezunOlmaHakkiVarMi();
    public abstract boolean OnurOgrencisiMi();
}
