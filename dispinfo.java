import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Demo extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1;
    JTextArea ta1,ta2;
    JButton b1,b2;
    Choice ch1;
    Checkbox c1,c2,c3,c4,c5;
    CheckboxGroup cg;

    Demo() {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        l1=new JLabel("Enter Name");
        l2=new JLabel("Address");
        l3=new JLabel("Gender");
        l4=new JLabel("Hobbies");
        l5=new JLabel("Class");
        l6=new JLabel("Display Result");

        t1=new JTextField(20);
        ta1=new JTextArea(3,20);
        ta2=new JTextArea(5,20);

        cg=new CheckboxGroup();
        c1=new Checkbox("Male",cg,true);
        c2=new Checkbox("Female",cg,false);

        c3=new Checkbox("Cricket");
        c4=new Checkbox("Instagram");
        c5=new Checkbox("BGMI");

        ch1=new Choice();
        ch1.add("BCS");
        ch1.add("BCA");
        ch1.add("MCS");
        ch1.add("MCA");

        b1=new JButton("Add");
        b2=new JButton("Clear");

        add(l1);
        add(t1);
        add(l2);
        add(ta1);
        add(l3);
        add(c1);
        add(c2);
        add(l4);
        add(l4);
        add(c3);
        add(c4);
        add(c5);
        add(l5);
        add(ch1);
        add(l6);
        add(ta2);
        add(b1);
        add(b2);     

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1) {
            String name=t1.getText();
            String add=ta1.getText();
            String gender="";
            if(c1.getState()==true)
                gender="Male";
            if(c2.getState()==true)
                gender="Female";

            String hb="";
            if(c3.getState()==true)
                hb="Cricket";
            if(c4.getState()==true)
                hb="Instagram";
            if(c5.getState()==true)
                hb="BGMI";

            String cls=ch1.getSelectedItem();

                ta2.append("Name="+name);
                ta2.append("\n address="+add);
                ta2.append("\n Gender="+gender);
                ta2.append("\n Hobbies="+hb);
                ta2.append("\n Class="+cls);
        }
        if(ae.getSource()==b2) {
            t1.setText(" ");
            ta1.setText(" ");
            c1.setState(false);
            c2.setState(false);
            c3.setState(false);
            c4.setState(false);
            c5.setState(false);
            ta2.setText(" ");
        }
    }
    public static void main(String[] args) {
        new Demo();
    }
}