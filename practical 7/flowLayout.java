import java.awt.*;
import javax.swing.*;
public class flowLayout {
    public flowLayout() 
    {
        JFrame frame = new JFrame("Flow Layout");
        JButton btn1 = new JButton("Click me!");
        JButton btn2 = new JButton("Click me!");
        JButton btn3 = new JButton("Click me!");
        JButton btn4 = new JButton("Click me!");
        JButton btn5 = new JButton("Click me!");
        JButton btn6 = new JButton("Click me!");
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);
        
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new flowLayout();
    }
}
