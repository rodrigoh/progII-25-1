package aula03;

import java.util.Scanner;

public class ExemploSwitchCase {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um número de 1 a 7: ");
		int dia = ler.nextInt();
		switch (dia){
			case 1:
				System.out.println("É domingo");
				System.out.println("É fim de semana");
				break;
			case 2:
				System.out.println("É segunda feira");
				break;
			case 3:
				System.out.println("É terça feira");
				break;
				//...
			default:
				System.out.println("O número "+dia+" não corresponde a nenhum dia da semana");
		}

		switch (dia){
			case 1->{
				System.out.println("É domingo");
				System.out.println("É fim de semana");
			}
			case 2-> System.out.println("É segunda feira");
			case 3-> System.out.println("É terça feira");
			//...
			default-> System.out.println("O número "+dia+" não corresponde a nenhum dia da semana");
		}

		if(dia == 1)
			System.out.println("É domingo");
		else if(dia ==2)
			System.out.println("É segunda");
		else if(dia==3)
			System.out.println("É terça");
		else
			System.out.println("O número "+dia+" não corresponde a nenhum dia da semana");

	}
}
