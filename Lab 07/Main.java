
package lablar.lab_7;

import java.util.Scanner;

/**
 *
 * @author asayar
 */
public class Main {
    
    public static void main(String[] args) {
        
        Islemlerim islemlerim = new Islemlerim(5.5);
        System.out.println("islemlerim.topla --> "+ islemlerim.topla(9.5));
        System.out.println("islemlerim.cikar --> "+ islemlerim.cikar(9.5));
        System.out.println("islemlerim.carp --> "+ islemlerim.carp(9.5));
        System.out.println("islemlerim.bol --> "+ islemlerim.bol(9.5));
        System.out.println("islemlerim.buyukdur --> "+ islemlerim.buyukdur(9.5));
        System.out.println("islemlerim.kucuktur --> "+ islemlerim.kucuktur(9.5));
        System.out.println("islemlerim.esittir --> "+ islemlerim.esittir(9.5));

        Scanner sc = new Scanner(System.in);
        System.out.print("Daire icin yaricap giriniz: ");
        int yaricap = sc.nextInt();
        Daire daire1 = new Daire(yaricap);
        Daire daire2 = new Daire(11);

        System.out.println("daire.alanHesapla --> " + daire1.alanHesapla());
        System.out.println("daire.cevreHesapla --> " + daire1.cevreHesapla());
        System.out.println("daire.cevreAlandanBuyuktur --> " + daire1.cevreAlandanBuyuktur());
        System.out.println("daire.cevreAlandanKucuktur --> " + daire1.cevreAlandanKucuktur());
        daire1.ekranaYazdir();

        System.out.println("daire.alanHesapla --> " + daire2.alanHesapla());
        System.out.println("daire.cevreHesapla --> " + daire2.cevreHesapla());
        System.out.println("daire.cevreAlandanBuyuktur --> " + daire2.cevreAlandanBuyuktur());
        System.out.println("daire.cevreAlandanKucuktur --> " + daire2.cevreAlandanKucuktur());
        daire2.ekranaYazdir();
        
        Faktoriyal faktoriyel = new Faktoriyal();
        faktoriyel.setDeger(5);
        faktoriyel.hesapla();
        faktoriyel.ekranaYazdir();
        faktoriyel.setDeger(10);
        faktoriyel.hesapla();
        faktoriyel.ekranaYazdir();

    }
}
