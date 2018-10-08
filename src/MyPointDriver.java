import javax.swing.*;

public class MyPointDriver {
    public static void main (String[] args)
    {


        MyPoint a = new MyPoint();
        MyPoint a2 = new MyPoint(3,4);

        JOptionPane.showMessageDialog(null, a.toString());

        JOptionPane.showMessageDialog(null, a2.toString());

        JOptionPane.showMessageDialog(null,"X Value: " + a2.getxVal() + "Y Value: " + a2.getyVal());

        String value =  JOptionPane.showInputDialog(null,"Number of units to move on X - Axis? ");
        int intValue = Integer.parseInt(value);

       // moveHorizontally(intValue);
    }

}


