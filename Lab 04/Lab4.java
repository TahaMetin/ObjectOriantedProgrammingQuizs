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
public class Lab4 {

    public static void main(String[] args) {

        // calisma 1
        int[][] dizi = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("3x3 luk dizinin elemanlarini giriniz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dizi[i][j] = sc.nextInt();
            }
        }
        int enBuyuk = dizi[0][0], enKucuk = dizi[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (dizi[i][j] > enBuyuk) {
                    enBuyuk = dizi[i][j];
                }
                if (dizi[i][j] < enKucuk) {
                    enKucuk = dizi[i][j];
                }
            }
        }

        System.out.println("En buyuk deger olan " + enBuyuk + " ile en kucuk deger olan " + enKucuk + " arasindaki fark " + (enBuyuk - enKucuk) + " dir");

        // calisma 2
        int[] a = new int[10];
        int[] b = new int[10]; // cift sayilar
        int[] c = new int[10]; // tek sayilar
        int indexB = 0, indexC = 0;
        
        System.out.print("A:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                b[indexB] = a[i];
                indexB++;
            } else {
                c[indexC] = a[i];
                indexC++;
            }
        }
        System.out.println(" index b ve c -- >" + indexB + indexC);
        System.out.print("B: ");
        for (int i = 0; i < indexB; i++) {
            System.out.print(" " + b[i]);
        }
        System.out.print("\nC: ");
        for (int i = 0; i < indexC; i++) {
            System.out.print(" " + c[i]);
        }
        System.out.println(" ");
    }
}
