import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class anonym 
{   
  
   public anonym()
   {
     JFrame f = new JFrame("Anonym Class");
     JButton btn = new JButton("Clicl me!");
     JLabel l = new JLabel();

     f.add(btn);
     f.add(l);

     f.setSize(400,400);
     f.setDefaultCloseOperation(3);
     f.setLayout(new FlowLayout());
     f.setVisible(true);
     btn.addActionListener(new ActionListener()
     {
       public void actionPerformed(ActionEvent e)
      {
	l.setText("anynomus class Executed");
      }
     });
  }
  public static void main(String args[])
  {
    new anonym();
  }
}
