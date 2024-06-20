import java.awt.*;
import java.awt.event.*;
import java.util.*;
class User extends Frame implements ActionListener
{
      Label l1,l2,l3;
      Button b1;
      TextField t1;

      User()
      {
         setVisible(true);
         setSize(500,500);
         setLayout(new FlowLayout());

         t1=new TextField(30);
         l1=new Label("Enter user:");
         l2=new Label();
         l3=new Label();

         b1=new Button("ok");
         add(l1); add(t1);
         add(l2);add(l3);
         add(b1);
         b1.addActionListener(this);
      }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
             String s1=t1.getText();
             Date d1=new Date();
             int hr=d1.getHours();
             if(hr>=12 && hr<=17)
                l2.setText("Greet Msg= Good Afternoon.."+s1);
             else if(hr>17 && hr<=20)
                  l2.setText("Greet Msg= Good Evening..");
            else
                l2.setText("Greet Msg= good Night");

            l3.setText("Date And Time="+d1);
        }

    }
    public static void main(String arg[])
    {
        User ob=new User();
    }

}
