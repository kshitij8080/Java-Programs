import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class addition_applet extends Applet implements ActionListener
{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;

    public void init()
    {
        l1=new Label("Enter no 1:");
        l2=new Label("Enter no 2:");
        l3=new Label("Display Result");

        t1=new TextField(30);
        t2=new TextField(30);
        t3=new TextField(30);
        
        b1=new Button("Add");
        b2=new Button("Clear");

        b1.addActionListener(this);
        b2.addActionListener(this);
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1); add(b2);
    }
    public void actionPerformed(ActionEvent ae)
    {
          if(ae.getSource()==b1)
          {
              int a=Integer.parseInt(t1.getText());
              int b=Integer.parseInt(t2.getText());
              int c=a+b;
              t3.setText(""+c);
          }
          if(ae.getSource()==b2)
          {
              t1.setText("");
              t2.setText("");
              t3.setText("");
          }
    }
}

/*
<html>
     <body>
         <applet code="addition_applet.class" width='500' height='500'>
         </applet>
     </body>
</html>
*/
