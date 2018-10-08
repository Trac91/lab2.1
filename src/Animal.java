public class Animal {
    private String type;
    private String[] continents;
    private double weight;
    private int age;

    public void setType(String type)
    {
        this.type = type;
    }
    public String getType()
    {
        return type;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public double getWeight()
    {
        return weight;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setContinents(String[] continent)
    {
        this.continents = continent;
    }

    public String[] getContinents()
    {
        return continents;
    }

    public Animal()
    {
        this.type = "No Type specified";
        this.continents = null;
        this.weight = 0.0;
        this.age = 0;
    }
    public Animal (String type, String[] continent, double weight, int age)
    {
       setType(type);
       setContinents(continent);
       setWeight(weight);
       setAge(age);
    }

    public String toString()
    {
        String conts="";

        if(continents != null)
        {
            for (int i=0; i < continents.length; i++)
            {
                conts += continents[i] + ", ";
            }
        }
        else
        {
            conts = "No Continent Specifed";
        }

        return "Type: " + type + " \nContinent: " + conts + "\nWeight: " + weight + "\nAge: " + age;

    }

    }
