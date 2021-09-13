package excercise06;

import java.util.*;

public class solution06 {
    public static void main(String[] args) {
        int currentA;
        int retirementA;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentA = sc.nextInt();

        System.out.print("At what age would you like to retire? ");
        retirementA = sc.nextInt();

        int currentTime = Calendar.getInstance().get(Calendar.YEAR); //the calendar function to store year
        int yearsLTR = retirementA-currentA;

        if(yearsLTR >= 0) { //this is to check if the number of years left is negative or not
            int retirementTime = currentTime + yearsLTR;
            System.out.println("You have "+ yearsLTR +" years left until you can retire.");
            System.out.println("It's "+currentTime+", so you can retire in "+ retirementTime +".");
        }

        else {
            System.out.println("You can already retire, you silly goose!"); //the print statement for a negative # of years
        }

    }

}



