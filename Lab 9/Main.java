
public class Main {

    public static void main(String[] args) {
// TODO code application logic here
        Daire d1 = new Daire(1,1);
        Daire d2 = new Daire(2,3, 2);
        Dortgen dg1 = new Dortgen(2,2);
        System.out.println(d1.alan());
        System.out.println(d2.alan());
        System.out.println(dg1.alan());
        d1.enUst();
        d2.enUst();
        dg1.enUst();
        d1.listele();
        d2.sil();
        d1.listele();
    }


}
