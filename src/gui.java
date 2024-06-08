import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui {
    public static void main(String args[]) {
        Abc obj = new Abc();
        obj.setVisible(true);
        obj.setSize(400,400);
    }

    static class Abc extends JFrame {
        public Abc() {
            JLabel l = new JLabel("hello world");
            add(l);
        }
    }
}