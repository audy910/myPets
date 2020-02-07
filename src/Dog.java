public class Dog extends Pet
{
    private String breed;


    public Dog(String name, String breed, int age, double weight, String food)
    {
        super(name, age, weight, food);
        this.breed = breed;
    }//end full constructor with call to super

    public String fetch()
    {
        if(Math.random() >= 0.5)
        {
            return "Fetch accomplished";
        }
        else
            return "No fetch here ):";
    }//end method that exists in Dog but not Pet to demonstrate polymophism

    public  int monthlyFeeding()
    {
        int dailyFeedings;
        if(super.getAge() < 6)
        {
            dailyFeedings = 2;
        }
        else
        {
            dailyFeedings = 1;
        }

        return dailyFeedings * 30;
    }
    public String Speak()
    {
        if(this.age < 2)
        {
            return "squeaking";
        }
        return "woof";
    }
    public String toString()
    {
        String output ="\nBreed: " + breed + "\n" +super.toString()  ;
        return output;
    }//toString with super

}
