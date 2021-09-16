/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Isaac Lynch
 */

package excercise06;

import java.util.*;

class Retirement {
    int currentA;
    int retirementA;
    int currentTime = Calendar.getInstance().get(Calendar.YEAR); //the calendar function to store year

    public void scn() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentA = sc.nextInt();

        System.out.print("At what age would you like to retire? ");
        retirementA = sc.nextInt();
    }

    public void prt() {
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
public class solution06 {
    public static void main(String[] args) {

        Retirement ca = new Retirement();
        ca.scn();
        ca.prt();
    }
}

/* psuedocode: first we must import java.util.*. then, instances for the scanner
function is created along with two ints: currentA (the current age of the user)
and then retirementA (the age the user wants to retire at). after that the first
prompt is output and the number input by the user is read, same thing happens w/
the retirement output as well. after that, i make a call of the calendar function
so the program can read the in internal clock to get the year with the calendar.year
function call. (i need to find a better word other than function :pensive:) then, an
if statement is made to see whether or not the number of years the user has left
until retirement is positive or negative. first, an int is made called retirementTime
which holds the number of years left the user has until retirement. now, if the number
of years left until retirement is positive the system prints out the statement saying
how many years the user has left until retirement and the year, and if it's negative
it prints out the statement saying the user can already retire.

edit: FINALLY all the files are fixed. once again, just fixed the code so everything
wasn't running in the main function.
 */

