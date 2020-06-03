package dev.evandro.meetup;

public class Celular {

	public static void main(String[] args) {
		//Valida Celular
		String celular = "(11)91234-5678";
		
		String padrao = "\\(\\d{2}\\)9\\d{4}\\-\\d{4}";
		
		System.out.println(celular.matches(padrao));
	}

}
