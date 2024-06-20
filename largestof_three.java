
import java.awt.*;
import java.awt.event.*;
class Num extends Frame implements ActionListener
{
    Label l1,l2,l3,l4;
    TextField t1,t2,t3,t4;
    Button b1;

    Num()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        l1=new Label("enter first Number:");
        l2=new Label("enter Second Number:");
        l3=new Label("enter Third Number:");
        l4=new Label("Result=");

        t1=new TextField(30);
        t2=new TextField(30);
        t3=new TextField(30);
        t4=new TextField(30);
        
        b1=new Button("Ok");
        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(l4); add(t4);
        add(b1);

        b1.addActionListener(this);        
    }
      public void actionPerformed(ActionEvent ae)
      {
        if(ae.getSource()==b1)
        {
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=Integer.parseInt(t3.getText());

            if(a>b && a>c)
               t4.setText("First Number is Greater..");
            else if(b>a && b>c)
               t4.setText("Second Number is Greater..");
            else
              t4.setText("Third Number is Greater..");
        }
      }
    public static void main(String arg[])
    {
        Num ob=new Num();
    }
      }

