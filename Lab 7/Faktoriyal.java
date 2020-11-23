

package lablar.lab_7;

/**
 *
 * @author asayar
 */
public class Faktoriyal {
    
    private int deger;
    private int sonuc=1;
    
    /**
     * Faktoriyali bulunmak istenen
     * değeri atar
     * @param deger
     */
    public void setDeger(int deger){
        sonuc=1;
        this.deger = deger;
    }
    /**
     * Faktoriyali bulunmak istenen
     * dönderir
     * @return
     */
    public int getDeger(){
        return deger;
    }
    
    /** 
     * Girilen değerin faktorial değerini Islemlerim
     * class ındaki methodları kullanarak 
     * hesaplayıp sonuc parametresine yazdırır
     */    
    public void hesapla(){
        Islemlerim islemlerim = new Islemlerim(1);
        
        for(int i =deger;i>0;i--){
            sonuc *= (int)islemlerim.carp(i);
        }
    }
    
    /**
     * Degeri ve sonucu ekrana yazdırır
     */
    public void ekranaYazdir(){        
        System.out.println("Deger --> " + deger +"  Sonuc --> " + sonuc);
    }

}
