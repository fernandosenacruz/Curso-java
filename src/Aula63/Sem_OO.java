package Aula63;

import java.util.Scanner;

public class Sem_OO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double xa,xb,xc,ya,yb,yc;
		System.out.println("Enter the measures of triangle A: ");
		xa=sc.nextDouble();
		xb=sc.nextDouble();
		xc=sc.nextDouble();
		System.out.println("Enter the measures of triangle : ");
		ya=sc.nextDouble();
		yb=sc.nextDouble();
		yc=sc.nextDouble();
		
		double p=(xa+xb+xc)/2.0;
		double areax=Math.sqrt(p*(p-xa)*(p-xb)*(p-xc));
		
		p=(ya+yb+yc)/2.0;
		double areay=Math.sqrt(p*(p-ya)*(p-yb)*(p-yc));
		
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
