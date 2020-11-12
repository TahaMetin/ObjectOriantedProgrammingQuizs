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
public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String birinciCumle,ikinciCumle;
        
        System.out.println("Birinci cümleyi giriniz: ");
        birinciCumle = sc.nextLine();
        System.out.println("İkinci cümleyi giriniz: ");
        ikinciCumle = sc.nextLine();

        // a şıkkı
        // iki cümleyi kıyaslayan kod
        
        boolean cumlelerAyniMi = false;
        if(birinciCumle.length() == ikinciCumle.length()){
                       for (int i = 0; i < birinciCumle.length(); i++) {
                if (birinciCumle.charAt(i) != ikinciCumle.charAt(i)){
                    cumlelerAyniMi = false;
                    break;
                } else {
                    cumlelerAyniMi = true;
                }
                //System.out.println(birinciCumle.charAt(i) + " --- " + ikinciCumle.charAt(i));
            }   
        } else {
            cumlelerAyniMi = false;
        }
  
        
        if (cumlelerAyniMi) {
            System.out.println(" - iki cümle eşittir");
        } else{
            System.out.println(" - iki cümle farklidir");
        }
        
        
        
        // b şıkkı
        // birinci cümleyi tersten yazan kod
        
        
//        for (int i = 0; i <= birinciCumle.length() -1; i++) {
//            System.out.print(birinciCumle.charAt(birinciCumle.length() - i-1));
//        }
        
        
    }
}
