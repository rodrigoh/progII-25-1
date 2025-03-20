package aula04.vetores;

import java.util.Scanner;

public class ExemploSeis {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[100];
		char letra;
		int numero;
		int i=0;
		do{
			System.out.print("vetor["+i+"]: ");
			numero = ler.nextInt();
			vetor[i] = numero;
			System.out.print("Tem mais números s - sim / n - não: ");
			letra = ler.next().toLowerCase().charAt(0);
			i++;
		}
		while (letra=='s');

		System.out.println("Dados no vetor");
		for(int j=0; j<i; j++){
			System.out.print(vetor[j]+" ");
		}
	}
}
