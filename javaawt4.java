import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener {
	Label l1,l2;
	TextField t1;
	TextArea ta;
	Button b1;
	demo() {
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		l1=new Label("Enter String");
		l2=new Label("Result String");
		t1=new TextField(10);
		ta=new TextArea(5,30);
		b1=new Button("OK");
		add(l1); add(t1);
		add(l2); add(ta);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String s1=t1.getText();
			String s2[]=s1.split(" ");
			for(int i=0;i<s2.length;i++)
				ta.append(s2[i]+"\n");
		}
	}
	public static void main(String[] args) {
		new demo();
	}
}