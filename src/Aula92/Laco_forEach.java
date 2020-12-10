package Aula92;

public class Laco_forEach {

	public static void main(String[] args) {
		String[] nomes = new String[]{"Ximira","Asdrubal","Damaceno"};
		
		// com laço for
		for(int i=0;i<nomes.length;i++){
			System.out.println(nomes[i]);
		}
		
		System.out.println();
		
		// com laço for each
		for(String lista: nomes){
			System.out.println(lista);
		}
	}

}
