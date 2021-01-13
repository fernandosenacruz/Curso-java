package Aula130;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) throws ParseException {
		/*
		 * Fazer um programa para ler os dados de N produtos (N fornecido pelo
		 * usuário). Ao final, mostrar a etiqueta de preço de cada produto na
		 * mesma ordem em que foram digitados. Todo produto possui nome e preço.
		 * Produtos importados possuem uma taxa de alfândega, e produtos usados
		 * possuem data de fabricação. Estes dados específicos devem ser
		 * acrescentados na etiqueta de preço conforme exemplo (próxima página).
		 * Para produtos importados, a taxa e alfândega deve ser acrescentada ao
		 * preço final do produto.
		 */

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.println("Product #"+i+" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(ch == 'u'){
				System.out.print("Manufacture date: (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			}else if(ch == 'i'){
				System.out.print("Customs fee: ");
				double cf = sc.nextDouble();
				list.add(new ImportedProduct(name, price, cf));				
			}else if(ch == 'c'){
				list.add(new Product(name, price));
			}
			
			System.out.println();
			System.out.println("PRICE TAGS: ");
			for(Product prd : list){
				System.out.println(prd.priceTag());
			}
		}
		
		sc.close();
	}

}
