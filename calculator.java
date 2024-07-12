import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Demo extends JFrame implements ActionListener {
  float a,b,c;
  int ch;
  JTextField t1;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,dot,add,multi,sub,div,equal,clr;
  Demo() {
    setVisible(true);
    setSize(500,500);
    setLayout(null);
    Font f1=new Font("",Font.BOLD,20);
    t1=new JTextField(20);
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
    b0=new JButton("0");
    dot=new JButton(".");
    add=new JButton("+");
    multi=new JButton("*");
    sub=new JButton("-");
    div=new JButton("/");
    equal=new JButton("=");
    clr=new JButton("Clear");

    JPanel p1=new JPanel();
    p1.setLayout(new GridLayout(4,4,10,10));
    p1.add(b1); p1.add(b2); p1.add(b3); p1.add(add);
    p1.add(b4); p1.add(b5); p1.add(b6); p1.add(sub);
    p1.add(b7); p1.add(b8); p1.add(b9); p1.add(multi);
    p1.add(dot); p1.add(b0); p1.add(equal); p1.add(div);
    t1.setBounds(200,50,300,30);
    t1.setFont(f1);
    add(t1);
    clr.setBounds(300,310,100,40);
    add(clr);
    p1.setBounds(200,100,300,200);
    add(p1);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    add.addActionListener(this);
    sub.addActionListener(this);
    div.addActionListener(this);
    equal.addActionListener(this);
    dot.addActionListener(this);
    multi.addActionListener(this);
    clr.addActionListener(this);

  }
  public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b1)
      t1.setText(t1.getText()+"1");
      if(ae.getSource()==b2)
      t1.setText(t1.getText()+"2");
      if(ae.getSource()==b3)
      t1.setText(t1.getText()+"3");
      if(ae.getSource()==b4)
      t1.setText(t1.getText()+"4");
      if(ae.getSource()==b5)
      t1.setText(t1.getText()+"5");
      if(ae.getSource()==b6)
      t1.setText(t1.getText()+"6");
      if(ae.getSource()==b7)
      t1.setText(t1.getText()+"7");
      if(ae.getSource()==b8)
      t1.setText(t1.getText()+"8");
      if(ae.getSource()==b9)
      t1.setText(t1.getText()+"9");
      if(ae.getSource()==b0)
      t1.setText(t1.getText()+"0");
      if(ae.getSource()==dot)
      t1.setText(t1.getText()+".");

      if(ae.getSource()==add) {
        a=Float.parseFloat(t1.getText());
        t1.setText("");
        ch=1;
      }
      if(ae.getSource()==sub) {
        a=Float.parseFloat(t1.getText());
        t1.setText("");
        ch=2;
      }
      if(ae.getSource()==multi) {
        a=Float.parseFloat(t1.getText());
        t1.setText("");
        ch=3;
      }
      if(ae.getSource()==div) {
        a=Float.parseFloat(t1.getText());
        t1.setText("");
        ch=4;
      }
      if(ae.getSource()==equal) {
        b=Float.parseFloat(t1.getText());
        if(ch==1)
          c=a+b;
        if(ch==2)
          c=a-b;
        if(ch==3)
          c=a*b;
        if(ch==4)
          c=a/b;
        t1.setText(""+c); 
      }
      if(ae.getSource()==clr) {
          t1.setText(" ");
      }

  }
  public static void main(String[] args) {
    new Demo();
  }
}
