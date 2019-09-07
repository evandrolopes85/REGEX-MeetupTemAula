package dev.evandro.meetup;

public class ValidaCelular {

	public static void main(String[] args) {
		String celular = "";
		
		String padrao = "";
		
		boolean found = celular.matches(padrao);
		
		if(found) {
			System.out.println("Celular dentro do padrão!");
		}else {
			System.out.println("Celular fora do padrao, tente novamente!");
		}
	}

}
