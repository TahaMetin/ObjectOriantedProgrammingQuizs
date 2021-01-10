
public class Dortgen extends Sekil{

    float en,boy;

    Dortgen(int x, int y,float en , float boy) {
        super(x, y);
        this.boy = boy;
        this.en = en;
        System.out.println("dortgen yaratildi ");
    }
    Dortgen(int x, int y) {
        super(x, y);
        this.en = 1;
        this.boy = 1;
        System.out.println("dortgen yaratildi ");

    }

    @Override
    public float alan() {
        return en*boy;
    }

    @Override
    public float cevre() {
        return 2*(en+boy);
    }

    public void sil(){
        super.sil(this.varlikID);
    }

}
