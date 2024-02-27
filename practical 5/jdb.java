import java.sql.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class jdb 
{
   public static void main(String args[])
{ 
    JFrame f = new JFrame("Database Connection");
    DefaultTableModel tm = new DefaultTableModel();
    tm.addColumn("Roll Number");
    tm.addColumn("Name");
    JTable t = new JTable(tm);
    JScrollPane sp = new JScrollPane(t);
    f.add(sp);
 
    f.setSize(400,400);
    f.setVisible(true);
    f.setLayout(new FlowLayout());
    f.setDefaultCloseOperation(3);

    try 
    {
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sies","root","Shivam@9621");
      Statement st = con.createStatement();
      ResultSet res = st.executeQuery("Select * from sy");

      while(res.next())
      {
        Object[] row = new Object[3];
        row[0] = res.getObject(1);
        row[1] = res.getObject(2);
  
        tm.addRow(row);
      }
        res.close();
        st.close();
        con.close();
      } 
       catch(Exception e) 
     {
        System.out.println(e);
      }
   } 
}