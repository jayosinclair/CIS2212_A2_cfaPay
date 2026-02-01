import java.util.Scanner;


public class Employee {
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeFullName;
    private int employeePayAmount;
    Scanner scan = new Scanner(System.in);

    public Employee(){

        //Constructor for employeeBills objects has default values set to values that should not be seen in user-entered input.

        employeeFirstName = "";
        employeeLastName = "";
        employeeFullName = "";
        employeePayAmount = -1;
        

    }
    
    public void setEmployeeFirstName(){

        System.out.print("Employee's first name: ");
        employeeFirstName = scan.next();

    }

    public String getEmployeeFirstName(){
        
        return employeeFirstName;

    }

    public void setEmployeeLastName(){
       
        System.out.print("Employee's last name: ");
        employeeLastName = scan.next();
    }

    public String getEmployeeLastName(){

        return employeeLastName;

    }

    public void setEmployeeFullName(){

        employeeFullName = String.join(", ", employeeLastName, employeeFirstName); //I found the join method at https://www.w3schools.com/java/ref_string_join.asp

    }

    public String getEmployeeFullName(){

        return employeeFullName;

    }

    public void setEmployeePayAmount(){

        System.out.print("Pay in CFA: ");
        employeePayAmount = scan.nextInt();

    }


    public int getEmployeePayAmount(){
       
        return employeePayAmount;

    }


    public void printEmployeeFullName(){

        System.out.print(employeeFullName);

    }

    public void printFormattedEmployeeFullName(){

        //This method is the same as printEmployeeFullName, but it constrains output to 15 chracters.

        System.out.printf("%-15s", employeeFullName);

    }


}