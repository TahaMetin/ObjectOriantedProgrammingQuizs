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
public class Lab5 {
    public static void main(String[] args) {
        
        
        //calisma 1
        
        
        int girdi,toplam=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println(" Lütfen bir sayı giriniz. Eğer çıkmak istiyorsanız 0’a basınız. ");
            girdi = sc.nextInt();
            toplam += girdi;
            
        }while(girdi != 0);
        System.out.println("toplam: "+toplam);
        
        //calisma 2
        
        int diziUzunlugu = 5;
        int j=0,k=0;
        int[] dizi = {2,5,11,7,6};
        
        int[] b = new int[3];
        int[] c = new int[2];
        
        for (int i = 0; i < diziUzunlugu; i++) {
            if(i%2==0){
                b[k]=dizi[i];
                k++;
            }else{
                c[j]=dizi[i];
                j++;
            }
        }
        System.out.print("A: ");            
        for (int i = 0; i < diziUzunlugu    ; i++) {
            System.out.print(" "+dizi[i]);            
        }
        System.out.print("\nB: ");            
        for (int i = 0; i < 3    ; i++) {
            System.out.print(" "+b[i]);            
        }
        System.out.print("\nC: ");            
        for (int i = 0; i < 2    ; i++) {
            System.out.print(" "+c[i]);            
        }
    }
}
