//Author: Jay Olson
//Section: CIS 2212-801
//Assignment: Project 2 CFA Pay
//Due Date: February 11, 2026
//Submitted: February 3, 2026

/*
Program Purpose: Practice input, variable declarations, assignment statements, calculations, String and Math class
methods, and formatted output.

Program Function: Collect information using a Scanner object, break down employee  pay into certain money denominations,
and output results into a formatted report. This is a prototype for what could be refactored and extended into a larger
program supporting many employees.

Note: This assignment specified to not do anything too fancy, so I purposefully didn't use if statements, classes, loops, 
arrays, or anything else other than what was specified in the assignment specification document.
*/

//Github repo for this project is at: https://github.com/jayosinclair/CIS2212_A2_cfaPay.git
//**********************************************************************************************************************

import java.util.Scanner;

public class CFA_Pay {

    public static void main(String[] args) {

        //Constants for denominations just to not have magic numbers below:
        final int TEN_THOUSAND_CFA = 10000; //Largest CFA denomination
        final int FIVE_THOUSAND_CFA = 5000;
        final int ONE_THOUSAND_CFA = 1000;
        final int FIVE_HUNDRED_CFA = 500;
        final int ONE_HUNDRED_CFA = 100;
        final int FIFTY_CFA = 50;
        final int TWENTY_FIVE_CFA = 25;
        final int TEN_CFA = 10;
        final int FIVE_CFA = 5; //Smallest CFA denomination

        //Variables to represent counts of each denomination (each initialized to -1 just for debugging if needed):
        int countTenThousandCFA = -1;
        int countFiveThousandCFA = -1;
        int countOneThousandCFA= -1;
        int countFiveHundredCFA = -1;
        int countOneHundredCFA = -1;
        int countFiftyCFA = -1;
        int countTwentyFiveCFA = -1;
        int countTenCFA = -1;
        int countFiveCFA = -1;

        //Other variables to meet program requirements:
        int empPayAmount = -1;
        int tempPayAmount = -1;
        String empFirstName;
        String empLastName;
        String empFullName; //Not truncated
        String truncatedEmpFullName;
   

        Scanner scan = new Scanner(System.in); //Memory leak for this object isn't closed since we haven't discussed deallocation yet.
        
        //***************************************************INPUT SECTION*******************************************************
        
        System.out.println("\n\n"); //Make a margin for readability

        System.out.print("Employee's first name: ");
        empFirstName = scan.next();

        System.out.print("Employee's last name: ");
        empLastName = scan.next();

        System.out.print("Pay in CFA: ");
        empPayAmount = scan.nextInt(); //In future extension, I could add while loop validation here to ensure user enters a value > 0 and < 100000.
                                       //I also could check divisibility rules to ensure last digit is either 0 or 5. Keeping it simple for now.

        //***************************************************CALC SECTION********************************************************

        empFullName = String.join(", ", empLastName, empFirstName); //I found the join method at https://www.w3schools.com/java/ref_string_join.asp
        //Note: The full name is not truncated if < 15 chars at this point. We save that for formatting in the output section.


        //Note: Code below isn't a terribly efficient way to do this, but I'm trying to keep this simple on purpose... 
        //The calculations below exhaustively go through each of the denominations without calling a method elsewhere 
        //in the program. If this program ever gets refactored, I think it would make sense to make a method that has 
        //a pay amount and denomination recursively called and assigned to an object's instance variables until the last
        //denomination has a bill count satisfied.

        countTenThousandCFA = empPayAmount / TEN_THOUSAND_CFA; //I can't think of a time when 10,000 CFA would ever be something other than 10,000 CFA, so perhaps the constants is obtuse. I'm interested in feedback on that as a style choice.
        tempPayAmount = empPayAmount % TEN_THOUSAND_CFA;

        countFiveThousandCFA = tempPayAmount / FIVE_THOUSAND_CFA;
        tempPayAmount = tempPayAmount % FIVE_THOUSAND_CFA;

        countOneThousandCFA = tempPayAmount / ONE_THOUSAND_CFA;
        tempPayAmount = tempPayAmount % ONE_THOUSAND_CFA;

        countFiveHundredCFA = tempPayAmount / FIVE_HUNDRED_CFA;
        tempPayAmount = tempPayAmount % FIVE_HUNDRED_CFA;

        countOneHundredCFA = tempPayAmount / ONE_HUNDRED_CFA;
        tempPayAmount = tempPayAmount % ONE_HUNDRED_CFA;

        countFiftyCFA = tempPayAmount / FIFTY_CFA;
        tempPayAmount = tempPayAmount % FIFTY_CFA;

        countTwentyFiveCFA = tempPayAmount / TWENTY_FIVE_CFA;
        tempPayAmount = tempPayAmount % TWENTY_FIVE_CFA;

        countTenCFA = tempPayAmount / TEN_CFA;
        tempPayAmount = tempPayAmount % TEN_CFA;

        countFiveCFA = tempPayAmount / FIVE_CFA;
        tempPayAmount = tempPayAmount % FIVE_CFA;


        //***************************************************OUTPUT SECTION******************************************************

        //Make a margin for readability
        System.out.println("\n\n");


        //First line of formatted output: labels
        System.out.printf("%-15s", "Name"); //Left-align with max of 15 chars. 
        System.out.print(" ");
        System.out.printf("%-5s", "Pay"); //Left-align with max of 5 chars.
        System.out.print(" ");
        System.out.printf("%3s", "10k"); //Pivot to right-aligning output.
        System.out.print(" ");
        System.out.printf("%3s", "5k");
        System.out.print(" ");
        System.out.printf("%3s", "1k");
        System.out.print(" ");
        System.out.printf("%3s", "500");
        System.out.print(" ");
        System.out.printf("%3s", "100");
        System.out.print(" ");
        System.out.printf("%3s", "50");
        System.out.print(" ");
        System.out.printf("%3s", "25");
        System.out.print(" ");
        System.out.printf("%3s", "10");
        System.out.print(" ");
        System.out.printf("%3s", "5");
        System.out.print("\n");


        //Second line of output: Separators
        System.out.printf("%-15s", "==============="); //Second line has same spacing as first line and third line.
        System.out.print(" ");
        System.out.printf("%-5s", "=====");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print(" ");
        System.out.printf("%3s", "===");
        System.out.print("\n");
        

        //Third Line of Output: Data
        
        
        //System.out.printf("%-15s", empFullName); <--This was my original instinct for name output, but it did not work as required. 
        //Problem: the value would not be truncated if > 15 chars.
    

        //Here's what I got using Gemini (see accompanying paper in assignment submission):
        truncatedEmpFullName = empFullName.substring(0, Math.min(empFullName.length(), 15));
        
        System.out.printf("%-15s", truncatedEmpFullName); 
        System.out.print(" ");
        System.out.printf("%5d", empPayAmount);
        System.out.print("  ");
        System.out.printf("%-2d", countTenThousandCFA); //Center output for bill/coin counts.
        System.out.print("  ");
        System.out.printf("%-2d", countFiveThousandCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countOneThousandCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countFiveHundredCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countOneHundredCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countFiftyCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countTwentyFiveCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countTenCFA);
        System.out.print("  ");
        System.out.printf("%-2d", countFiveCFA);
        System.out.print("\n");


        //Make a margin for readability
        System.out.println("\n\n");

    }
}


