package aula05.exercicios;

import java.util.Random;

/**
 * Declarar um vetor números com 20 elementos, gerar valores inteiros para ele
 * aleatoriamente. Declare outros dois vetores, par e impar. No vetor par armazenar
 * todos os elementos pares do vetor números. No vetor ímpar armazenar todos os
 * elementos ímpares de números. Imprima os dois vetores.
 */
public class Ex5 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] vetor = new int[20];
		int[] par = new int[20];
		int[] impar = new int[20];
		int cp = 0;
		int ci = 0;
		System.out.println("Dados no vetor");
		for(int i=0;i<vetor.length;i++){
			vetor[i] = aleatorio.nextInt(10,50);
			System.out.print(vetor[i]+" ");
			if(vetor[i]%2==0)
				par[cp++] = vetor[i];
			else
				impar[ci++] = vetor[i];
		}
		System.out.println("\nDos números são pares:");
		for(int i=0;i<cp;i++)
			System.out.print(par[i]+" ");
		System.out.println("\nDos números são ímpares:");
		for(int i=0;i<ci;i++){
			System.out.print(impar[i]+" ");
		}
	}
}
