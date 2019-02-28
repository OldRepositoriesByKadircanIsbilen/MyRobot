package myrobot;

public class Hibrit extends Robot{
    private Tekerlekli tekerlekli;
    private Paletli paletli;
    private Spider spider;
    private Seri seri;
    private Paralel paralel;
    private double sabitlenmesuresi;
    private double gecissuresi;
    private boolean gezginmi;
    private String robottipi;
    
    public Hibrit(){
        tekerlekli = new Tekerlekli();
        paletli = null;
        spider = null;
        seri = new Seri();
        paralel = null;
        this.sabitlenmesuresi = 2;
        this.gecissuresi = 2;
        this.gezginmi = true;
        this.robottipi = "Tekerlekli-Seri";
    }
    
    public Hibrit(String gezgintipi, String sabittipi){
        if(gezgintipi.equals("Tekerlekli")){
            tekerlekli = new Tekerlekli();
            paletli = null;
            spider = null;
        }else if(gezgintipi.equals("Paletli")){
            tekerlekli = null;
            paletli = new Paletli();
            spider = null;
        }else if(gezgintipi.equals("Spider")){
            tekerlekli = null;
            paletli = null;
            spider = new Spider();
        }else{
            tekerlekli = null;
            paletli = null;
            spider = null;
        }
        
        if(sabittipi.equals("Seri")){
            seri = new Seri();
            paralel = null;
        }else if(sabittipi.equals("Paralel")){
            seri = null;
            paralel = new Paralel();
        }else{
            seri = null;
            paralel = null;
        }
        this.robottipi = gezgintipi+"-"+sabittipi;
        
        this.sabitlenmesuresi = 2;
        this.gecissuresi = 2;
        this.gezginmi = true;
    }
    
    public Hibrit(String gezgintipi,int motorsayisi, double yukmiktari, int x, int y, double gezinmehizi,int tekerleksayisi,int paletsayisi,int bacaksayisi, String sabittipi, double kapasite, double koluzunlugu, double tasimahizi){
        if(gezgintipi.equals("Tekerlekli")){
            tekerlekli = new Tekerlekli(motorsayisi, yukmiktari, x, y, gezinmehizi, tekerleksayisi);
            paletli = null;
            spider = null;
        }else if(gezgintipi.equals("Paletli")){
            tekerlekli = null;
            paletli = new Paletli(motorsayisi, yukmiktari, x, y, gezinmehizi, paletsayisi);
            spider = null;
        }else if(gezgintipi.equals("Spider")){
            tekerlekli = null;
            paletli = null;
            spider = new Spider(motorsayisi, yukmiktari, x, y, gezinmehizi, bacaksayisi);
        }else{
            tekerlekli = null;
            paletli = null;
            spider = null;
        }
        
        if(sabittipi.equals("Seri")){
            seri = new Seri(motorsayisi, yukmiktari, x, y, kapasite,koluzunlugu,tasimahizi);
            paralel = null;
        }else if(sabittipi.equals("Paralel")){
            seri = null;
            paralel = new Paralel(motorsayisi, yukmiktari, x, y, kapasite,koluzunlugu,tasimahizi);
        }else{
            seri = null;
            paralel = null;
        }
        this.robottipi = gezgintipi+"-"+sabittipi;
    }
    
    public void setMotorsayisi(int motorsayisi){
        if(tekerlekli!=null){
            tekerlekli.setMotorsayisi(motorsayisi);
        }
        if(paletli!=null){
            paletli.setMotorsayisi(motorsayisi);
        }
        if(spider!=null){
            spider.setMotorsayisi(motorsayisi);
        }
        if(seri!=null){
            seri.setMotorsayisi(motorsayisi);
        }
        if(paralel!=null){
            paralel.setMotorsayisi(motorsayisi);
        }
    }
    
    public void setYukmiktari(double yukmiktari){
        if(tekerlekli!=null){
            tekerlekli.setYukmiktari(yukmiktari);
        }
        if(paletli!=null){
            paletli.setYukmiktari(yukmiktari);
        }
        if(spider!=null){
            spider.setYukmiktari(yukmiktari);
        }
        if(seri!=null){
            seri.setYukmiktari(yukmiktari);
        }
        if(paralel!=null){
            paralel.setYukmiktari(yukmiktari);
        }
    }
    
    public void setX(int x){
        if(tekerlekli!=null){
            tekerlekli.setX(x);
        }
        if(paletli!=null){
            paletli.setX(x);
        }
        if(spider!=null){
            spider.setX(x);
        }
        if(seri!=null){
            seri.setX(x);
        }
        if(paralel!=null){
            paralel.setX(x);
        }
    }
    
    public void setY(int y){
        if(tekerlekli!=null){
            tekerlekli.setY(y);
        }
        if(paletli!=null){
            paletli.setY(y);
        }
        if(spider!=null){
            spider.setY(y);
        }
        if(seri!=null){
            seri.setY(y);
        }
        if(paralel!=null){
            paralel.setY(y);
        }
    }
    
    public void setGezinmehizi(double gezinmehizi){
        if(tekerlekli!=null){
            tekerlekli.setGezinmehizi(gezinmehizi);
        }
        if(paletli!=null){
            paletli.setGezinmehizi(gezinmehizi);
        }
        if(spider!=null){
            spider.setGezinmehizi(gezinmehizi);
        }
    }
    
    public void setTekerleksayisi(int tekerleksayisi){
        if(tekerlekli!=null){
            tekerlekli.setTekerleksayisi(tekerleksayisi);
        }
    }
    
    public void setPaletsayisi(int paletsayisi){
        if(paletli!=null){
            paletli.setPaletsayisi(paletsayisi);
        }
    }
    
    public void setBacaksayisi(int bacaksayisi){
        if(spider!=null){
            spider.setBacaksayisi(bacaksayisi);
        }
    }
    
    public void setKapasite(double kapasite){
        if(seri!=null){
            seri.setKapasite(kapasite);
        }
        if(paralel!=null){
            paralel.setKapasite(kapasite);
        }
    }
    
    public void setKoluzunlugu(double koluzunlugu){
        if(seri!=null){
            seri.setKoluzunlugu(koluzunlugu);
        }
        if(paralel!=null){
            paralel.setKoluzunlugu(koluzunlugu);
        }
    }
    
    public void setTasimahizi(double tasimahizi){
        if(seri!=null){
            seri.setTasimahizi(tasimahizi);
        }
        if(paralel!=null){
            paralel.setTasimahizi(tasimahizi);
        }
    }
    
    public void setRobottipi(String str){
        this.robottipi = str;
    }
    
    // getter methods
    
    public int getMotorsayisi(){
        if(tekerlekli!=null){
            return tekerlekli.getMotorsayisi();
        }else if(paletli!=null){
            return paletli.getMotorsayisi();
        }else if(spider!=null){
            return spider.getMotorsayisi();
        }else if(seri!=null){
            return seri.getMotorsayisi();
        }else if(paralel!=null){
            return paralel.getMotorsayisi();
        }else{
            return 0;
        }
    }
    
    public double getYukmiktari(){
        if(tekerlekli!=null){
            return tekerlekli.getYukmiktari();
        }else if(paletli!=null){
            return paletli.getYukmiktari();
        }else if(spider!=null){
            return spider.getYukmiktari();
        }else if(seri!=null){
            return seri.getYukmiktari();
        }else if(paralel!=null){
            return paralel.getYukmiktari();
        }else{
            return 0;
        }
    }
    
    public int getX(){
        if(tekerlekli!=null){
            return tekerlekli.getX();
        }else if(paletli!=null){
            return paletli.getX();
        }else if(spider!=null){
            return spider.getX();
        }else if(seri!=null){
            return seri.getX();
        }else if(paralel!=null){
            return paralel.getX();
        }else{
            return 0;
        }
    }
    
    public int getY(){
        if(tekerlekli!=null){
            return tekerlekli.getY();
        }else if(paletli!=null){
            return paletli.getY();
        }else if(spider!=null){
            return spider.getY();
        }else if(seri!=null){
            return seri.getY();
        }else if(paralel!=null){
            return paralel.getY();
        }else{
            return 0;
        }
    }
    
    public double getGezinmehizi(){
        if(tekerlekli!=null){
            return tekerlekli.getGezinmehizi();
        }else if(paletli!=null){
            return paletli.getGezinmehizi();
        }else if(spider!=null){
            return spider.getGezinmehizi();
        }else{
            return 0;
        }
    }
    
    public int getTekerleksayisi(){
        if(tekerlekli!=null){
            return tekerlekli.getTekerleksayisi();
        }else{
            return 0;
        }
    }
    
    public int getPaletsayisi(){
        if(paletli!=null){
            return paletli.getPaletsayisi();
        }else{
            return 0;
        }
    }
    
    public int getBacaksayisi(){
        if(spider!=null){
            return spider.getBacaksayisi();
        }else{
            return 0;
        }
    }
    
    public double getKapasite(){
        if(seri!=null){
            return seri.getKapasite();
        }else if(paralel!=null){
            return paralel.getKapasite();
        }else{
            return 0;
        }
    }
    
    public double getKoluzunlugu(){
        if(seri!=null){
            return seri.getKoluzunlugu();
        }else if(paralel!=null){
            return paralel.getKoluzunlugu();
        }else{
            return 0;
        }
    }
    
    public double getTasimahizi(){
        if(seri!=null){
            return seri.getTasimahizi();
        }else if(paralel!=null){
            return paralel.getTasimahizi();
        }else{
            return 0;
        }
    }
    
    public String getRobottipi(){
        return robottipi;
    }

    public Tekerlekli getTekerlekli() {
        return tekerlekli;
    }

    public void setTekerlekli(Tekerlekli tekerlekli) {
        this.tekerlekli = tekerlekli;
    }

    public Paletli getPaletli() {
        return paletli;
    }

    public void setPaletli(Paletli paletli) {
        this.paletli = paletli;
    }

    public Spider getSpider() {
        return spider;
    }

    public void setSpider(Spider spider) {
        this.spider = spider;
    }

    public Seri getSeri() {
        return seri;
    }

    public void setSeri(Seri seri) {
        this.seri = seri;
    }

    public Paralel getParalel() {
        return paralel;
    }

    public void setParalel(Paralel paralel) {
        this.paralel = paralel;
    }

    public double getSabitlenmesuresi() {
        return sabitlenmesuresi;
    }

    public void setSabitlenmesuresi(double sabitlenmesuresi) {
        this.sabitlenmesuresi = sabitlenmesuresi;
    }

    public double getGecissuresi() {
        return gecissuresi;
    }

    public void setGecissuresi(double gecissuresi) {
        this.gecissuresi = gecissuresi;
    }

    public boolean isGezginmi() {
        return gezginmi;
    }

    public void setGezginmi(boolean gezginmi) {
        this.gezginmi = gezginmi;
    }
    
    
}