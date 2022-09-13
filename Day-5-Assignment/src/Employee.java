
public class Employee {
	int empId;
	double empBasicSalary, empGrossSalary;
	String empName, empDep;

	public Employee() {

	}

	public Employee(int empId, String empName, String empDep, double empBasicSalary) {
		this.empBasicSalary = empBasicSalary;
		this.empGrossSalary = empBasicSalary * 1.2;
		this.empId = empId;
		this.empName = empName;
		this.empDep = empDep;
	}

	public int getEmpId() {
		return empId;
	}

	public double getEmpGrossSalary() {
		return empGrossSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDep() {
		return empDep;
	}

	public double getEmpBasicSalary() {
		return empBasicSalary;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if (this.empId == e.empId && this.empName == e.empName)
			return true;
		return false;
	}

	public void displayEmployee(Employee e[], String s) {

		for (int i = 0; i < 5; i++) {
			if (e[i].getEmpDep() == s) {
				System.out.println("People with same department are " + e[i].getEmpName());
			}
		}
	}

	public void sortEmployee(Employee e[]) {
		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i].getEmpBasicSalary() > e[j].getEmpBasicSalary()) {
					Employee temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			}
		}
		for (Employee i1 : e) {

			System.out.println(i1.getEmpName() + " having id " + i1.getEmpId() + " is a part of team " + i1.getEmpDep()
					+ " and is getting " + i1.getEmpBasicSalary() + " as salary");

		}

	}
}
