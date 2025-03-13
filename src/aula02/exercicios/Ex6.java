package aula02.exercicios;

import java.util.Scanner;

/**
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas
 * trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 */
public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com o valor da hora R$");
		float valorHora = ler.nextFloat();
		System.out.print("Entre com a quantidade de horas: ");
		float quantHoras = ler.nextFloat();
		float salario = valorHora*quantHoras;

		//System.out.println("Seu salário é de R$"+salario);
		System.out.printf("Seu salário é de R$%.2f\n",salario);
	}
}
