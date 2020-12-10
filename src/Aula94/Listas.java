package Aula94;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		List <String> list= new ArrayList<>();
		
		list.add("Ximira");
		list.add("Asdrubal");
		list.add("Xablau");
		list.add("Xuniu");
		list.add(2,"Pinto");		
		
		System.out.println(list.size());	// imprime tamanho da lista
		
		for(String x : list){
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		list.remove("Xablau");		
		list.remove(1);
		list.removeIf(x -> x.charAt(0)=='P'); // remove predicado através de uma função Lambda
		
		for(String x : list){
			System.out.println(x);
		}
		
		System.out.println(list.size());
		
		System.out.println("Index of Ximira: "+list.indexOf("Ximira"));
		System.out.println("Index of Pinto: "+list.indexOf("Pinto")); // elemento sem retorno o Index == -1
		System.out.println("-------------------");
		
		List<String> novaLista = list.stream().filter(x -> x.charAt(1)=='i').collect(Collectors.toList());/* criar nova lista, converter para 
		stream, filtrar (elemento que a segunda letra seja 'i', converter para uma coleção*/
		
		for(String x : novaLista){
			System.out.println("O elemento da lista que restou foi: "+x);
		}
		
		System.out.println("-------------------");
		novaLista.add("Sérgio Malandro");
		
		System.out.println(novaLista.size());
		for(String x : novaLista){
			System.out.println(x);
		}
		System.out.println("-------------------");
		
		String name = novaLista.stream().filter(x->x.charAt(0)=='S').findFirst().orElse(null);
		System.out.println("O elemento da lista que restou foi: "+name);
		
	}

}
