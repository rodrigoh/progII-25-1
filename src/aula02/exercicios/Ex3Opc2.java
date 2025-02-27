package aula02.exercicios;

import java.util.Scanner;

/**
 * Faça uma classe Java que peça as 4 notas bimestrais e mostre a média
 */
public class Ex3Opc2 {
	public static void main(String[] args) {

		float soma = 0;
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a primeira nota: ");
		soma+= ler.nextFloat();
		System.out.print("Digite a segunda nota: ");
		soma+= ler.nextFloat();
		System.out.print("Digite a terceira nota: ");
		soma+= ler.nextFloat();
		System.out.print("Digite a quarta nota: ");
		soma+= ler.nextFloat();

		float media = soma/4;

		System.out.printf("Sua média é %.2f\n",media);
	}
}
