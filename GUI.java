import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class GUI implements ActionListener {

    JFrame window;
    // word counter
    JLabel wordCountLabel;

    // Text Area
    JTextArea textArea;
    JScrollPane scrollPane;
    boolean wordwrapOn = false;
    // Top Menu Bar
    JMenuBar menuBar;
    JMenu menuFile, menuEdit, menuFormat, menuColor, menuAbout;
    // File Menu
    JMenuItem iNew, iOpen, iSave, iSaveAs, iExit;
    // Edit Menu
    JMenuItem iUndo, iRedo;
    // Format Menu
    JMenuItem iWrap, iFontArial, iFontCSMS, iFontTNR, iFontImpact, iFontLCW, iFontSize8, iFontSize10, iFontSize12, iFontSize16,
            iFontSize18, iFontSize20, iFontSize24, iFontSize28, iFontSize30;
    JMenu menuFont, menuFontSize;

    // Color Menu
    JMenuItem iColor1, iColor2, iColor3, iColor4, iColor5;

    Function_File file = new Function_File(this);
    Function_Format format = new Function_Format(this);
    Function_Color color = new Function_Color(this);
    Function_Edit edit = new Function_Edit(this);

    KeyHandler kHandler = new KeyHandler(this);

    UndoManager um = new UndoManager();

    // Logo
    // ImageIcon logo = new ImageIcon("..//res//noteIcon.png");
    ImageIcon logo = new ImageIcon(GUI.class.getResource("noteIcon.png"));

    public static void main(String[] args) {
  
    }

    public GUI() {


    }

    public int countWords() {

    }

    public void updateWordCountLabel() {


    }

    public void createWindow() {


    }

    public void createTextArea() {


    }

    public void createMenuBar() {
 

    }

    public void createFileMenu() {


    }

    public void createEditMenu() {


    }

    public void createFormatMenu() {


    }

    public void createColorMenu() {


       
    }
    public void createAboutMenu() {
 

    }
    private void displayAboutDialog() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
        
}
