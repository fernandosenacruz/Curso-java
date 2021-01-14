package Aula133;

public class Company extends Taxpayer {

	private Integer numberOfEmployee;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployee) {
		super(name, anualIncome);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	public double tax() {
		double tax = (getNumberOfEmployee()>=10 ? getAnualIncome() * 0.14 : getAnualIncome() * 0.16);
		return tax;
	}
}
