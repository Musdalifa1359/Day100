
import java.awt.*;

public class Days56membuatKotakNama {
    public static void main(String[] args) {
       
        Frame frame = new Frame("Kotak");

        Panel panel = new Panel();

  
        Graphics graphics = panel.getGraphics();

        graphics.setColor(Color.red);
        graphics.drawRect(10, 10, 100, 100);

        frame.add(panel);

        frame.setVisible(true);
    }
}
