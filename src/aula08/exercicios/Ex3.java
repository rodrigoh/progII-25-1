package aula08.exercicios;

import java.util.Random;

/**
 * Ler uma matriz G 3x3 e criar 2 vetores, SL e SC, de 3
 * elementos cada, contendo respectivamente as somas das
 * linhas e das colunas de G. Escrever os vetores criados.
 */
public class Ex3 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[3][3];
		int[] sl = new int[3];
		int[] sc = new int[3];
		System.out.println("Gerando dados para matriz");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1,20);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				sl[l]+=matriz[l][c];
				sc[l]+=matriz[c][l];
			}
		}
		System.out.println("A soma dos elementos em cada linha matriz vale");
		for(int i:sl)
			System.out.print(i+" ");
		System.out.println("\nA soma dos elementos em cada coluna matriz vale");
		for(int i:sc)
			System.out.print(i+" ");

	}
}
