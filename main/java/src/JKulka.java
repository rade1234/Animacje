import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import javax.swing.JLabel;


public class JKulka extends JLabel {
    private int x;
    private int y;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 400, 300);
        g.setColor(Color.ORANGE);
        g.fillArc(x, y, 30, 30, 0, 360);
        g.setColor(Color.BLACK);
        g.drawArc(x, y, 30, 30, 0, 360);
        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }

    public void ustawX(int x, int y) {
        this.x = x;
        this.y = y;
    }
} 