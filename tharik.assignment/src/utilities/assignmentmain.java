package utilities;

public class assignmentmain {
	    public static void main(String[] args) {
	        // Creating instances of Manager and Developer
	        com.yourname.assignment.employees.Manager manager = new com.yourname.assignment.employees.Manager(
	                "John Doe", "M001", 75000.0, "Sales");
	        com.yourname.assignment.employees.Developer developer = new com.yourname.assignment.employees.Developer(
	                "Jane Smith", "D001", 70000.0, "Java");

	        // Using EmployeeUtilities to perform operations
	        com.yourname.assignment.utilities.EmployeeUtilities.printEmployeeDetails(manager);
	        com.yourname.assignment.utilities.EmployeeUtilities.printEmployeeDetails(developer);
	    }
	}