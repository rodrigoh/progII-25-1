package aula08.exercicios;

import java.util.Random;

/*
Faça um programa para gerar automaticamente números entre 1 e 99 de
uma cartela de bingo. Sabendo que cada cartela deverá conter 5 linhas
de 5 números, gere estes dados de modo a não ter números repetidos
dentro das cartelas. O programa deve exibir na tela a cartela gerada.
 */
public class Ex9 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] cartela = new int[5][5];
		int[] vetor = new int[25];
		int j=0;
		for (int l = 0; l < cartela.length; l++) {
			for (int c = 0; c < cartela[l].length;) {
				int n = aleatorio.nextInt(1, 100);
				//Busca no vetor
				boolean novoNumero = true;
				for (int t = 0; t < j; t++) {
					if (vetor[t] == n)
						novoNumero = false;
				}
				if (novoNumero) {
					cartela[l][c] = n;
					vetor[j] = n;
					j++;
					c++;
				}
			}
		}
		System.out.println("Cartela de bingo\n");
		for (int l = 0; l < cartela.length; l++) {
			for (int c = 0; c < cartela[l].length; c++) {
				System.out.printf("%02d ",cartela[l][c]);
			}
			System.out.println();
		}
	}
}
