package aula03;

import java.util.Scanner;

public class ExemploIfString {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o nome de usuário: ");
		String usuario = ler.next();
		System.out.print("Qual a senha: ");
		String senha = ler.next();
		//equalsIgnoreCase()
		//String
		//Float => float
		//Double => double
		//Integer => int
		//Ou objetos definidos pelo usuário
		if(usuario.equals("admin") && senha.equals("123456"))
			System.out.println("Bem vindo admin...");
		else
			System.out.println("Usuário ou senha inválidos");
	}
}
