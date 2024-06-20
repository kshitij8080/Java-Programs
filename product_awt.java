import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
    Label l1,l2,l3;
    TextField t1;
    Button b1,b2,b3,b4,b5,b6;
    List lst1,lst2;

    demo()
    {
        setVisible(true);
        setSize(500,500);
        setTitle("Products..");
        setLayout(null);

        l1=new Label("All Product");
        l2=new Label("Selected Product");
        l3=new Label("Enter Product");

        t1=new TextField(90);
        
        b1=new Button(">>");
        b2=new Button(">");
        b3=new Button("<<");
        b4=new Button("<");
        b5=new Button("Add");
        b6=new Button("Remove");

        lst1=new List(10);
        lst2=new List(10);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);

        l1.setBounds(50,50,100,50);
        add(l1);
        l2.setBounds(200,50,100,50);
        add(l2);
        lst1.setBounds(50,100,100,150);
        add(lst1);

        b1.setBounds(160,100,25,25);
        add(b1);
        b2.setBounds(160,140,25,25);
        add(b2);
        b3.setBounds(160,180,25,25);
        add(b3);
        b4.setBounds(160,220,25,25);
        add(b4);

        lst2.setBounds(200,100,100,150);
        add(lst2);

        t1.setBounds(160,270,100,25);
        add(t1);

        l3.setBounds(50,260,100,50);
        add(l3);

        b5.setBounds(50,300,50,30);
        add(b5);

        b6.setBounds(120,300,50,30);
        add(b6);

    }
public void actionPerformed(ActionEvent ae)
{
    if(ae.getSource()==b1)
    {
        for(int i=0; i<lst1.countItems(); i++)
        {
            lst2.add(lst1.getItem(i));
        }
    }
    if(ae.getSource()==b2)
    {
        lst2.add(lst1.getSelectedItem());
    }
    if(ae.getSource()==b3)
    {
        for(int i=0; i<lst2.countItems(); i++)
        {
             lst1.add(lst2.getItem(i));
        }
    }
    if(ae.getSource()==b4)
    {
        lst1.add(lst2.getSelectedItem());
    }
    if(ae.getSource()==b5)
    {
        String s1=t1.getText();
        lst1.add(s1);
    }
    if(ae.getSource()==b6)
    {
        lst2.remove(lst2.getSelectedItem());
    }

}
 public static void main(String arg[])
 {
     new demo();
 }


}
