public class Goat extends Pet
{
    private String breed, color;
    boolean isFemale;



    public Goat(String name, String breed, int age, double weight, String color, boolean isFemale, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
        this.color = color;
        this.isFemale = isFemale;
    }//end full constructor with call to super

    public String Speak()
    {
        return "ahhh";
    }
    public String toString()
    {
        String output = "\nBreed: " +  breed +"\n" + super.toString() +  "\nColor:" + color + "\nIs a female? " + isFemale;
        return output;
    }//toString with super

}
