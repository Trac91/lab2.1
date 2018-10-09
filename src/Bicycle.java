public class Bicycle {
    private String name;
    private double value;
    private String make;

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getMake() {
        return make;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Bicycle()
    {
        this.name = name;
        this.value = value;
        this.make= make;
    }

    public Bicycle(String name, double value, String make)
    {
        setName(name);
        setValue(value);
        setMake(make);
    }

    public String toString()
    {
        return "Owners Name: " + name + "Value Of Bicycle" + value + "Make Of Bicycle" + make;
    }
}
