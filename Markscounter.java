import java.util.Scanner;

public class Markscounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter marks in Mathematics: ");
        int maths = sc.nextInt();

        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        
        int totalAll = maths + physics + chemistry;
        int totalMathsPhysics = maths + physics;

        
        boolean isMathsEligible = maths >= 65;
        boolean isPhysicsEligible = physics >= 55;
        boolean isChemistryEligible = chemistry >= 50;

        
        boolean isTotalEligible = totalAll >= 190;
        boolean isMathsPhysicsEligible = totalMathsPhysics >= 140;

        
        if (isMathsEligible && isPhysicsEligible && isChemistryEligible &&
            isTotalEligible && isMathsPhysicsEligible) {
            System.out.println("You are eligible for the professional course.");
        } else {
            System.out.println("You are NOT eligible for the professional course.");
        }

        sc.close();
    }
}


    

