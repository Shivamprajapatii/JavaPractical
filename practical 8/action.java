
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class action implements ActionListener {
    JFrame frame;
    JTextArea ta;
    public action()
    {
        frame = new JFrame("Action Listener");
        JButton btn = new JButton("Click me!");
        ta = new JTextArea(3,20);
        frame.add(ta);
        frame.add(btn);

        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        ta.setText("Welcome");
    }
    public static void main(String[] args) {
        new action();
    }
}
