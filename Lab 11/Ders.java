public class Ders {

    String adi;
    int gecmeNotu;
    int kredisi;
    int not1,not2;
    public Ders(String adi, int gecmeNotu, int kredisi,int not1,int not2) {
        this.adi = adi;
        this.gecmeNotu = gecmeNotu;
        this.kredisi = kredisi;
        this.not1 = not1;
        this.not2 = not2;
    }

    public Ders(String adi, int gecmeNotu, int kredisi) {
        this.adi = adi;
        this.gecmeNotu = gecmeNotu;
        this.kredisi = kredisi;
    }

    public double AgirlikliNotOrtalamasi(){
        return NotOrtalaması()*kredisi;
    }
    public double NotOrtalaması(){
        return (not1+not2)/2.0;
    }

    public boolean DerstenGectiMi(){
        if(gecmeNotu<=NotOrtalaması())
            return true;
        else
            return false;
    }


}
