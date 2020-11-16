/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lablar;

import java.util.Random;

/**
 *
 * @author Administrator
 */
class TamSayi {

    int[] array;

    TamSayi() {
        int diziBoyutu = 15;
        array = new int[diziBoyutu];

        Random rand = new Random();

        for (int i = 0; i < diziBoyutu; i++) {
            array[i] = rand.nextInt(100);
        }
    }

    public int sum() {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        return toplam;
    }

    void Yazdir() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }

}

public class Lab6 {

    public static void main(String[] args) {
        int diziBoyutu1 = 5;
        int diziBoyutu2 = 5;

        int[][] array = CreateArray(diziBoyutu1, diziBoyutu2);
        System.out.println("Calisma 1:");
        for (int i = 0; i < diziBoyutu1; i++) {
            for (int j = 0; j < diziBoyutu2; j++) {
                System.out.println(array[i][j]);
            }
        }
        System.out.println("Calisma 2:");

        TamSayi tamSayi = new TamSayi();
        tamSayi.Yazdir();
        System.out.println("sum = " + tamSayi.sum());

    }

    public static int[][] CreateArray(int satirSayisi, int sutunSayisi) {
        int[][] array = new int[satirSayisi][sutunSayisi];
        Random rand = new Random();

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < sutunSayisi; j++) {
                array[i][j] = rand.nextInt(100);
            }
        }

        return array;
    }

}
