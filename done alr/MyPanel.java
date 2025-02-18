import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{

    public MyPanel ()
    {
        setSize(800,600);
    }

    public void paint(Graphics g)
    {
        int startX = (800 - (75*8)) / 2;
        int startY = (600 - (75*8)) / 2;
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    g.setColor(Color.RED);
                }
                else
                {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(startX + i * 75, startY + j * 75, 75, 75);
                if (j < 3 && (i + j) % 2 == 1)
                {
                    g.setColor(Color.WHITE);
                    g.drawOval(startX + i * 75 + 7, startY + j * 75 + 7, 60, 60);
                }
                else if (j > 4 && (i + j) % 2 == 1)
                {
                    g.setColor(Color.RED);
                    g.fillOval(startX + i * 75 + 7, startY + j * 75 + 7, 60, 60);
                }
            }
        }
    }
}