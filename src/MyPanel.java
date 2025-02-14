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
        g.setColor(Color.BLACK);
        g.drawRect(0,0, 800,600);
        g.fillRect(0,0, 800,600);
        int x = 0;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i+j) % 2 == 0)
                {
                    g.setColor(Color.RED);
                    g.fillRect(i*75, j*75, 75, 75);
                }
                else
                {
                    if (j < 3)
                    {
                        x++;
                        if (x % 2 == 1)
                        {
                            g.setColor(Color.WHITE);
                            g.fillArc(i*75 + 7, j*75 + 7, 60, 60, 0, 360);
                        }
                    }
                    else if(j >= 5)
                    {
                        x++;
                        if (x % 2 == 0)
                        {
                            x = 0;
                            g.setColor(Color.RED);
                            g.fillOval(i*75 + 7, j*75 + 7, 60, 60);
                        }
                    }
                }
            }
        }
    }
}
