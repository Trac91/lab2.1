import javax.swing.*;
import java.awt.*;

public class MyFlicks {
    public static void main(String[] args) {

        int count;


        Film film1 = new Film();
        count = film1.getCount();
        Film[] catalog = new Film[count];
        JTextArea textArea = new JTextArea();
        Font font = new Font ("monospaced",Font.PLAIN,12);
        textArea.setFont(font);


        for(int i = 0; i< catalog.length; i++)
        {
            String title = JOptionPane.showInputDialog("Enter Title");
            String director = JOptionPane.showInputDialog("Enter Director");
            int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter Duration"));
            catalog[i] = new Film(title,director,duration);
        }
        String text ="";
        for(Film f : catalog)
        {
            text += f.toString();
            textArea.append(text);
        }

        JOptionPane.showMessageDialog(null,text);


    }
}
