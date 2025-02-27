package aula02.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
 */
public class Ex3 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		float n1 = ler.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = ler.nextFloat();
		System.out.print("Digite a terceira nota: ");
		float n3 = ler.nextFloat();
		System.out.print("Digite a quarta nota: ");
		float n4 = ler.nextFloat();

		float media = (n1+n2+n3+n4)/4;

		System.out.printf("Sua média é %.2f\n",media);
	}
}
