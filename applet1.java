import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class applet1 extends Applet implements ItemListener,MouseListener {
    int f1=1;
    int x1,y1,x2,y2;
    Checkbox c1,c2,c3;
    CheckboxGroup cg;
    public void init() {
        cg = new CheckboxGroup();
        c1 = new Checkbox("Line",cg,true);
        c2 = new Checkbox("Rectangle",cg,false);
        c3 = new Checkbox("Oval",cg,false);
        add(c1); add(c2); add(c3);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        addMouseListener(this);
    }
    public void update(Graphics g) {
        if(f1==1)
            g.drawLine(x1, y1, x2, y2);
        if(f1==2)
            g.drawRect(x1, y1, x2-x1, y2-y1);
        if(f1==3)
            g.drawOval(x1, y1, x2-x1, y2-y1);
    }
    public void mouseClicked(MouseEvent me) {}
    public void mousePressed(MouseEvent me) {
        x1 = me.getX();
        y1 = me.getY();
    }
    public void mouseReleased(MouseEvent me) {
        x2 = me.getX();
        y2 = me.getY();
        repaint();
    }
    public void mouseEntered(MouseEvent me){}
    public void mouseExited(MouseEvent me){}
    public void itemStateChanged(ItemEvent ie) {
        if(c1.getState()==true)
            f1 = 1;
        if(c2.getState()==true)
            f1 = 2;
        if(c3.getState()==true)
            f1 = 3;
    }
}

/* 
 <applet code="applet1.class" width="500" height="400">
 </applet>
 */
