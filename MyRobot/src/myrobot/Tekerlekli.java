package myrobot;

public class Tekerlekli extends GezginRobotlar{
    private int tekerleksayisi;
    
    public Tekerlekli(){
        super();
        this.tekerleksayisi = 1;
    }

    public Tekerlekli(int motorsayisi, double yukmiktari, int x, int y, double gezinmehizi,int tekerleksayisi) {
        super(motorsayisi, yukmiktari, "Tekerlekli", x, y, gezinmehizi);
        this.tekerleksayisi = tekerleksayisi;
    }

    public int getTekerleksayisi() {
        return tekerleksayisi;
    }

    public void setTekerleksayisi(int tekerleksayisi) {
        this.tekerleksayisi = tekerleksayisi;
    }
    
    public double EngelGecmeSuresiBul(){
        return getMotorsayisi()*0.5;
    }
}
