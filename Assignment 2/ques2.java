package Assignment2;

public interface TaxCalculator {
public abstract void execute();
}
public class Humanity implements TaxCalculator {
	private int basic_salary;
	public void Order(int basic_salary) {
		this.basic_salary = basic_salary;
	}
	@Override
	public void execute() {
		int HRA = (10/100)*basic_salary;
	}
}
public class Logistic implements TaxCalculator {
	private int basic_salary;
	public void Order(int basic_salary) {
		this.basic_salary = basic_salary;
	}
	@Override
	public void execute() {
		int HRA = (10/100)*basic_salary;
	}
}
public class Department {
	public static void main(String[] args) {
		basic_salary basic_salary = new basic_salary();
		Department humanity = new Department(basic_salary);
		Logistic logistic = new Logistic(basic_salary);
		Department.execute();
		humanity = new Humanity(basic_salary);
		logistic = new Logistic(basic_salary);
		Logistic.execute();
	}
}
