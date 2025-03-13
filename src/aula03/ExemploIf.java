package aula03;

import java.util.Scanner;

public class ExemploIf {
	public static void main(String[] args) {
		//Operadores relacionais
		// > maior que
		// < menor que
		// >= maior ou igual a
		// <= menor ou igual a
		// == igual a
		// != diferente
		//----------------------------
		//Operadores lógicos
		// || OU lógico
		// && E lógico
		// ! não

		System.out.print("Entre com um número inteiro: ");
		int numero = new Scanner(System.in).nextInt();

		if(numero==0)
			System.out.println("O valor é zero");
		else if(numero>0)
			System.out.println(numero+" é positivo");
		else
			System.out.println(numero+" é negativo");

		//Verificar se um número está entre 10 e 20
		if(numero>10 && numero<20)
			System.out.println("O valor está entre 10 e 20");
	}
}
