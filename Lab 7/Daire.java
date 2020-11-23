
package lablar.lab_7;

/**
 *
 * @author asayar
 */
public class Daire {
    
    // Class parametreleri
    public double PI=3.14;
    public int yaricap;
    
    /**
     * Constructor
     * @param yaricap Dairenin yarıçapı
     */
    public Daire(int yaricap){
        this.yaricap = yaricap;
    }
    
    /**
     * Dairenin alanını Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return alanı double cinsinden dondurur
     */
    public double  alanHesapla(){
        double sonuc=1;
        Islemlerim islemlerim = new Islemlerim(sonuc);
        sonuc *= islemlerim.carp(PI);        
        sonuc *= islemlerim.carp(yaricap);
        sonuc *= islemlerim.carp(yaricap);

        return sonuc;
    }
    
    /**
     * Dairenin çevresini Islemlerim class ındaki 
     * methodları kullanarak hesaplar
     * @return cevreyi double cinsinden dondurur
     */
    public double cevreHesapla(){
        double sonuc=1;
        Islemlerim islemlerim = new Islemlerim(sonuc);
        sonuc *= islemlerim.carp(2);
        sonuc *= islemlerim.carp(yaricap);
        sonuc *=  islemlerim.carp(PI);
        return sonuc;
    }
    
    /**
     * Bir dairenin cevresinin alanından büyüyk
     * olup olmadığını Islemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanBuyuktur(){
        Islemlerim islemlerim = new Islemlerim(cevreHesapla());
        if(islemlerim.buyukdur(alanHesapla())){
            return true;
        }
        return false;
    }
    
    /**
     * Bir dairenin cevresinin alanından küçük
     * olup olmadığını ıslemlerim class ındaki 
     * methodları kullanarak belirler
     * @return boolean değer dönderir
     */
    public boolean cevreAlandanKucuktur(){
        Islemlerim islemlerim = new Islemlerim(cevreHesapla());

        if(islemlerim.kucuktur(alanHesapla())){
            return true;
        }
        return false;
    }
    
    /**
     * Dairenin alanını ve çevresini ekrana yazdırır.
     */
    public void ekranaYazdir(){
        System.out.println("Dairenin alani --> " + alanHesapla());
        System.out.println("Dairenin cevresi --> " + cevreHesapla());
    }
    
    

}
