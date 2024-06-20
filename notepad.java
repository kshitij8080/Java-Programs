import java.awt.*;
class FontDemo extends Frame
{
    Choice c1,c2;
    List lst;
    TextArea tx;
    Button b1;
    FontDemo()
    {
        setVisible(true);
        setTitle("Notepad");
        setSize(100,300);
        setLocation(450,620);
        setLayout(new FlowLayout());
        c1=new Choice();
        c1.add("Arial");
        c1.add("Vardana");
        c1.add("gigi");
        c1.add("console");
        c2=new Choice();
         for(int i=18; i<=100; i++)
         {
              c2.add(""+i);
         }
        b1=new Button("ok");
        tx=new TextArea();
        lst=new List(10);
        lst.add("Redular");
        lst.add("Bold");
        lst.add("Italic");
        lst.add("Strike th");
        add(c1);add(lst);add(c2);
        add(b1);add(tx);
        
    }
public static void main(String arg[])
{
    FontDemo ob=new FontDemo();
}

}
