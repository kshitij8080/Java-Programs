import java.awt.*;
import java.awt.event.*;

class demo extends Frame {
    TextField t1;
    demo() {
        setVisible(true);
        setSize(300,300);
        setLayout(new FlowLayout());

        t1=new TextField(20);
        add(t1);

        addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent me) {
                    int x=me.getX();
                    int y=me.getY();
                    t1.setText("x pos="+x+"y pos="+y);
                }
            }
        );
    }
    public static void main(String[] args) {
        new demo();
    }
}