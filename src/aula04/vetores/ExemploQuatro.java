package aula04.vetores;

import java.util.Random;

public class ExemploQuatro {
	public static void main(String[] args) {
		Random aleatorio = new Random();

		System.out.println("Gerando um número inteiro aleatório: ");
		int numero = aleatorio.nextInt();
		System.out.println(numero);
		numero = aleatorio.nextInt(100);
		System.out.println(numero);
		numero = aleatorio.nextInt(1,100);
		System.out.println(numero);

		System.out.println("Agora vale "+aleatorio.nextBoolean());

		numero = aleatorio.nextInt(65,97);
		char letra = (char) numero;
		System.out.println(letra);


	}
}
