package aula04.exerciciosRepete;

import java.util.Scanner;

/**
 * Escreva um algoritmo para pedir que o usuário digite
 * números positivos, ou seja, ele pode digitar quantos
 * números positivos ele quiser. Para parar de digitar
 * números, ele deve digitar -1. Após o usuário digitar -1,
 * o programa deve escrever na tela quantos números o usuário
 * digitou (a quantidade de números lidos) e a soma total dos
 * números que ele digitou.
 */
public class Ex8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cont = 0;
		int soma = 0;
		int numero = 0;
		while(numero>=0){
			System.out.print("Digite um número positivo e -1 para encerrar: ");
			numero = ler.nextInt();
			if(numero>0){
				cont++;
				soma+=numero;
			}
		}
		System.out.printf("Foram digitados %d números que somados valem %d\n",cont,soma);
	}
}
