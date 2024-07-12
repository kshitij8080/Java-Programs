import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Demo extends Frame implements ActionListener {
        Label l1,l2;
        TextField t1;
        List lst;
        Button b1;
        Demo() {
                setVisible(true);
                setSize(500,500);
                setLayout(new FlowLayout());

                l1 = new Label("Enter Directory");
                l2 = new Label("Sub-Directories");
                t1 = new TextField(30);
                lst = new List(10);
                b1 = new Button("Search");

                add(l1); add(t1);
                add(l2); add(lst);
                add(b1);

                b1.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ob) {
                if(ob.getSource() == b1) {
                        lst.clear();
                        String s1 = t1.getText();
                        File f1 = new File(s1);
                        if(f1.exists()) {
                                String s2[] = f1.list();
                                for(int i=0;i<s2.length;i++)
                                lst.add(s2[i]);
                        }
                        else {
                                lst.add("Directory not found..");
                        }
                }
        }
        public static void main(String[] args) {
                new Demo();
        }
}