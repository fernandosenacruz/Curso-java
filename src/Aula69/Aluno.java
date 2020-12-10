package Aula69;

public class Aluno {

	public String nome;
	public double nota1, nota2, nota3;
	
	public double mediaFinal(){
		return nota1+nota2+nota3;
	}
	
	public double pass(){
		if(mediaFinal()>=60){
			return 0.0;
		}else{
			return 60.0 - mediaFinal();
		}
	}
}
