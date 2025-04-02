package aula05.exercicios;

import java.util.Scanner;

/**
 * Ler um vetor de números, de 10 elementos.
 * Declarar outro vetor inverso, copiar todos os
 * elementos de números de trás para frente para o
 * vetor inverso.
 */
public class Ex3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		int[] inverso = new int[10];
		for(int i=0, j=9;i < vetor.length;i++, j--){
			System.out.print("vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
			inverso[j] = vetor[i];
		}
		System.out.println("Dados no vetor...");
		for(int i:vetor)
			System.out.print(i+" ");

		System.out.println("\nDados no inverso...");
		for(int i:inverso)
			System.out.print(i+" ");
	}
}
