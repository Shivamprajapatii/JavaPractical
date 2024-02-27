import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class textColor implements ActionListener {
    JFrame f;
    JButton btn;
    JTextArea ta;
    public textColor() {
        f = new JFrame("text Color");
        ta = new JTextArea(20,30);
        btn = new JButton("Click me!");
        JScrollPane sp = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        f.add(sp);
        f.add(btn);
        
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(3);
        btn.addActionListener(this);        
    }
    public void actionPerformed(ActionEvent e) {
       
    }

    public static void main(String[] args)
    {
        new textColor();
    }
}
