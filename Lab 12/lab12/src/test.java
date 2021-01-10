// Muhammed Taha Metin 190201023
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException
    {
        try {

            Scanner scanner = new Scanner(new File("ali_bilge.txt"));
            String tutucu = scanner.nextLine();
            String[] splited = tutucu.split(" ");
            Ogrenci ali = new Ogrenci();
            ali.setAd(splited[0]);
            ali.setSoyad(splited[1]);
            ali.setOgrenciNO(scanner.nextLine());
            while (scanner.hasNextLine()) {
                tutucu = scanner.nextLine();
                splited =tutucu.split(" ");
                Ders ders = new Ders(splited[0],splited[1],Integer.parseInt(splited[2]));
                ali.DersEkle(ders);
            }
            scanner.close();
            ali.BilgileriYaz();
            System.out.println("\nDersler");
            ali.DersleriListele();
            System.out.println("ogrenci ortalamasi: " + ali.OrtalamaNot());

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
