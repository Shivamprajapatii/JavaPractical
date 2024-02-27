import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class randomColor implements ActionListener{
    JFrame f;
    public randomColor(){
        f = new JFrame("Random Color Generate");
        JButton btn = new JButton("Click Me!");
        f.add(btn);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(3);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color c = new Color(red,green,blue);
        f.getContentPane().setBackground(c);
    }
    public static void main(String[] args) {
        new randomColor();
    }
}
