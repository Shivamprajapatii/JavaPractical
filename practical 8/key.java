import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class key implements KeyListener 
{
    JTextArea ta;
    JLabel l;
    public key()
     {
        JFrame f = new JFrame();

	ta = new JTextArea();
	JLabel l = new JLabel();
	
	f.add(ta);
	f.add(l);	

	f.pack();	

        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
 	f.setLayout(new FlowLayout());
	ta.addKeyListener(this);
     }
   
    public void keyPressed(KeyEvent e) 
     {
        ta.setText("Key was Preesed");
     }
    public void keyReleased(KeyEvent e )
     {
        ta.setText("Key Released");
     }
    public void keyTyped(KeyEvent e ) 
     {
        ta.setText("Key Was Typed");
     }
  public static void main(String args[]) 
   {
      new key();
   }
}