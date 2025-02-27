package aula02.exercicios;

import java.util.Scanner;

/**
 * Escreva uma classe Java que converta metros para centímetros.
 */
public class Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com uma medida em metros: ");
		float metros = ler.nextFloat();

		float cm = metros * 100;

		System.out.printf("%.2f metros equivale(m) a %.2f cm\n",metros,cm);
	}
}
