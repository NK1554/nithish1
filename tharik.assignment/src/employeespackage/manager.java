package employeespackage;

public class manager {
	    private String department;

	    public Manager(String name, String employeeId, double salary, String department) {
	        super(name, employeeId, salary);
	        this.department = department;
	    }

	    // Getter and Setter methods for department
	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }
	}