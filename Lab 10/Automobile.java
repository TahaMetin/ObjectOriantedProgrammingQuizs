/* 190201023 Muhammed Taha Metin  */

public class Automobile implements Arac {
    double fuel;
    double speed;
    String license;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    long girisZamani;
    // otoparktaki araç sayısını 1 artıracak, fueli ve speed i 0 yapacak license’i ise null
    public Automobile(){
        //doldur
        setLicense(null);
        setFuel(0);
        setFuel(0);
    }

    public Automobile(double f, double s, String l)
    {
        //doldur
        setFuel(f);
        setLicense(l);
        setSpeed(s);
    }
    public Automobile(String l) {
        this.setLicense(l);
    }

    private void setLicense(String l) {
        this.license = l;
    }


    // Hızlan metodunda hız saatte 300'u geçmeyecek, kontrolleri yazın.
    // hızlanma oranın (0-1] aralığında olduğundan emin olun.
    // bu şartları sağlamıyorsa hız değişmeyecek ve ekrana hız değişmedi yazılacak.
    public void hızlan(double hızlanmaOranı){
        //doldur
        if(hızlanmaOranı<=0 && hızlanmaOranı>1)
            System.out.println("Hız değişmedi");
        setSpeed(getSpeed()+getSpeed()*hızlanmaOranı);
        if(getSpeed()>300)
            setSpeed(300);

    }
    // yavasla metodunda yavaşlarken hızın 0 ın altına düşmediğinden emin olun. Düşerse 0 yapın.
    // yavaşlama oranın (0-1] aralığında olduğundan emin olun.
    // bu şartları sağlamıyorsa hız değişmeyecek ve ekrana hız değişmedi yazılacak.
    public void yavasla(double yavaslamaOranı){
//doldur
        if(yavaslamaOranı<=0 && yavaslamaOranı>1)
            System.out.println("Hız değişmedi");
        setSpeed(getSpeed()-getSpeed()*yavaslamaOranı);
        if(getSpeed()<0)
            setSpeed(0);
    }

    // aracın hızını 0 yapar.
    // ekrana da hız sıfırlandı araç durdu yazar.
    public void stop() {
//doldur
        setSpeed(0);
        System.out.println("Hız sıfırlandı araç durdu");
    }
    // TÜM DEĞİŞKENLER İÇİN SET VE GET METOTLARINI YAZINIZ.
    // doldur
}