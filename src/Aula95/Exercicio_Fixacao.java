package Aula95;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Fixacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionarios>list = new ArrayList<>();
		
		System.out.print("How many Employees will be registered? ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.println();
			System.out.println("Employee #"+i+": ");
			
			System.out.print("Id: ");
			int id=sc.nextInt();
			while(hasId(list,id)){
				System.out.print("Id already taken. Try again: ");
				id=sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.print("Salary: ");
			double salary=sc.nextDouble();
			list.add(new Funcionarios(id,name,salary));
			System.out.println(list);
		}
		
		System.out.println();
		System.out.print("Enter the Employee id that will have salary increase: ");
		int id=sc.nextInt();
		Funcionarios func = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		if(func==null){
			System.out.println("This id not exist!");
		}else{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of Employee:");
		for(Funcionarios updated: list){
			System.out.println(updated);
		}
		
		
		sc.close();
	}

	private static boolean hasId(List<Funcionarios> list, int id) {
		Funcionarios func = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		return func !=null;
	}

}
