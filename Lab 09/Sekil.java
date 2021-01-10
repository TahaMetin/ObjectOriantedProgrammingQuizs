
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

abstract class Sekil {
    private static ArrayList<Sekil> sekiller = new ArrayList<Sekil>();
    int x,y;
    static int sayac = 0;
    int varlikID;
    Sekil (int x,int y){
        this.x = x;
        this.y = y;
        varlikID = sayac;
        sayac++;
        sekiller.add(this);
    }

    public abstract float alan();

    public abstract float cevre();

    public void listele(){
        for(int i = 0; i<sekiller.size();i++){
            System.out.println(sekiller.get(i).varlikID +" sirada yaratildi");
            if(sekiller.get(i) instanceof Dortgen){
                System.out.println("Sekil sinifi :dortgen");
            }
            else{
                System.out.println("Sekil sinifi :daire ");
            }
            System.out.println("X: " + sekiller.get(i).x);
            System.out.println("Y: " + sekiller.get(i).y);
        }
    }


    public void enUst(){
        if(sekiller.get( sekiller.size()-1) instanceof Dortgen){
            System.out.println("Sekil sinifi :dortgen");
        }
        else{
            System.out.println("Sekil sinifi :daire ");
        }
        System.out.println("x: " +sekiller.get( sekiller.size()-1).x);
        System.out.println("y: " +sekiller.get(sekiller.size()-1).y);
        System.out.println("Alan: " +sekiller.get(sekiller.size()-1).alan());
        System.out.println("Cevre: " +sekiller.get(sekiller.size()-1).cevre());
    }

    public void sil(int varlikID){
        System.out.println(varlikID + " silindi");
        for(int i = 0;i<sekiller.size();i++){
            if(sekiller.get(i).varlikID == varlikID){
                sekiller.remove(i);
                return;
            }
        }
    }

}
