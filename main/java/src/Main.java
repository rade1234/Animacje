import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class Main {
    JFrame frame;

    private void createGUI() {
        frame = new JFrame();
        frame.setTitle("Kulka");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JKulka k = new JKulka();
        Animator a = new Animator(k);
        a.start();
        frame.add(k);
        frame.pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main app = new Main();
                app.createGUI();
                app.frame.setVisible(true);
            }
        });
    }
}