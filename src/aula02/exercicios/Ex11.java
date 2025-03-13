package aula02.exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que calcula a área de um triângulo
 */
public class Ex11 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com o valor da base: ");
		float base = ler.nextFloat();
		System.out.print("Entre com o valor da altura: ");
		float altura = ler.nextFloat();

		float area = base*altura/2;

		System.out.printf("O valor da área vale %.2f cm²\n",area);

	}
}
