package Aula64;

import java.util.Scanner;

public class Com_OO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Triangle x,y;
		x=new Triangle();
		y=new Triangle();
		
		System.out.println("Enter the measures of triangle A: ");
		x.a=sc.nextDouble();
		x.b=sc.nextDouble();
		x.c=sc.nextDouble();
		System.out.println("Enter the measures of triangle : ");
		y.a=sc.nextDouble();
		y.b=sc.nextDouble();
		y.c=sc.nextDouble();
		
		
		double areax=x.areaTriangle();
		
		
		double areay=y.areaTriangle();
		
		System.out.printf("Triagle X area: %.4f\n",areax);
		System.out.printf("Triagle Y area: %.4f\n",areay);
		
		if(areax>areay){
			System.out.println("Larger area: Triagle X");
		}else{
			System.out.println("Larger area: Triagle Y");
		}
		
		sc.close();
	}

}
