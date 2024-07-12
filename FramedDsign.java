import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

class Demo extends JFrame {
        JMenuBar mb;
        JMenu File,Edit,Search;
        JMenuItem undo,redo,cut,paste,copy;

        Demo() {
                setVisible(true);
                setSize(500,500);

                mb = new JMenuBar();
                File = new JMenu("File");
                Edit = new JMenu("Edit");
                Search = new JMenu("Search");

                mb.add(File);
                mb.add(Edit);
                mb.add(Search);

                undo = new JMenuItem("Undo");
                redo = new JMenuItem("Redo");
                cut = new JMenuItem("Cut");
                copy = new JMenuItem("Copy");
                paste = new JMenuItem("Paste");
                
                ImageIcon = new ImageIcon()


                Edit.add(undo); Edit.add(redo); Edit.add(cut); Edit.add(paste); Edit.add(copy);
                setJMenuBar(mb);
        }
        public static void main(String[] args) {
                new Demo();
        }
}