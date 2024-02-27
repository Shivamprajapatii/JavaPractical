import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Mouse implements MouseListener{
    
    JTextArea ta;
    public Mouse()
    {
        JFrame frame = new JFrame("Mouse Listener");
        ta = new JTextArea(2,5);
        frame.add(ta);
        frame.pack();
       
        
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
        frame.addMouseListener(this);
    }
    public void mouseExited(MouseEvent e) {
        ta.setText("Mouse Exited");
    }
    public void mouseClicked(MouseEvent e) {
        ta.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        ta.setText("Mouse Entered");
    }
    public void mouseReleased(MouseEvent e) {
        ta.setText("Mouse Released");
    }
    public void mousePressed(MouseEvent e) {
        ta.setText("Mouse Pressed");
    }
    public static void main(String[] args) {
        new Mouse();
    }
}
