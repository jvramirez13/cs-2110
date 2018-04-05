package lab62017;

public class Employee extends Person {
	
	private int employeeId;
	private String workAddress;
	
	public Employee(String n, String ha, String wa, int id) {
		super(n, ha);
		this.employeeId = id;
		this.workAddress = wa;
	}
	
	@Override
	public String getMailingAddress() {
		return workAddress;
	}

	public String toString() {
		return "{Empl: n=" + name + ", ha=" + homeAddress + 
		", wa=" + workAddress + ", id=" + employeeId + "}";
	}

	public static void main(String[] args) {
		// for testing code

	}
}
