package variables;

public class Variables {


    public static void main(String args[]){
        int passengers = 6;
        System.out.println(passengers);

        int busTickets = passengers;
        System.out.println(busTickets);

        String name = "Raghunandan";
        System.out.println("Name is " + name);

        char initial = 'N';
        System.out.println("The Full name is " + name + " " + initial);

        // long variables must end with L telling java its long
        long globalPopulation = 8_000_000_000L;

        //double is used for fractions
        double myScore = 9.6;

        //always use double for maths calculations for accurate results

        //prints 8 which is not accurate
        int wallet = 50;
        int people = 6;
        System.out.println(wallet/people);

        // since one of the variable is double, its prints 8.333333333333334 [15 decimal places]
        double purse = 50;
        int persons = 6;
        System.out.println(purse/persons);




    }
   
    
}
