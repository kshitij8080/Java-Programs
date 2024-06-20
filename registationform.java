import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8;
    JButton b1,b2;
    JCheckBox ch1,ch2;
    JComboBox j1;

    demo() {
        setVisible(true);
        setSize(500,500);
        setLayout(null);

        l1=new JLabel("Registration Form");
        l2=new JLabel("Student ID");
        l3=new JLabel("Student Name");
        l4=new JLabel("Phone Number");
        l5=new JLabel("Department");
        l6=new JLabel("City");
        l7=new JLabel("Email Address");
        l8=new JLabel("Father Name");
        l9=new JLabel("Address");
        l10=new JLabel("Gender");

        String s1[]={"Science","Commerce","Arts"};
        j1=new JComboBox(s1);

        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t4=new JTextField(10);
        t5=new JTextField(10);
        t6=new JTextField(10);
        t7=new JTextField(10);
        t8=new JTextField(10);

        ch1=new JCheckBox("Male",false);
        ch2=new JCheckBox("Female",false);

        b1=new JButton("Submit");
        b2=new JButton("Clear");

        Font f1=new Font("",Font.BOLD,30);
        Font f2=new Font("",Font.BOLD,20);
        Font f3=new Font("",Font.BOLD,20);
        Font f4=new Font("",Font.BOLD,15);

        l1.setBounds(800,40,500,50);
        l1.setFont(f1);
        l1.setForeground(Color.blue);
        l1.setBackground(Color.black);
        add(l1);
        l2.setBounds(700,150,150,50);
        l2.setFont(f2);
        add(l2);
        l3.setBounds(700,200,200,50);
        l3.setFont(f2);
        add(l3);
        l10.setBounds(700,250,200,50);
        l10.setFont(f2);
        add(l10);
        l4.setBounds(700,300,200,50);
        l4.setFont(f2);
        add(l4);
        l5.setBounds(700,350,200,50);
        l5.setFont(f2);
        add(l5);
        l6.setBounds(700,400,200,50);
        l6.setFont(f2);
        add(l6);
        l7.setBounds(700,450,200,50);
        l7.setFont(f2);
        add(l7);
        l8.setBounds(700,500,200,50);
        l8.setFont(f2);
        add(l8);
        l9.setBounds(700,550,200,50);
        l9.setFont(f2);
        add(l9);

        t1.setBounds(900,160,300,30);
        t1.setFont(f3);
        add(t1);
        t2.setBounds(900,210,300,30);
        t2.setFont(f3);
        add(t2);
        ch1.setBounds(900,260,80,30);
        ch1.setFont(f4);
        add(ch1);
        ch2.setBounds(990,260,90,30);
        ch2.setFont(f4);
        add(ch2);
        t3.setBounds(900,310,300,30);
        t3.setFont(f3);
        add(t3);
        j1.setBounds(900,360,300,30);
        j1.setFont(f4);
        add(j1);
        t5.setBounds(900,410,300,30);
        t5.setFont(f3);
        add(t5);
        t6.setBounds(900,460,300,30);
        t6.setFont(f3);
        add(t6);
        t7.setBounds(900,510,300,30);
        t7.setFont(f3);
        add(t7);
        t8.setBounds(900,560,300,30);
        t8.setFont(f3);
        add(t8);

        b1.setBounds(800,610,170,35);
        b1.setFont(f2);
        add(b1);
        b2.setBounds(990,610,150,35);
        b2.setFont(f2);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1) {
            
            JOptionPane.showMessageDialog(this,"Registration Successful... ");
        }
        if(ae.getSource()==b2) {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
            t4.setText(" ");
            t5.setText(" ");
            t6.setText(" ");
            t7.setText(" ");
            t8.setText(" ");
        }
    }
    public static void main(String[] args) {
        new demo();
    }
}
