import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class appletcarmove extends Applet implements ActionListener {
    int i=0;
    Button b1,b2;
    Image i1;
    public void init() {
        setLayout(new FlowLayout());
        b1 = new Button("start");
        b2 = new Button("Backword");

        add(b1); add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        i1 = getImage(getCodeBase(),"c.png");
    }   
    public void paint(Graphics g) {

        g.drawImage(i1, 300+i, 300,this);

        /* g.drawRect(100+i, 100, 100, 50);
        g.fillOval(110+i,150,30,30);
        g.fillOval(160+i,150,30,30);  */
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1) {
            i=i+10;
            repaint();
        }
        if(ae.getSource()==b2) {
            i=i-10;
            repaint();
        }
    }

}

/* 
  <applet code="appletcarmove" width="500" height="500">
  </applet>
 */
