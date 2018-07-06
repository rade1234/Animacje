import javax.swing.SwingUtilities;


public class Animator extends Thread {
    private final JKulka kulka;

    Animator(JKulka k) {
        kulka = k;
    }

    @Override
    public void run() {
        int x = 0;
        int y = 0;

        int dx = 1;
        int dy = 2;

        while (true) {
            x = x + dx;
            y = y + dy;
            if (x < 0 || x > 370)
                dx = -dx;
            if (y < 0 || y > 270)
                dy = -dy;

            kulka.ustawX(x, y);

            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    kulka.repaint();
                }
            });

            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}