package Aula69;

public class Funcionario {

	public String name;
	public double grossSalary, tax;
	
	public double netSalary(){
		return grossSalary-tax;
	}
	
	public double increaseSalary(double percentual){
		return grossSalary+=(grossSalary*percentual)/100.0;
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
		}
}
