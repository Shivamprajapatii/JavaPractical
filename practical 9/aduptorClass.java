import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class aduptorClass   
 {
     public aduptorClass()
      {
         JFrame f = new JFrame("Aduptor Class");
	 f.setSize(400,400);
         f.setVisible(true);
	 f.setDefaultCloseOperation(3);
  
         WindowListener wl = new WindowAdapter()
        {
           public void windowClosing(WindowEvent e)
           {
 	     System.out.println(0);
	   }
        };
          f.addWindowListener(wl);
      }

   public static void main(String [] args) 
   { 
       new aduptorClass();
   }
}
   