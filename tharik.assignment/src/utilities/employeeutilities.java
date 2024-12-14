package utilities;

public class employeeutilities {
	    /**
	     * Prints the details of an employee.
	     * @param employee The employee whose details are to be printed.
	     */
	    public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }

	    // Additional utility methods can be added here
	}