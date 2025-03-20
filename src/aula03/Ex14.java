package aula03;

import java.util.Scanner;

/**
 * A jornada de trabalho semanal de um funcionário é de 40 horas.
 * O funcionário que trabalhar mais de 40 horas receberá hora extra,
 * cujo cálculo é o valor da hora regular com um acréscimo de 50%.
 * Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
 * o salário por hora e escreva o salário total do funcionário,
 * que deverá ser acrescido das horas extras, caso tenham sido trabalhadas
 * (considere que o mês possua 4 semanas exatas).
 */
public class Ex14 {
	public static void main(String[] args) {
		System.out.print("Quantas horas trabalhou no mês: ");
		int horas = new Scanner(System.in).nextInt();
		System.out.print("Qual o valor da hora R$");
		float valorHora = new Scanner(System.in).nextFloat();
		float salario = 160 * valorHora + (horas-160) *valorHora * (float) 1.5;
		System.out.printf("Seu salário é de R$%.2f\n",salario);
	}
}
