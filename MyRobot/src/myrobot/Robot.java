package myrobot;

public abstract class Robot {
    private int motorsayisi,x,y;
    private double yukmiktari;
    private String robottipi;
    
    public Robot(){
        this.motorsayisi = 1;
        this.yukmiktari = 0;
        this.robottipi = "";
        this.x = 0;
        this.y = 0;
    }
    
    public Robot(int motorsayisi, double yukmiktari,String robottipi, int x, int y){
        this.motorsayisi = motorsayisi;
        this.yukmiktari = yukmiktari;
        this.robottipi = robottipi;
        this.x = x;
        this.y = y;
    }
    
    //setter methods

    public void setMotorsayisi(int motorsayisi) {
        this.motorsayisi = motorsayisi;
    }

    public void setYukmiktari(double yukmiktari) {
        this.yukmiktari = yukmiktari;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    // getter methods

    public int getMotorsayisi() {
        return motorsayisi;
    }

    public double getYukmiktari() {
        return yukmiktari;
    }

    public String getRobottipi() {
        return robottipi;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}