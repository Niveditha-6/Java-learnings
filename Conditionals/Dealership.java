package Conditionals;

import java.util.Scanner;

public class Dealership {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to java dealership");
        System.out.println("select option 'a' to buy a car");
        System.out.println("select option 'b' to sell a car");
        String option = scan.nextLine();

        switch (option) {
            case "a":
                System.out.println("you chose option " + option);
                System.out.println("\n What is your budget?");
                int budget = scan.nextInt();
                if (budget > 10000) {
                    System.out.println("\nGreat!, we have a car in your budget");
                    System.out.println("\n Do you have License?");
                    scan.nextLine();
                    String license = scan.nextLine();
                    System.out.println("\n do you have insurance?");
                    String insurance = scan.nextLine();
                    System.out.println("Please enter your credit score");
                    int creditScore = scan.nextInt();
                    if (license.equals("yes") && insurance.equals("yes") && creditScore > 660) {
                        System.out.println("\nGreat!, sold ");
                    } else {
                        System.out.println(
                                "Please have your insurance and license before buying car and a good credit score ");
                    }

                } else {
                    System.out.println("sorry, your budget is too low!");
                }
                break;
            case "b":
                System.out.println("you chose option " + option);

                System.out.println("\n Can you please provide car value?");
                int carPrice = scan.nextInt();
                System.out.println("\n Can you please tell us what price you are selling the car for?");
                int sellPrice = scan.nextInt();
                if(carPrice > sellPrice && sellPrice < 30000){
                    System.out.println("\n you can sell the car");
                }
                else{
                    System.out.println("so sorry, we cannot selll the car");
                }
                break;
            default:
                System.out.println("please select option ");
        }
        scan.close();

    }

}
