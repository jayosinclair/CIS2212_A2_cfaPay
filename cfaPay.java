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
        String employeeFullName;
        int employeePay;

        final int MAX_EMPLOYEE_NAME_CHARS = 15;
        final int MAX_EMPLOYEE_AMT = 100000;
        final int HIGHEST_DENOMINATION = 10000;
        final int SMALLEST_DENOMINATION = 5;

        Scanner scnr = new Scanner(System.in);

        System.out.print("Employee's first name: ");
        employeeFirstName = scnr.nextLine();

        System.out.print("Employee's last name: ");
        employeeLastName = scnr.nextLine();

        employeeFullName = String.join(", ", employeeLastName, employeeFirstName); //I found the join method at https://www.w3schools.com/java/ref_string_join.asp

        System.out.print(employeeFirstName + "\'s pay in CFA: ");
        employeePay = scnr.nextInt();

        //First line of formatted output: labels
        System.out.printf("%-15s", "Name");
        System.out.print(" ");
        System.out.printf("%-5s", "Pay");
        System.out.print(" ");
        System.out.printf("%3s", "10k");
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
        System.out.printf("%-15s", "===============");
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
        System.out.printf("%.15s", employeeFullName);
        System.out.print(" ");

    }
}


