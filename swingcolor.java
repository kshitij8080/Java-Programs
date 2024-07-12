import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo extends Frame implements ActionListener {
        Button b1;
        Demo() {
                setVisible(true);
                setSize(600,600);
                setLayout(new FlowLayout());

                b1 = new Button("Select Color");
                add(b1);

                b1.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ob) {
                if(ob.getSource() == b1) {
                        JColorChooser jc = new JColorChooser();
                        Color clr = jc.showDialog(this,"Select Color", Color.pink);
                        setBackground(clr);
                }
        }
        public static void main(String[] args) {
                new Demo();
        }
}
