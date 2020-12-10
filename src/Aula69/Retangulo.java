package Aula69;

public class Retangulo {

	public double width, height;
	
	public double area(){
		return width*height;
	}
	
	public double perimeter(){
		return (width+height)*2.0;
	}
	
	public double diagonal(){
		return Math.hypot(width, height);
	}
}
