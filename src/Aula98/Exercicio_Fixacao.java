package Aula98;

import java.util.Scanner;

public class Exercicio_Fixacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many lines of the Matrix? ");
		int m = sc.nextInt();
		System.out.print("How many columns of the Matrix? ");
		int n= sc.nextInt();
		
		int [][] matrix = new int [m][n];
		
		System.out.println("Enter the numbers of the matrix");
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Enter the number to check the occurrences");
		int x = sc.nextInt();
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]==x){
					System.out.println("Position: "+i+","+j);
					if(j>0){
						System.out.println("Left: "+matrix[i][j-1]);
					}
					if(i>0){
						System.out.println("Up: "+matrix[i-1][j]);
					}
					if(j<matrix[i].length-1){
						System.out.println("Right: "+matrix[i][j+1]);
					}if(i<matrix.length-1){
						System.out.println("Down: "+matrix[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
}