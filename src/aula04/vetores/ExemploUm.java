package aula04.vetores;

import java.util.Scanner;

public class ExemploUm {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] vetor = new int[10];
		for(int i=0;i<10;i++){
			System.out.print("Informe um valor para vetor["+i+"]: ");
			vetor[i] = ler.nextInt();
		}
		System.out.println("\nDados no vetor...");
		int i=0;
		while(i<10){
			System.out.print(vetor[i]+" ");
			i++;
		}
	}
}
