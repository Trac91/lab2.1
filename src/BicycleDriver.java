import javax.swing.*;
import java.awt.*;

public class BicycleDriver {
    public static void main(String[] args) {

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        Bicycle bicycle1 = new Bicycle();
        Bicycle bicycle2 = new Bicycle();

        String name = JOptionPane.showInputDialog("Enter Name: ");
        double value = Double.parseDouble(JOptionPane.showInputDialog("Enter Value"));
        String make = JOptionPane.showInputDialog("Enter Make");



    }
}
