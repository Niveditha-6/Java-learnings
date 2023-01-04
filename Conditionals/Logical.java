package Conditionals;

public class Logical {
    public static void main(String args[]){

        //logical OR
        int chemistryGrade = 80;
        int englishGrade = 60;

        if(englishGrade >70 || chemistryGrade >70){
            System.out.println("you are eleigible to scholorship");
        }
        else{
            System.out.println("you are not eligible");
        }

        //logical AND

        int credits = 60;
        double GPA = 2.7;

        if(credits > 50 && GPA > 3.5){
            System.out.println("you earned your diploma");
        }
        else{
            System.out.println("sorry, work hard!");
        }

    }
}
