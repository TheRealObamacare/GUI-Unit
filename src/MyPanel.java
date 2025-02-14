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
        g.fillRect(0, 0, 800, 600);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {
                    g.setColor(Color.RED);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(i * 75, j * 75, 75, 75);
                if (j < 3 && (i + j) % 2 == 1) {
                    g.setColor(Color.WHITE);
                    g.drawOval(i * 75 + 7, j * 75 + 7, 60, 60);
                }
                else if (j > 4 && (i + j) % 2 == 1) {
                    g.setColor(Color.RED);
                    g.fillOval(i * 75 + 7, j * 75 + 7, 60, 60);
                }
            }
        }
    }
}