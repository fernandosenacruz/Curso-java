package Aula71;

public class Calculator {

	public static double circunference(double radius){
		return 2.0 * Math.PI* radius;
	}
	
	public static double volume(double radius){
		return 4.0 * Math.PI * Math.pow(radius, 3.0)/3.0;
	}
}
