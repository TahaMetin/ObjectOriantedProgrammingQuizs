/* 190201023 Muhammed Taha Metin  */
import java.util.Vector;

public class Autopark {
    public  Vector<Automobile> sayarpark;
    static long otoparkKasasi = 0;
    int sayac=0;
    // vector tipinde otopark oluşturun boyutu size kadar olsun.
    // otopark kasasını 0 yapın.
    Autopark(int size){
        //doldur
        sayarpark = new Vector<Automobile>();
        sayarpark.setSize(size);
        otoparkKasasi = 0; // ? yapmak gerekmiyor ama istenmiş
    }

    // Automobile otoparka giriyor. otoparktaki araçların otopark kapasitesini
    // geçmediğini kontrol edin. Otoparka girdiğinde otonun giriş zamanını kaydedin.
    // bunun için System.currentTimeMillis(); kullanın
    // eğer araç park edemezse, yani otopark doluysa, [license no] "park edemedi" yazılsın.
    public void girisYap(Automobile oto) {
        //doldur
        if(sayarpark.get(sayarpark.size()-1)!=null){
            System.out.println(oto.getLicense() +" park edemedi.");
        }else{
            System.out.println(oto.getLicense() + " otoparka girdi. Otapark kapasitesi ve boyutu:" + sayarpark.size()+
                    ","+ sayac);
            oto.setGirisZamani(System.currentTimeMillis());
            sayarpark.setElementAt(oto,sayac);
            sayac++;
        }
    }
    // içeride kalınan zamanı bulun. (çıkarken bulunan zaman - girişzamanı)
    //(içerde kalınan zaman/100f) * 10 ile kasaya eklenecek miltarı bulun.
    // bu miktarı kasaya ekleyin. Aracı otoparktan remove edin.
    // ekrana hangi araç çıktığını plaka ile, nekadar süre kaldığını ve kaç tl ödediğini de yazdırın.
    // eğer çıkacak olan araç otoparkta var ise çıkar. Parkta yoksa araç bulunamadı diye ekrana yazar.
    public void cikisYap(Automobile oto) {
        //doldur
        if(sayarpark.contains(oto)){
            long icerdeKalinanZaman = System.currentTimeMillis() - oto.getGirisZamani();
            otoparkKasasi += (icerdeKalinanZaman/100l)*10l;
            System.out.println(oto.license+ " otoparktan " + icerdeKalinanZaman + " milisaniye sonra cikti." +
                    "Kasaya eklenicek tutar( " + icerdeKalinanZaman/100l+"."+icerdeKalinanZaman%100l +
                    " saniye * Saniye Basina 10TL ) = " +icerdeKalinanZaman/10f);
            sayarpark.remove(oto);
            sayac--;
        }else{
            System.out.println("Araç bulunamadı.");
        }

    }

    // otopark kasasında kaç TL olduğunu ekranda gösterecek.
    public static void kasaBilgi() {
        //doldur
        System.out.println("Kasadaki toplam para: "+ otoparkKasasi);
    }

    // Çalışma-1 ile ilgili
    public int recursiveTopl(int n){
        if(n==0) return 0;
        return 3*recursiveTopl(n)/2 + n;
    }


    // Ornek Test senaryosu
    public static void main(String[] args) throws InterruptedException {
        Autopark park = new Autopark(1);
        Automobile a = new Automobile("41 BR 123");
        Automobile b = new Automobile("34 TR 456 ");
        park.girisYap(a); // a otoparka giris yapiyor
        Thread.sleep(200); // 200 milisaniye zaman geçiyor.

        park.girisYap(b); // b otoparka giris yapiyor
        Thread.sleep(999); // 999 milisaniye zaman geçiyor
        park.cikisYap(b);  // b otoparktan cikiyor
        park.cikisYap(a); // a otoparktan çıkıyor –aslında yukarda kapasitededen dolayı giremediği için
        //(park edemedi) araç bulunamadı yaziyo
        park.kasaBilgi(); // otoparktaki toplam parayı yazdırıyor.
    }
}
