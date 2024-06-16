import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener {
  Label l1,l2;
  TextField t1,t2;
  Button b1,b2;
  demo() {
    setVisible(true);
    setSize(500,500);
    setLayout(new FlowLayout());
    
    l1=new Label("Enter Number:");
    l2=new Label("RESULT");
    t1=new TextField(10);
    t2=new TextField(10);
    b1=new Button("Square");
    b2=new Button("Cube");
    
    add(l1); add(t1); add(l2); add(t2); add(b1); add(b2);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
  }
    public void actionPerformed(ActionEvent ae) {
      if(ae.getSource()==b1) {
        int a=Integer.parseInt(t1.getText());
        int n=a*a;
        t2.setText(""+n);
      }
      if(ae.getSource()==b2) {
        int a=Integer.parseInt(t1.getText());
        int n=a*a*a;
        t2.setText(""+n);
      }
    }
    public static void main(String[] args) {
      demo ob=new demo();
    }
}
