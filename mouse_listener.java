
import java.awt.*;
import java.awt.event.*;
class MouseDemo extends Frame implements MouseListener
{
    TextField t1;

    MouseDemo()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        t1=new TextField(60);
        add(t1);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me)
    {
        t1.setText("mouse Clicked Event");
    }
    public void mousePressed(MouseEvent me)
    {
        t1.setText("mouse Pressed");
    }
    public void mouseReleased(MouseEvent me)
    {
        t1.setText("Mouse released");
    }
    public void mouseEntered(MouseEvent me)
    {
        t1.setText(" MOuse Enterd");
    }
    public void mouseExited(MouseEvent me)
    {
        t1.setText("Mouse Exited");
    }
public static void main(String arg[])
{
   MouseDemo ob=new MouseDemo();
}
}

