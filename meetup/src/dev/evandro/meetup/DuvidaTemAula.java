package dev.evandro.meetup;

public class DuvidaTemAula {
	static double numero;
	
	public static void main(String[] args) {
		String entrada = "525.67";
		
		String padrao = "\\d+|(\\d+\\.\\d+)";//[0-9]
		String padrao2 = "[0-9]+|([0-9]+\\.[0-9]+)";
		
		if(entrada.matches(padrao2)) {
			numero = Double.parseDouble(entrada);
		}else {
			numero = 0.0;
		}
		
		System.out.println(numero);
	}

}
