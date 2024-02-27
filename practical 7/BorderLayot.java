import java.awt.*;
import javax.swing.*;
public class BorderLayot {
    public BorderLayot()
    {
        JFrame frame = new JFrame("Flow Layout");
        JButton btn1 = new JButton("Click me!");
        JButton btn2 = new JButton("Click me!");
        JButton btn3 = new JButton("Click me!");
        JButton btn4 = new JButton("Click me!");
        JButton btn5 = new JButton("Click me!");
        JButton btn6 = new JButton("Click me!");
     
        frame.setSize(500,500);
        frame.setLayout(new BorderLayout(10,20));
        frame.add(btn1,BorderLayout.EAST);
        frame.add(btn2,BorderLayout.WEST);
        frame.add(btn3,BorderLayout.NORTH);
        frame.add(btn4,BorderLayout.SOUTH);
        frame.add(btn5,BorderLayout.CENTER);
    
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }
    public static void main(String[] args) {
        new BorderLayot();
    }
}
