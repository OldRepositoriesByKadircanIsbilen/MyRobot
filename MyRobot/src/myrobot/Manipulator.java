package myrobot;

public abstract class Manipulator extends Robot{
    private double kapasite, koluzunlugu,tasimahizi;

    public Manipulator() {
        super();
        this.kapasite = 1;
        this.koluzunlugu = 1;
        this.tasimahizi = 1;
    }

    public Manipulator(int motorsayisi, double yukmiktari, String robottipi, int x, int y, double kapasite, double koluzunlugu, double tasimahizi) {
        super(motorsayisi, yukmiktari, robottipi, x, y);
        this.kapasite = kapasite;
        this.koluzunlugu = koluzunlugu;
        this.tasimahizi = tasimahizi;
    }

    public double getKapasite() {
        return kapasite;
    }

    public double getKoluzunlugu() {
        return koluzunlugu;
    }

    public double getTasimahizi() {
        return tasimahizi;
    }

    public void setKapasite(double kapasite) {
        this.kapasite = kapasite;
    }

    public void setKoluzunlugu(double koluzunlugu) {
        this.koluzunlugu = koluzunlugu;
    }

    public void setTasimahizi(double tasimahizi) {
        this.tasimahizi = tasimahizi;
    }
    
    
}