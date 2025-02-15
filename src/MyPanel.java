import java.awt.*;
import javax.swing.*;

public class MyPanel extends JPanel
{
    public MyPanel ()
    {
        setSize(200,400);
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 200, 400);
        g.setColor(Color.WHITE);
        int[] xPoints = {25, 50, 150, 175}; 
        int[] yPoints = {350, 300, 300, 350};
        int numPoints = 4;

        g.fillPolygon(xPoints, yPoints, numPoints);
        g.fillRoundRect(60, 110, 80, 200, 25, 10);
        g.fillPolygon(new int[]{10, 190, 190, 154, 154, 118, 118, 82, 82, 46, 46, 10}, new int[]{120, 120, 60, 60, 90, 90 ,60, 60, 90, 90, 60, 60}, 12);
//        g.fillRoundRect(50, 275, 100, 50, 50, 50);
//        g.fillRoundRect(25, 305, 150, 50, 50, 50);
    }
}
