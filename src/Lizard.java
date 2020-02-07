public class Lizard extends Pet
{
    private String species;


    public Lizard(String name, String species, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.species = species;
    }//end constructor with super
    public String Speak()
    {
        return "hiss";
    }
    public int monthlyFeeding()
    {
        return 8;
    }
    public String toString()
    {
       String output = "\nSpecies: "   + species + "\n" +super.toString()  ;
       return output;
    }//end toString with call to super
}//end class Lizard which is a pet
