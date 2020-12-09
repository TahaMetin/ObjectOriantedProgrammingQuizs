import java.util.ArrayList;

interface kumeInterface {

    public kume kesisim(kume a); // cagrici obje ile parametre objenin kesisiminden olusan kumeyi dondurur
    public kume fark(kume a); // cagrici obje ile parametre objenin farkindan olusan kumeyi dondurur
    public ArrayList<kume> altKumeler(); // kumenin alt kumelerinden olusan bir ArrayList<kume> dondurur
}
class kume implements kumeInterface {

    ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public kume() { // parametresiz constructor

    }

    public kume(int[] a){ // a dizisinin elemanlarindan olusan kume
        for(int i = 0; i < a.length ; i++){
            arrayList.add(a[i]);
        }
    }
    public kume(kume a){  //copy constructor
        arrayList = a.arrayList;
    }
    public void ekle(int a){ // kumeye yeni eleman ekleme
        arrayList.add(a);
    }
    public void yazdir(){ // kume icerigini yazdirir
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
            if(i<arrayList.size()-1) System.out.print(",");
        }
    }
    public boolean denk(kume a){ // cagrici obje ile parametre objenin denk kume olup olmadigini test eder
        if(arrayList.size() == a.arrayList.size()) return true;
        else     return false;
    }
    public boolean esit(kume a) { // cagrici obje ile parametre objenin esit kume olup olmadigini test eder
        if(denk(a)){
            for (int i = 0; i < arrayList.size(); i++) {
                if(!arrayList.contains(a.arrayList.get(i))) return false;
            }
            return true;
        }else   return false;

    }
    public kume birlesim(kume a) {// cagrici obje ile parametre objenin bilesiminden olusan kumeyi dondurur
        kume birlesimKume = new kume();
        for (int i = 0; i < arrayList.size(); i++) {
            birlesimKume.arrayList.add(arrayList.get(i));
        }
        for (int i = 0; i < a.arrayList.size(); i++) {
            if(!birlesimKume.arrayList.contains(a.arrayList.get(i)))  birlesimKume.arrayList.add(a.arrayList.get(i));
        }

        return birlesimKume;
    }



    @Override
    public kume kesisim(kume a) {
        kume kesisimKume = new kume();
        for (int i = 0; i < a.arrayList.size(); i++) {
            if(arrayList.contains(a.arrayList.get(i))) kesisimKume.arrayList.add(a.arrayList.get(i));
        }
        return kesisimKume;
    }

    @Override
    public kume fark(kume a) {
        kume farkKume = new kume();
        for (int i = 0; i < arrayList.size(); i++) {
            if(!a.arrayList.contains(arrayList.get(i))) farkKume.arrayList.add(arrayList.get(i));
        }
        return farkKume;
    }

    @Override
    public ArrayList<kume> altKumeler() {
        ArrayList<kume> sonuc = new ArrayList<kume>();
        int a = arrayList.size();
        for (int i = 0; i < (1<<a); i++) {
            kume kume = new  kume();
            for (int j = 0; j < a; j++) {
                if ((i & (1 << j)) > 0){
                    kume.arrayList.add(arrayList.get(j));
                }
            }
            sonuc.add(kume);
        }
        return  sonuc;
    }

    public static void main(String[] args) {
// TODO code application logic here
        kume km = new kume();
        km.ekle(10);
        km.ekle(11);
        km.ekle(2);
        System.out.print("km = {");
        km.yazdir();
        System.out.println("}");
        int[] a = {1, 2, 3, 4, 5, 6};
        kume km2 = new kume(a);
        System.out.print("km2 = {");
        km2.yazdir();
        System.out.println("}");
        kume km3 = new kume(a);
        System.out.print("km3 = {");
        km3.yazdir();
        System.out.println("}");
        if (km.denk(km2))
            System.out.println("km ve km2 kumeleri denk.");
        else
            System.out.println("km ve km2 kumeleri denk degil.");
        if (km2.esit(km3))
            System.out.println("km2 ve km3 kumeleri esit.");
        else
            System.out.println("km2 ve km3 kumeleri esit degil.");
        kume sn = km.birlesim(km2);
        System.out.print("km ve km2 birlesimi = {");
        sn.yazdir();
        System.out.println("}");
        kume sn2 = km.kesisim(km2);
        System.out.print("km ve km2 kesisimi = {");
        sn2.yazdir();
        System.out.println("}");
        kume sn3 = km.fark(km2);
        System.out.print("km ve km2 farki = [");
        sn3.yazdir();
        System.out.println("}");
        System.out.println("km\'nin alt kumeleri");
        ArrayList<kume> sonuc = km.altKumeler();
        for (int i = 0; i < sonuc.size(); i++) {
            System.out.print("{");
            sonuc.get(i).yazdir();
            System.out.println("}");
        }
    }


}

