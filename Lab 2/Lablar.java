/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lablar;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lablar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("------------Calsma 1---------------");
        Double girdi,sonuc;
        Scanner sc = new Scanner(System.in);
        System.out.println("4A2 -8A + 16 denklemi için A değerini giriniz:");
        girdi = sc.nextDouble();
        
        sonuc = 4*girdi*girdi - 8*girdi + 16;
        //         sonuc = 4*args[0]*args[0] - 8* args[0] + 16;

        System.out.println("Sonuc:"+sonuc);
           
        System.out.println("------------Calsma 2---------------");
        
        int kagitParaSayisi = 0,yenilenParaSayisi,girilenParaDegeri;
        
        System.out.println("Lütfen bir deger giriniz:");
        
        girilenParaDegeri = sc.nextInt();
        
        kagitParaSayisi += girilenParaDegeri/50;
        girilenParaDegeri  = girilenParaDegeri%50;
        kagitParaSayisi += girilenParaDegeri/25;
        girilenParaDegeri  = girilenParaDegeri%25;
        kagitParaSayisi += girilenParaDegeri/10;
        girilenParaDegeri  = girilenParaDegeri%10;
        kagitParaSayisi += girilenParaDegeri/5;
        girilenParaDegeri  = girilenParaDegeri%5;
        
        yenilenParaSayisi = girilenParaDegeri;
        
        System.out.println(kagitParaSayisi+" Kagit para -- " + yenilenParaSayisi + " TL nizi yedim :)");

        
    }
    
}
