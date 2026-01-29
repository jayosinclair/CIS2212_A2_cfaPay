//Author: Jay Olson
//Section: CIS 2212-801
//Assignment: Project 2 CFA Pay
//Due Date: February 11, 2026
//Submitted: 

/*The purpose of this program is to practice input, variable declarations, assignment statements, calculations, String and Math class
methods, and formatted output.

This program collects information using a Scanner object, breaks down employee 
pay into certain money denominations, and outputs results into a formatted report.*/

//Github repo for this project is at: https://github.com/jayosinclair/CIS2212_A2_cfaPay.git
//**********************************************************************************************************************

import java.util.Scanner;

public class cfaPay {
    public static void main(String[] args) {
        
        String employeeFirstName;
        String employeeLastName;
        int employeePay;

        final int MAX_EMPLOYEE_NAME_CHARS = 15;
        final int MAX_EMPLOYEE_AMT = 100000;
        final int HIGHEST_DENOMINATION = 10000;
        final int SMALLEST_DENOMINATION = 5;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter employee's first name (< 15 chars): ");
        employeeFirstName = scnr.nextLine();
        //employeeFirstName = employeeFirstName.substring(0,14);
        //FIXME: Need to make upper bound be string length if string length is < 16 without using an if statement.

        System.out.print("Enter employee's last name (< 15 chars): ");
        employeeLastName = scnr.nextLine();
        //employeeLastName = employeeLastName.substring(0,14);

        System.out.println("\n\nFirst Name: " + employeeFirstName);
        System.out.println("Last Name: " + employeeLastName);




    }
}


