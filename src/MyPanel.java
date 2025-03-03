import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
    public MyPanel ()
    {
        setSize(800,800);
    }

    public void paint(Graphics g)
    {
        g.setColor(new Color(40, 43, 40, 255));
        g.fillRect(0,0,800,800);
        g.setFont(new Font("Times New Roman", Font.BOLD, 50));
        g.setColor(Color.white);
        g.drawString("KEY", 45, 150);
        g.setFont(new Font("Times New Roman", Font.BOLD, 18));
        g.setColor(new Color(244, 187, 244, 255));
        g.fillArc(300,150,500,500, 0, 18);
        g.fillRect(0, 180, 25, 25);
        g.drawString("Free Time(1.2hrs) - 5%", 50, 200);
        g.setColor(new Color(99, 99, 98, 255));
        g.fillArc(300,150,500,500,18,18);
        g.fillRect(0, 220, 25, 25);
        g.drawString("Using my brain(1.2hrs) - 5%", 50, 240);
        g.setColor(new Color(240, 94, 91, 255));
        g.fillArc(300,150,500,500,36,18);
        g.fillRect(0, 260, 25, 25);
        g.drawString("Trying to code(1.2hrs) - 5%", 50, 280);
        g.setColor(Color.YELLOW);
        g.fillArc(300,150,500,500,54,36);
        g.fillRect(0, 300, 25, 25);
        g.drawString("Eating(2.4hrs) - 10%", 50, 320);
        g.setColor(Color.ORANGE);
        g.fillArc(300,150,500,500,90,36);
        g.fillRect(0, 340, 25, 25);
        g.drawString("Banging my head into a", 50, 360);
        g.drawString("wall \"For Fun\"(2.4hrs) - 10%", 50, 380);
        g.setColor(new Color(36, 122, 159, 255));
        g.fillArc(300,150,500,500,126,54);
        g.fillRect(0, 400, 25, 25);
        g.drawString("Doing Homework(3.6hrs) - 15%", 50, 420);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(300,150,500,500,180,90);
        g.fillRect(0, 440, 25, 25);
        g.drawString("Sleeping(6hrs) - 25%", 50, 460);
        g.setColor(new Color(111, 191, 178, 255));
        g.fillArc(300,150,500,500,270,90);
        g.fillRect(0, 480, 25, 25);
        g.drawString("Being at School(6hrs) - 25%", 50, 500);
    }
}