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

public class CFA_Pay {
        
    public static void main(String[] args) {

        int tempAmount = -1;
        
        Employee person = new Employee();
        
        
        //***************************************************INPUT SECTION*******************************************************
        
        System.out.println("\n\n"); //Make a margin for readability

        person.setEmployeeFirstName(); //Populate the person object of type Employee with employee name and pay info.
        person.setEmployeeLastName();
        person.setEmployeeFullName();
        person.setEmployeePayAmount();


        //***************************************************CALC SECTION********************************************************

        tempAmount = person.getEmployeePayAmount();
        BillCounter bills = new BillCounter(tempAmount);
        bills.setNum10KBills();
        System.out.print(bills.getNum10KBills());


        //***************************************************OUTPUT SECTION******************************************************

        //Make a margin for readability
        System.out.println("\n\n");

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
        System.out.printf("%.15s", person.getEmployeeFullName());
        System.out.print(" "); //FIXME: Need to figure out how to make spaces for all the positions that aren't present if < 15 chars
        System.out.printf("%5d", person.getEmployeePayAmount());
       
       /* 
        System.out.print(" ");
        System.out.printf("%3d", num10K);
        System.out.print(" ");
        System.out.printf("%3d", num5K);
        System.out.print(" ");
        System.out.printf("%3d", num1K);
        System.out.print(" ");
        System.out.printf("%3d", num500);
        System.out.print(" ");
        System.out.printf("%3d", num100);
        System.out.print(" ");
        System.out.printf("%3d", num50);
        System.out.print(" ");
        System.out.printf("%3d", num25);
        System.out.print(" ");
        System.out.printf("%3d", num10);
        System.out.print(" ");
        System.out.printf("%3d", num5);
        System.out.print("\n");

        */

        //Make a margin for readability
        System.out.println("\n\n");

    }
}


