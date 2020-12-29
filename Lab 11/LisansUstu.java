public abstract class LisansUstu extends Ogrenci {

    int tezNotu;


    public LisansUstu(String adi, int gecmeNotu, int kredisi, int not1, int not2,int tezNotu) {
        super(adi, gecmeNotu, kredisi, not1, not2);
        this.tezNotu = tezNotu;
    }

    public boolean teziGectiMi(){
        if(tezNotu>50) return true;
        else return false;
    }

}
