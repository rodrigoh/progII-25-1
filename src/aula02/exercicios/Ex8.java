package aula02.exercicios;

import java.util.Scanner;

/**
 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre
 * a temperatura em graus Celsius. C = (5 * (F-32) / 9)
 */
public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um temperatura em ºF: ");
		float tempF = ler.nextFloat();
		float tempC = (5 * (tempF-32) / 9);
		System.out.printf("%.2f°F equivale(m) a %.2f °C\n",tempF,tempC);
	}
}
