package myrobot;

public class Paletli extends GezginRobotlar{
    int paletsayisi;

    public Paletli() {
        super();
        this.paletsayisi = 1;
    }

    public Paletli(int motorsayisi, double yukmiktari, int x, int y, double gezinmehizi, int paletsayisi) {
        super(motorsayisi, yukmiktari, "Paletli", x, y, gezinmehizi);
        this.paletsayisi = paletsayisi;
    }

    public int getPaletsayisi() {
        return paletsayisi;
    }

    public void setPaletsayisi(int paletsayisi) {
        this.paletsayisi = paletsayisi;
    }
    
    public double EngelGecmeSuresiBul(){
        return getMotorsayisi()*3;
    }
}