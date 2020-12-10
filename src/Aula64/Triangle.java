package Aula64;

public class Triangle {
	public double a,b,c;
	
	public double areaTriangle(){
		double p=(a+b+c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}