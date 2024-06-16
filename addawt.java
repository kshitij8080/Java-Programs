import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener {
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2,b3,b4,b5;
  demo() {
    setVisible(true);
    setSize(500,500);
    setTitle("Addition Program");
    setLayout(new FlowLayout());
    l1=new Label("Enter NO1:");
    l2=new Label("Enter NO2:");
    l3=new Label("Result:");
    
    t1=new TextField(10);
    t2=new TextField(10);
    t3=new TextField(10);

    b1=new Button("Addition");
    b2=new Button("Substraction");
    b3=new Button("Multiplication");
    b4=new Button("Division");
    b5=new Button("Clear");
    add(l1); add(t1); add(l2); add(t2); add(l3); add(t3);
    add(b1); add(b2); add(b3); add(b4); add(b5);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
  }
   public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==b1) {
      int a=Integer.parseInt(t1.getText());
      int b=Integer.parseInt(t2.getText());
      int c=a+b;
      t3.setText(""+c);
    }
    if(ae.getSource()==b2) {
       int a=Integer.parseInt(t1.getText());
      int b=Integer.parseInt(t2.getText());
      int c=a-b;
      t3.setText(""+c);
    }
    if(ae.getSource()==b3) {
       int a=Integer.parseInt(t1.getText());
      int b=Integer.parseInt(t2.getText());
      int c=a*b;
      t3.setText(""+c);
    }
    if(ae.getSource()==b4) {
       int a=Integer.parseInt(t1.getText());
      int b=Integer.parseInt(t2.getText());
      int c=a/b;
      t3.setText(""+c);
    }
    if(ae.getSource()==b5) {
        t1.setText("");
        t2.setText("");
        t3.setText("");
    }
   }
   public static void main(String[] args) {
    demo ob=new demo();
   }
}
