import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1;
    Demo() {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        l1 = new Label("Enter No:");
        l2 = new Label("Enter Name:");
        l3 = new Label("Enter Sal:");

        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        
        b1 = new Button("Submit");

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b1);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1) {
            int eno = Integer.parseInt(t1.getText());
            String nm = t2.getText();
            int s = Integer.parseInt(t3.getText());
            empdisplay ob = new empdisplay(eno, nm, s);
        }
    }
    public static void main(String[] args) {
        Demo ob = new Demo();
    }
}
class empdisplay extends Frame {
    Label l1,l2,l3;
    empdisplay(int eno,String nm,int s) {
        setVisible(true);
        setSize(100,300);
        setLocation(500,10);
        setBackground(Color.orange);
        setLayout(new FlowLayout());
        l1 = new Label("Emp no="+eno);
        l2 = new Label("Emp Name="+nm);
        l3 = new Label("Emp salary="+s);
        add(l1); add(l2); add(l3);
    }
}