import java.awt.*;
class demo extends Frame {
    Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4;
    Button b1;
    demo() {
        setVisible(true);
        setSize(500,400);
        setLayout(null);
        l1=new Label("Email Register");
        Font f1=new Font("",Font.BOLD,20);
        Font f2=new Font("",Font.BOLD,10);
        l1.setFont(f1);
        l2=new Label("First Name");
        l2.setFont(f2);
        l3=new Label("Last Name");
        l3.setFont(f2);
        l4=new Label("Email Address");
        l4.setFont(f2);
        l5=new Label("Password");
        l5.setFont(f2);
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        b1=new Button("REGISTER");
        b1.setFont(f2);
        l1.setBounds(50,50,200,50);
        add(l1);
        l2.setBounds(50,100,70,50);
        add(l2);
        l3.setBounds(50,150,50,50);
        add(l3);
        l4.setBounds(50,200,70,50);
        add(l4);
        l5.setBounds(50,250,70,50);
        add(l5);
        t1.setBounds(130,115,200,20);
        add(t1);
        t2.setBounds(130,165,200,20);
        add(t2);
        t3.setBounds(130,215,200,20);
        add(t3);
        t4.setBounds(130,265,200,20);
        add(t4);
        b1.setBounds(50,300,100,20);
        add(b1);
    }
    public static void main(String[] args) {
        new demo();
    }
}
