public class MyPetDriver
{
    public static void main(String [] args)
    {
        //Dog, Lizard and Goat can be defined as a Pet as well
        Pet Brady = new Dog("Brady", "Maltipoo", 4, 62.6, "kibble");
        Lizard Komo = new Lizard("Komo", "Komodo Dragon", 12, 78.9, "bugs");
        Goat Billie = new Goat("Bille", "Oberhasli Goat", 2, 160.3, " Brown with white spots", true, "grass");
        //Pet secret = new Pet("secret", 7, 40.2); Pet is abstract and cannot be compiled

        //System.out.println(Brady.fetch());//only works when defined as Dog not as Pet
        //System.out.println(Brady.Speak());//slower with Pet than Dog bc late binding
//        int[] arrayOfInts = new int[5];//creates arrays
//        Pet[] meangerie = new Pet[5];
//        meangerie[0] = Brady;
//        meangerie[1] = Komo;
//        meangerie[2] = Billie;
//
//        for(int i = 0; i < 5; i ++)
//        {
//            System.out.println(meangerie[i]);
//        }//end for
        //speaking to pets-
        //System.out.println("Billie says:  " + Billie.Speak());
        //changing units
        //System.out.println("Billie's weight in pounds is: " + Billie.AmericanFreedomUnits());
        //testing pets
        //System.out.print(Brady + "\n" + Komo + "\n" + Billie);

    }

}
