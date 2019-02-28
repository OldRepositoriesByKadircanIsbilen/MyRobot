package myrobot;

public class Seri extends Manipulator{
    public Seri(){
        super();
    }
    
    public Seri(int motorsayisi, double yukmiktari, int x, int y, double kapasite, double koluzunlugu, double tasimahizi){
        super(motorsayisi, yukmiktari, "Seri", x, y, kapasite,koluzunlugu,tasimahizi);
    }
}