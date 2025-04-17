package aula08.exercicios;

import java.util.Random;

/**
 * Carregar uma matriz SOMA 4x4, calcular e escrever as seguintes
 * somas:
 * a) da linha de índice 3
 * b) da coluna de índice 2
 * c) de todos os elementos da matriz
 */
public class Ex02 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[4][4];
		int sLinha = 0;
		int sColuna = 0;
		int somaT = 0;
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
				if(l==3)
					sLinha+=matriz[l][c];
				if(c==2)
					sColuna+=matriz[l][c];
				somaT+=matriz[l][c];
			}
			System.out.println();
		}
		System.out.println("As somas");
		System.out.println("Da linha 3 vale "+sLinha);
		System.out.println("Da coluna 2 vale "+sColuna);
		System.out.println("De todos os elementos "+somaT);
	}
}
