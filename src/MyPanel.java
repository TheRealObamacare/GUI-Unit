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
        g.setColor(new Color(210,180,140, 200)); // Light brown / Tan color with alpha
        g.fillRect(0,600,800,200);
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        g.setColor(Color.CYAN);
        g.fillArc(100,0,600,600, 0, 18);
        g.drawString("Free Time - 5%", 0, 620);
        g.setColor(Color.GRAY);
        g.fillArc(100,0,600,600,18,18);
        g.drawString("Using my brain - 5%", 150, 620);
        g.setColor(Color.RED);
        g.fillArc(100,0,600,600,36,18);
        g.drawString("Trying to code - 5%", 350, 620);
        g.setColor(Color.YELLOW);
        g.fillArc(100,0,600,600,54,36);
        g.drawString("Eating - 10%", 530, 620);
        g.setColor(Color.ORANGE);
        g.fillArc(100,0,600,600,90,36);
        g.drawString("Banging my head into a wall \"For Fun\" - 10%", 0, 640);
        g.setColor(Color.BLUE);
        g.fillArc(100,0,600,600,126,54);
        g.drawString("Doing Homework - 15%", 410, 640);
        g.setColor(Color.DARK_GRAY);
        g.fillArc(100,0,600,600,180,90);
        g.drawString("Sleeping - 25%", 640, 640);
        g.setColor(Color.GREEN);
        g.fillArc(100,0,600,600,270,90);
        g.drawString("Being at School - 25%", 300, 660);
    }
}
