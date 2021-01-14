package Aula133;

public class Individual extends Taxpayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double tax = (getAnualIncome() < 2000.0) ? getAnualIncome() * 0.15 - getHealthExpenditures() / 2.0
				: getAnualIncome() * 0.25 - getHealthExpenditures() / 2.0;
		return tax;
	}
}
