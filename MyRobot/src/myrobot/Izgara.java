package myrobot;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.*;

public class Izgara extends JPanel{
    private Engel[] engeller;
    private Robot robot;
    
    public Izgara(){
        super();
        setBackground(Color.WHITE);
        engeller = new Engel[0];
        robot = null;
    }
    
    public void paint(Graphics g) {
        super.paintComponent(g);
        
        for(int i=1;i<21;i++){
            g.drawString(""+(i), 20*i+5, 15);
        }
        
        for(int i=1;i<21;i++){
            g.drawString(""+(i),3, 20*i+15);
        }
        
        for(int i=1;i<21;i++){
            for(int j=1;j<21;j++){
                g.drawRect(20*i, 20*j, 20, 20);
            }
        }
        // For Debugging //System.out.println(engelX.length+" "+engelY.length);
        if(engeller.length>0){
            for(int i=0;i<engeller.length;i++){
                g.setColor(Color.RED);
                g.fillRect(20*engeller[i].getX(), 20*engeller[i].getY(), 20, 20);
                // For Debugging //System.out.println(engelX[i]+" "+engelY[i]);
            }
        }
        
        if(robot!=null){
            String tip = robot.getRobottipi();
            File file = new File("RobotResimleri/"+tip+".jpeg");
            Image img;
            try {
                img = ImageIO.read(file);
                Image scaledImg = img.getScaledInstance(18,18,Image.SCALE_SMOOTH);
                g.drawImage(scaledImg, 20*robot.getX()+2, 20*robot.getY()+2, this);
            } catch (IOException ex) {
                
            }
        }
    }

    public Engel[] getEngeller() {
        return engeller;
    }

    public void setEngeller(Engel[] engeller) {
        this.engeller = engeller;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
    
}