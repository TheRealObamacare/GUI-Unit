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
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(new Color(139, 69, 19));
        g.fillRect(0, getHeight() - 100, getWidth(), 100);
        g.setColor(Color.RED);
        Polygon crab = new Polygon();
        crab.addPoint(320, 530);
        crab.addPoint(260, 640);
        crab.addPoint(320, 710);
        crab.addPoint(285, 640);
        crab.addPoint(345, 545);
        crab.addPoint(400, 565);
        crab.addPoint(370, 555);
        crab.addPoint(320, 640);
        crab.addPoint(385, 710);
        crab.addPoint(355, 640);
        crab.addPoint(395, 570);
        crab.addPoint(480, 610);
        crab.addPoint(525, 610);
        crab.addPoint(540, 600);
        crab.addPoint(610, 570);
        crab.addPoint(650, 640);
        crab.addPoint(620, 710);
        crab.addPoint(680, 640);
        crab.addPoint(630, 560);
        crab.addPoint(660, 545);
        crab.addPoint(710, 640);
        crab.addPoint(680, 710);
        crab.addPoint(750 , 640);
        crab.addPoint(680, 535);
        crab.addPoint(920, 320);
        crab.addPoint(870, 205);
        crab.addPoint(870, 160);
        crab.addPoint(810, 130);
        crab.addPoint(810, 145);
        crab.addPoint(840, 205);
        crab.addPoint(760, 160);
        crab.addPoint(745, 145);
        crab.addPoint(745, 220);
        crab.addPoint(830, 240);
        crab.addPoint(870, 320);
        crab.addPoint(760, 370);
        crab.addPoint(670, 350);
        crab.addPoint(335, 350);
        crab.addPoint(245, 370);
        crab.addPoint(130, 320);
        crab.addPoint(180, 240);
        crab.addPoint(260, 220);
        crab.addPoint(260, 170);
        crab.addPoint(240, 160);
        crab.addPoint(165, 205);
        crab.addPoint(210, 145);
        crab.addPoint(190, 130);
        crab.addPoint(130, 160);
        crab.addPoint(130, 210);
        crab.addPoint(80, 320);
        crab.addPoint(240, 500);
        g.fillPolygon(crab);

        g.setColor(Color.WHITE);
        g.fillRect(480, 320, 10, 30);
        g.fillRect(510, 320, 10, 30);


        g.setColor(new Color(138, 68, 19));

        Polygon sandHill = new Polygon();
        sandHill.addPoint(1, 700);
        sandHill.addPoint(75, 650);
        sandHill.addPoint(100, 625);
        sandHill.addPoint(150, 600);
        sandHill.addPoint(200, 650);
        sandHill.addPoint(250, 620);
        sandHill.addPoint(300, 700);

        g.fillPolygon(sandHill);

        Polygon volcano = new Polygon();
        volcano.addPoint(750, 700);
        volcano.addPoint(800, 650);
        volcano.addPoint(825, 635);

        volcano.addPoint(850, 600);
        volcano.addPoint(860, 595);
        volcano.addPoint(875, 600);
        volcano.addPoint(880, 620);
        volcano.addPoint(900, 650);
        volcano.addPoint(950, 700);

        g.fillPolygon(volcano);

        g.setColor(Color.RED);
        Polygon lava = new Polygon();
        lava.addPoint(835, 700);
        lava.addPoint(835, 650);
        lava.addPoint(840, 635);
        lava.addPoint(850, 600);
        lava.addPoint(860, 595);
        lava.addPoint(865, 600);
        lava.addPoint(870, 620);
        lava.addPoint(875, 650);
        lava.addPoint(875, 700);

        g.fillPolygon(lava);

        g.setColor(new Color(113, 152, 156));
        g.fillOval(800, 600, 50, 50);
        g.fillOval(810, 610, 30, 30);
        g.fillOval(820, 620, 10, 10);
        g.fillOval(830, 630, 5, 5);
        g.fillOval(840, 640, 2, 2);
        g.fillOval(880, 600, 50, 50);
        g.fillOval(850, 580, 30, 30);
        g.fillOval(860, 540, 50, 50);
        g.fillOval(870, 520, 30, 30);
        g.fillOval(840, 580, 50, 50);
        g.fillOval(830, 560, 30, 30);
        g.fillOval(820, 540, 50, 50);
        g.fillOval(810, 520, 30, 30);
        g.fillOval(800, 500, 50, 50);
        g.fillOval(790, 480, 30, 30);
        g.fillOval(780, 460, 50, 50);
        g.fillOval(840, 440, 30, 30);
        g.fillOval(820, 420, 50, 50);
        g.fillOval(800, 400, 30, 30);
        g.fillOval(800, 480, 30, 30);
        g.fillOval(850, 460, 50, 50);
        g.fillOval(835, 440, 30, 30);
        g.fillOval(860, 420, 50, 50);
        g.fillOval(800, 400, 30, 30);

        g.setFont(new Font("Arial", Font.BOLD, 100));
        g.drawString("LARRY", 335, 300);
    }
}
