package Aula90;

public class Aluguel_Quartos {

	private String name, email;
	
	public Aluguel_Quartos(String name, String email) {
		this.name = name;
		this.email = email;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

		
	
	public String toString(){
		return name+", "+email;
	}
}
