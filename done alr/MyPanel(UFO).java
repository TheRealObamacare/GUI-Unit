import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
    public MyPanel ()
    {
        setSize(1000,800);
    }

    public void paint(Graphics g)
    {
        g.setColor(new Color(121, 240, 13));
        g.fillRect(0,0,1000,800);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,350,1000,300);
        g.setColor(Color.YELLOW);
        for (int i = 0; i < 10; i++)
        {
            g.fillRect(i*50 + i * 50, 500, 50, 20);
        }
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 1000, 250);

        //cloud on left
        g.setColor(Color.GRAY);
g.fillOval(200, 100, 50, 50);
        g.fillOval(225, 100, 50, 50);
        g.fillOval(250, 80, 50, 50);
        g.fillOval(230, 70, 50, 50);
        g.fillOval(200, 70, 50, 50);
        g.fillOval(180, 100, 50, 50);
        g.fillOval(180, 75, 50, 50);
        //cloud right
        g.fillOval(825, 50, 50, 50);
        g.fillOval(875, 30, 50, 50);
        g.fillOval(850, 50, 50, 50);
        g.fillOval(855, 20, 50, 50);
        g.fillOval(825, 20, 50, 50);
        g.fillOval(805, 50, 50, 50);
        g.fillOval(805, 25, 50, 50);
        //cloud middle hehe ufo
        g.fillOval(475, 150, 50, 50);
        g.fillOval(525, 130, 50, 50);
        g.fillOval(500, 150, 50, 50);
        g.fillOval(505, 120, 50, 50);
        g.fillOval(475, 120, 50, 50);
        g.fillOval(455, 150, 50, 50);
        g.fillOval(455, 125, 50, 50);
        g.fillOval(460, 125, 50, 50);
        g.fillOval(525, 150, 50, 50);
        g.fillOval(460, 125, 50, 50);
        g.fillOval(530, 125, 50, 50);
        g.fillOval(450, 150, 50, 50);
        g.fillOval(460, 110, 50, 50);
        g.fillOval(425, 155, 200, 50);
        g.setColor(Color.YELLOW);
        g.fillArc(0, 0, 200, 200, 0, -360);

        //sun rays
        g.setColor(Color.YELLOW);
        g.drawLine(100, 100, 0, 0);
        g.drawLine(100, 100, 200, 200);
        g.drawLine(100, 100, 0, 200);
        g.drawLine(100, 100, 200, 0);
        g.drawLine(100, 100, 100, 0);
        g.drawLine(100, 100, 100, 200);
        g.drawLine(100, 100, 0, 100);
        g.drawLine(100, 100, 200, 100);
        //YAY
        //CAR
        g.setColor(Color.RED);
        g.fillRect(100, 560, 200, 50);
        g.fillRect(150, 510, 100, 50);
        g.setColor(Color.BLACK);
        g.fillOval(125, 600, 50, 50);
        g.fillOval(225, 600, 50, 50);
        g.fillRect(150, 510, 100, 50);
        g.setColor(Color.WHITE);
        g.fillOval(135, 610, 30, 30);
        g.fillOval(235, 610, 30, 30);
        //CAR 2
g.setColor(Color.RED);
        g.fillRect(500, 410, 200, 50);
        g.fillRect(550, 360, 100, 50);
        g.setColor(Color.BLACK);
        g.fillOval(525, 450, 50, 50);
        g.fillOval(625, 450, 50, 50);
        g.fillRect(550, 360, 100, 50);
        g.setColor(Color.WHITE);
        g.fillOval(535, 460, 30, 30);
        g.fillOval(635, 460, 30, 30);
        // Stop sign
        g.setColor(Color.BLACK);
        g.fillRect(100, 250, 10, 100);
        g.setColor(Color.RED);
        Polygon oct = new Polygon();
        oct.addPoint(95, 270);
        oct.addPoint(115, 270);
        oct.addPoint(135, 255);
        oct.addPoint(135, 235);
        oct.addPoint(115, 220);
        oct.addPoint(95, 220);
        oct.addPoint(75, 235);
        oct.addPoint(75, 255);
        g.fillPolygon(oct);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.WHITE);
        g.drawString("STOP", 78, 255);
        //UFO
        g.setColor(new Color(80, 195, 213));
        g.drawLine(475, 200, 425, 500);
        g.drawLine(575, 200, 625, 500);
        g.setColor(new Color(80, 195, 213, 87));
        Polygon tractorBeam = new Polygon();
        tractorBeam.addPoint(425, 500);
        tractorBeam.addPoint(625, 500);
        tractorBeam.addPoint(575, 200);
        tractorBeam.addPoint(475, 200);
        g.fillPolygon(tractorBeam);
    }
}
