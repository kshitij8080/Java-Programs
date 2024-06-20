
import java.awt.*;
import java.awt.event.*;
class KeyDemo extends Frame implements KeyListener
{
     TextField t1;
      KeyDemo()
      {
          setVisible(true);
          setSize(500,500);
          setLayout(new FlowLayout());
          t1=new TextField(30);
          add(t1);
          t1.addKeyListener(this);
      }

          public void keyPressed(KeyEvent ke)
          {
            setTitle("key pressed");
          }
          public void keyReleased(KeyEvent ke)
          {
            setTitle("key Released");
          }
          public void keyTyped(KeyEvent ke)
          {
             setTitle("Typing..");
          }
        public static void main(String arg[])
        {
             KeyDemo ob=new KeyDemo();
        }
}

