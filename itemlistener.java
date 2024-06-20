
import java.awt.*;
import java.awt.event.*;
class Item extends Frame implements ItemListener
{
    Choice c1;
    TextField t1;

    Item()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        
        c1=new Choice();
        c1.add("C");
        c1.add("C++");
        c1.add("Java");
        add(c1);
        t1=new TextField(30);
        add(t1);
        c1.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent ie)
    {
         if(ie.getSource()==c1)
         {
             String s1=c1.getSelectedItem();
             t1.setText(s1);
         }
    }
public static void main(String arg[])
{
     Item ob=new Item();
}
}

