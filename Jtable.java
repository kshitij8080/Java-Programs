import javax.swing.*;
import java.awt.*;
class demo extends JFrame {
    JTable T;
    demo() {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        String head[] = {"Tno" ,"Tname" ,"Tsal"};
        String data[][] = {{"101" ,"om" ,"500000"},
                           {"102" ,"sai" ,"60000"},
                           {"103" ,"ram" ,"70000"}
                          };
        T = new JTable(data,head);
        JScrollPane jsp = new JScrollPane(T);
        add(jsp);
    }
    public static void main(String[] args) {
        new demo();
    }
}