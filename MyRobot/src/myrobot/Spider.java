package myrobot;

public class Spider extends GezginRobotlar{
    int bacaksayisi;

    public Spider() {
        super();
        this.bacaksayisi = 1;
    }

    public Spider(int motorsayisi, double yukmiktari, int x, int y, double gezinmehizi, int bacaksayisi) {
        super(motorsayisi, yukmiktari, "Spider", x, y, gezinmehizi);
        this.bacaksayisi = bacaksayisi;
    }

    public int getBacaksayisi() {
        return bacaksayisi;
    }

    public void setBacaksayisi(int bacaksayisi) {
        this.bacaksayisi = bacaksayisi;
    }
    
}