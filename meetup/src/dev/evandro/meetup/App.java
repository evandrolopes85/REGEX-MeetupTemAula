package dev.evandro.meetup;

public class App {

	public static void main(String[] args) {
		String email =" evandro.lopes85_@yahoo.com.br";
		
		String padrao = "[a-z]+([a-z]|[0-9]|[\\Q.-_\\E])*@[a-z]+([a-z]|\\.)*[a-z]{2,3}$";
		
		System.out.println(email.matches(padrao));
	}
}
