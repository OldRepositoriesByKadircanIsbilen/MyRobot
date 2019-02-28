package myrobot;

public abstract class GezginRobotlar extends Robot {
    private double gezinmehizi;
    
    public GezginRobotlar(){
        super();
        this.gezinmehizi = 0;
    }

    public GezginRobotlar(int motorsayisi, double yukmiktari, String robottipi, int x, int y, double gezinmehizi) {
        super(motorsayisi, yukmiktari, robottipi,x,y);
        this.gezinmehizi = gezinmehizi;
    }

    public double getGezinmehizi() {
        return gezinmehizi;
    }

    public void setGezinmehizi(double gezinmehizi) {
        this.gezinmehizi = gezinmehizi;
    }
    
}