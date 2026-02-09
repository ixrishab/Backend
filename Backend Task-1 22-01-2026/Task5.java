public class Task5 {

	static class Employee {
		private int id;
		private String name;
		private double monthlySalary;
		public static String companyName = "TechCorp";

		public Employee(int id, String name, double monthlySalary) {
			this.id = id;
			this.name = name;
			this.monthlySalary = monthlySalary;
		}

		public int getId() { return id; }
		public void setId(int id) { this.id = id; }

		public String getName() { return name; }
		public void setName(String name) { this.name = name; }

		public double getMonthlySalary() { return monthlySalary; }
		public void setMonthlySalary(double monthlySalary) { this.monthlySalary = monthlySalary; }

		public double calculateAnnualSalary() {
			return this.monthlySalary * 12;
		}

		public void displayEmployeeDetails() {
			System.out.println("Company: " + companyName + ", ID: " + id + ", Name: " + name +
					", Monthly Salary: " + monthlySalary + ", Annual Salary: " + calculateAnnualSalary());
		}
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Alice", 5000);
		Employee e2 = new Employee(2, "Bob", 4200);

		// show that companyName is shared (static)
		Employee.companyName = "Acme Corp";

		e1.displayEmployeeDetails();
		e2.displayEmployeeDetails();
	}
}
