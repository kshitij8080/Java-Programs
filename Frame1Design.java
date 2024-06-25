import java.awt.*;
import javax.swing.*;

class Demo extends JFrame {
    JMenuBar mb;
    JMenu File, Edit, Search;
    JMenuItem undo, redo, cut, paste, copy;

    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image img = icon.getImage();  
        Image resizedImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImg);
    }

    Demo() {
        setSize(500, 500);
        
        mb = new JMenuBar();
        File = new JMenu("File");
        Edit = new JMenu("Edit");
        Search = new JMenu("Search");
        
        mb.add(File);
        mb.add(Edit);
        mb.add(Search);
        
        int iconWidth = 20;
        int iconHeight = 20;

        ImageIcon undoIcon = resizeIcon(new ImageIcon("C:\\All-Programs\\Java program\\JAVA-Programs\\Java/undo.png"), iconWidth, iconHeight);
        ImageIcon redoIcon = resizeIcon(new ImageIcon("C:\\All-Programs\\Java program\\JAVA-Programs\\Java/redo.png"), iconWidth, iconHeight);
        ImageIcon cutIcon = resizeIcon(new ImageIcon("C:\\All-Programs\\Java program\\JAVA-Programs\\Java/cut.png"), iconWidth, iconHeight);
        ImageIcon copyIcon = resizeIcon(new ImageIcon("C:\\All-Programs\\Java program\\JAVA-Programs\\Java/files.png"), iconWidth, iconHeight);
        ImageIcon pasteIcon = resizeIcon(new ImageIcon("C:\\All-Programs\\Java program\\JAVA-Programs\\Java/paste.png"), iconWidth, iconHeight);

        undo = new JMenuItem("Undo", undoIcon);
        redo = new JMenuItem("Redo", redoIcon);
        cut = new JMenuItem("Cut", cutIcon);
        copy = new JMenuItem("Copy", copyIcon);
        paste = new JMenuItem("Paste", pasteIcon);
        
        Edit.add(undo);
        Edit.add(redo);
        Edit.add(cut);
        Edit.add(copy);
        Edit.add(paste);
        
        setJMenuBar(mb);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
