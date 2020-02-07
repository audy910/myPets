import java.text.DecimalFormat;
public abstract class Pet
{
    protected String name, food;
    protected int age;
    protected double weight;//in kg
    DecimalFormat fmt = new DecimalFormat("#.#");//create formatting object
    public Pet(String name, int age, double weight, String food)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.food = food;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public double getWeight()
    {
        return weight;
    }

    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    //brain method
    abstract public String Speak();

    public double AmericanFreedomUnits()
    {
        return weight * 2.205;
    }

    public String toString()
    {
        String output = "Name: " + name;
        output += "\nAge: " + age;
        output += "\nWeight: " + weight + " kg" + "(" +
                   fmt.format(AmericanFreedomUnits()) + " in pounds)";
        output += "\nFood" + food;

        return output;
    }
}
