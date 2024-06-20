import java.awt.*;
class javaawt3 extends Frame {
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;
    javaawt3() {
        setVisible(true);
        setSize(500,400);
        setLayout(null);
        l1=new Label("Compound Intrest Calculator");
        l2=new Label("Principle Amount");
        l3=new Label("Intrest Rate(%)");
        l4=new Label("Time(Yrs)");
        l5=new Label("Total Amount");
        l6=new Label("Intrest Amount");
        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        t4=new TextField(10);
        t5=new TextField(10);
        b1=new Button("Calculate");
        b2=new Button("Clear");
        b3=new Button("Close");

        l1.setBounds(170,50,200,50);
        add(l1);
        l2.setBounds(50,100,100,50);
        add(l2);
        l3.setBounds(50,150,100,50);
        add(l3);
        l4.setBounds(280,150,70,50);
        add(l4);
        l5.setBounds(50,200,100,50);
        add(l5);
        l6.setBounds(50,250,100,50);
        add(l6);
        t1.setBounds(150,115,200,20);
        add(t1);
        t2.setBounds(140,165,100,20);
        add(t2);
        t3.setBounds(300,165,150,20);
        add(t3);
        t4.setBounds(150,215,150,20);
        add(t4);
        t5.setBounds(150,265,150,20);
        add(t5);
        b1.setBounds(50,300,100,20);
        add(b1);
        b2.setBounds(170,300,70,20);
        add(b2);
        b3.setBounds(260,300,50,20);
        add(b3);
    }
    public static void main(String[] args) {
        new javaawt3();
    }
}
