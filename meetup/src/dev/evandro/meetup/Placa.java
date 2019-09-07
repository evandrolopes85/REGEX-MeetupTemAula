package dev.evandro.meetup;

public class Placa {

	public static void main(String[] args) {
		//Valida Placa
		
		String placa = "AZB-5672";
		// [A-Z] Classe de caractere (Intervalo). Procura caracteres de A até Z maiusculos
		// {3}   Quantificador. Procura exatamente em 3 caracteres usando a expressão anterior a ele.
		// \\-   Procura um caracter traço(-)
		// \\d   Classe de Caracteres Predefinidos. O mesmo que [0-9]
		// {4}   Quantificador. Procura exatamente em 4 caracteres usando a expressão anterior a ele.
		String padrao = "[A-Z]{3}\\-\\d{4}";
		
		System.out.println(placa.matches(padrao));
	}

}
