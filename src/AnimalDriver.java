import javax.swing.*;

public class AnimalDriver {
    public static void main(String[] args)
    {
        Animal a = new Animal();

        JOptionPane.showMessageDialog(null, a.toString());

        String[] continent = {"Africa","Asia"};

        Animal a2 = new Animal("Lion",continent,123,4);

        JOptionPane.showMessageDialog(null, a2.toString());

        JOptionPane.showMessageDialog(null, "Type: " + a2.getType() + "\n" + "Continents: " + a2.getContinents());


        /* String type;
      //  String[] continent ;
        double weight;
        int age;
        // continent c;

        type = JOptionPane.showInputDialog("Please enter type of animal");

        String continent[] = new String[5];

        for (int i =0; i < continent.length;i++)
        {
            continent[i] = JOptionPane.showInputDialog("Please enter continent: ");

        }

        weight = (Double.parseDouble(JOptionPane.showInputDialog("Please enter weight of animal")));
        age = (Integer.parseInt(JOptionPane.showInputDialog("Please enter age of animal")));


        JOptionPane.showMessageDialog(null, a.toString());*/












    }
}
