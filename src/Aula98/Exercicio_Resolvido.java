package Aula98;

import java.util.Scanner;

public class Exercicio_Resolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How length of matrix? ");
		
		int n=sc.nextInt();
		int[][] matrix = new int [n][n];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.print("Main diagonal = ");
		for(int i=0; i<matrix.length; i++){
			System.out.print(matrix[i][i]+" ");
		}
		
		System.out.println();
		
		int count = 0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(matrix[i][j]<0){
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = "+count);
		
		sc.close();
	}

}
