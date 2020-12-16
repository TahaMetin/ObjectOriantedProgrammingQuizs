
public class Daire extends Sekil {

    float yaricap;

    Daire(int x, int y,float yaricap) {
        super(x, y);
        this.yaricap = yaricap;
        System.out.println("daire yaratildi ");
    }
    Daire(int x, int y) {
        super(x, y);
        this.yaricap = 1;
        System.out.println("daire yaratildi ");

    }

    @Override
    public float alan() {
        return 3.141592653589793f * yaricap* yaricap;
    }

    @Override
    public float cevre() {
        return 2* 3.141592653589793f * yaricap;
    }

    public void buyut(int k){
        yaricap += k;
    }

    public void sil(){
        super.sil(this.varlikID);
    }

}
