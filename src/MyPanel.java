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
        g.setColor(Color.GREEN);
        g.fillOval(100,0,600,600);
        g.setColor(Color.BLACK);
        g.fillArc(100,0,600,600,0,45);
        g.setColor(Color.RED);
        g.fillArc(100,0,600,600,45,135);
        g.setColor(Color.YELLOW);
        g.fillArc(100,0,600,600,180,45);
        g.setColor(Color.BLUE);
        g.fillArc(100,0,600,600,225,270);
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,600,800,200);
        g.setColor(Color.GREEN);
        g.drawString("Schoolwork - 25%", 400, 650);

    }
}
