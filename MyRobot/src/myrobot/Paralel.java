package myrobot;

public class Paralel extends Manipulator{
    public Paralel(){
        super();
    }
    
    public Paralel(int motorsayisi, double yukmiktari, int x, int y, double kapasite, double koluzunlugu, double tasimahizi){
        super(motorsayisi, yukmiktari, "Paralel", x, y, kapasite,koluzunlugu,tasimahizi);
    }
}