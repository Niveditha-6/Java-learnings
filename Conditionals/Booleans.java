package Conditionals;

public class Booleans {
    public static void main(String args[]){
        int biologyGrade = 99;
        int chemistryGrade = 89;
        int physiceGrade= 97;
        int mathsGrade = 89;

        System.out.println(biologyGrade > chemistryGrade); // true
        System.out.println(physiceGrade < chemistryGrade); // false
        System.out.println(biologyGrade >= chemistryGrade); // true
        System.out.println(physiceGrade <= biologyGrade); // true
        System.out.println(chemistryGrade == mathsGrade); // true
        System.out.println(physiceGrade != mathsGrade); // true


        //comparing strings

        String sentence1 = "I am successful";
        String sentence2 = "I am successful";

        System.out.println(sentence1.equals(sentence2)); // true
        System.out.println(!sentence1.equals(sentence2)); // false



    }
    
}
