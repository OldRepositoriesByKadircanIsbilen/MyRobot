package myrobot;
import javax.swing.*;
import java.awt.*;

public class ParametreSecimPaneli extends JPanel{
    private JTextField[][] tanimlanmisParametreler; 
    public ParametreSecimPaneli(String[] rt){
        tanimlanmisParametreler = new JTextField[13][rt.length];
        setLayout(new GridLayout(13,rt.length+1));
        
        add(new JLabel("Robot İsmi:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[0][i] = new JTextField("Robot "+(i+1));
            add(tanimlanmisParametreler[0][i]);
            tanimlanmisParametreler[0][i].setEditable(false);
            
        }
        
        add(new JLabel("Robot Tipi:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[1][i] = new JTextField(rt[i]);
            add(tanimlanmisParametreler[1][i]);
            tanimlanmisParametreler[1][i].setEditable(false);
            
        }
        
        add(new JLabel("Motor Sayısı:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[2][i] = new JTextField("1");
            add(tanimlanmisParametreler[2][i]);
        }
        
        add(new JLabel("x konumu:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[3][i] = new JTextField("1");
            add(tanimlanmisParametreler[3][i]);
        }
        
        add(new JLabel("y konumu:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[4][i] = new JTextField("1");
            add(tanimlanmisParametreler[4][i]);
        }
        
        add(new JLabel("Yük Miktarı:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[5][i] = new JTextField("1");
            add(tanimlanmisParametreler[5][i]);
        }
        
        add(new JLabel("Gezinme Hızı:"));
        for(int i=0;i<rt.length;i++){
            String hiz;
            if(rt[i].equals("Tekerlekli") || rt[i].equals("Tekerlekli-Seri") || rt[i].equals("Tekerlekli-Paralel")){
                hiz = "3";
            }else if(rt[i].equals("Paletli") || rt[i].equals("Paletli-Seri") || rt[i].equals("Paletli-Paralel")){
                hiz = "2";
            }else{
                hiz = "1";
            }
            tanimlanmisParametreler[6][i] = new JTextField(hiz);
            add(tanimlanmisParametreler[6][i]);
            if(rt[i].equals("Paralel") || rt[i].equals("Seri")){
                tanimlanmisParametreler[6][i].setText("");
                tanimlanmisParametreler[6][i].setEnabled(false);
            }
        }
        
        add(new JLabel("Tekerlek Sayısı:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[7][i] = new JTextField("2");
            add(tanimlanmisParametreler[7][i]);
            if(!rt[i].equals("Tekerlekli") && !rt[i].equals("Tekerlekli-Seri") && !rt[i].equals("Tekerlekli-Paralel")){
                tanimlanmisParametreler[7][i].setText("");
                tanimlanmisParametreler[7][i].setEnabled(false);
            }
        }
        
        add(new JLabel("Palet Sayısı:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[8][i] = new JTextField("2");
            add(tanimlanmisParametreler[8][i]);
            if(!rt[i].equals("Paletli") && !rt[i].equals("Paletli-Seri") && !rt[i].equals("Paletli-Paralel")){
                tanimlanmisParametreler[8][i].setText("");
                tanimlanmisParametreler[8][i].setEnabled(false);
            }
        }
        
        add(new JLabel("Bacak Sayısı:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[9][i] = new JTextField("2");
            add(tanimlanmisParametreler[9][i]);
            if(!rt[i].equals("Spider") && !rt[i].equals("Spider-Seri") && !rt[i].equals("Spider-Paralel")){
                tanimlanmisParametreler[9][i].setText("");
                tanimlanmisParametreler[9][i].setEnabled(false);
            }
        }
        
        add(new JLabel("Kapasite:"));
        for(int i=0;i<rt.length;i++){
            String kap;
            if(rt[i].equals("Paralel") || rt[i].equals("Tekerlekli-Paralel") || rt[i].equals("Paletli-Paralel") || rt[i].equals("Spider-Paralel")){
                kap = "2";
            }else{
                kap = "1";
            }
            tanimlanmisParametreler[10][i] = new JTextField(kap);
            add(tanimlanmisParametreler[10][i]);
            if(rt[i].equals("Tekerlekli") || rt[i].equals("Paletli") || rt[i].equals("Spider")){
                tanimlanmisParametreler[10][i].setText("");
                tanimlanmisParametreler[10][i].setEnabled(false);
            }
        }
        
        add(new JLabel("Kol Uzunluğu:"));
        for(int i=0;i<rt.length;i++){
            tanimlanmisParametreler[11][i] = new JTextField("10");
            add(tanimlanmisParametreler[11][i]);
            if(rt[i].equals("Tekerlekli") || rt[i].equals("Paletli") || rt[i].equals("Spider")){
                tanimlanmisParametreler[11][i].setText("");
                tanimlanmisParametreler[11][i].setEnabled(false);
            }
        }
        
        add(new JLabel("Taşıma Hızı:"));
        for(int i=0;i<rt.length;i++){
            String tashiz;
            if(rt[i].equals("Paralel") || rt[i].equals("Tekerlekli-Paralel") || rt[i].equals("Paletli-Paralel") || rt[i].equals("Spider-Paralel")){
                tashiz = "2";
            }else{
                tashiz = "1";
            }
            tanimlanmisParametreler[12][i] = new JTextField(tashiz);
            add(tanimlanmisParametreler[12][i]);
            if(rt[i].equals("Tekerlekli") || rt[i].equals("Paletli") || rt[i].equals("Spider")){
                tanimlanmisParametreler[12][i].setText("");
                tanimlanmisParametreler[12][i].setEnabled(false);
            }
        }
    }
    
    public JTextField[][] getTanimlanmisParametreler(){
        return tanimlanmisParametreler;
    }
}
