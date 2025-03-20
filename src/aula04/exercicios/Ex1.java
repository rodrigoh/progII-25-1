package aula04.exercicios;

import java.util.Scanner;
/*
Crie um programa em que o usuário informa o nome de um mês
(ex: janeiro) e o programa exibe o número correspondente a
esse mesmo mês (ex: 1);
 */
public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre com um mês: ");
		String mes = ler.next().toLowerCase();
		switch (mes){
			case "janeiro"-> System.out.println(mes+" equivale ao número 1");
			case "fevereiro"-> System.out.println(mes+" equivale ao número 2");
			case "março"-> System.out.println(mes+" equivale ao número 3");
			case "abril"-> System.out.println(mes+" equivale ao número 4");
			case "maio"-> System.out.println(mes+" equivale ao número 5");
			case "junho"-> System.out.println(mes+" equivale ao número 6");
			case "julho"-> System.out.println(mes+" equivale ao número 7");
			case "agosto"-> System.out.println(mes+" equivale ao número 8");
			case "setembro"-> System.out.println(mes+" equivale ao número 9");
			case "outubro"-> System.out.println(mes+" equivale ao número 10");
			case "novembro"-> System.out.println(mes+" equivale ao número 11");
			case "dezembro"-> System.out.println(mes+" equivale ao número 12");
			default -> System.out.println("Não entendi?!");
		}
	}
}
