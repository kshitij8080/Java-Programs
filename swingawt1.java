import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class demo extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2,b3;
    demo() {
        setVisible(true);
        setSize(700,400);
        setLayout(null); 
        
        Font f1=new Font("",Font.BOLD,20);
        l1=new JLabel("Enter String");
        l1.setFont(f1);
        l2=new JLabel("Result String");
        l2.setFont(f1);

        t1=new JTextField(20);
        t1.setFont(f1);
        t2=new JTextField(20);
        t2.setFont(f1);
        
        b1=new JButton("Lowercase");
        b2=new JButton("Uppercase");
        b3=new JButton("Length");


        l1.setBounds(100,50,200,50);
        add(l1);
         l2.setBounds(100,100,200,50);
        add(l2);
        
        t1.setBounds(300,60,300,30);
        add(t1);
        t2.setBounds(300,110,300,30);
        add(t2);
        
        b1.setBounds(100,190,170,40);
        b1.setFont(f1);
        add(b1);
        
        b2.setBounds(280,190,170,40);
        b2.setFont(f1);
        add(b2);
        
        b3.setBounds(460,190,170,40);
        b3.setFont(f1);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==b1) {
                    String s1=t1.getText();
                    t2.setText(s1.toLowerCase());
            }
            if(ae.getSource()==b2) {
                    String s1=t1.getText();
                    t2.setText(s1.toUpperCase());
            }
            if(ae.getSource()==b3) {
                    String s1=t1.getText();
                    t2.setText(String.valueOf(s1.length()));
            }
            
    }
    public static void main(String[] args) {
        new demo();
    }
}
