package aula02.exercicios;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		System.out.print("Qual sua altura em metros: ");
		float altura = new Scanner(System.in).nextFloat();
		System.out.print("Qual seu peso em kg: ");
		float peso = new Scanner(System.in).nextFloat();
		float imc = peso/(altura*altura);
		System.out.printf("Seu IMC é de %.3f\n",imc);
	}
}
