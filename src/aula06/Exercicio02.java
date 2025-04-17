package aula06;

import java.util.Random;
/*
2 - Carregar uma matriz SOMA 4x4, calcular e escrever as
seguintes somas:
a) da linha de índice 3
b) da coluna de índice 2
c) de todos os elementos da matriz
*/
public class Exercicio02 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[4][4];
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1, 100);
				System.out.printf("%02d ", matriz[l][c]);
			}
			System.out.println();
		}
		int somaLinha = 0;
		int somaColuna = 0;
		int somaTotal = 0;
		int somaD = 0;
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if(l==c)
					//somaD = somaD+matriz[l][c];
					somaD+=matriz[l][c];
				if(l==3)
					somaLinha+=matriz[l][c];
				if(c==2)
					somaColuna+=matriz[l][c];
				somaTotal+=matriz[l][c];
			}
		}
		float media = somaD/(float)matriz.length;
		System.out.println("A média dos elementos na diagonal vale "+media);
		System.out.println("A soma dos elementos na linha de índice 3 vale: "+somaLinha);
		System.out.println("A soma dos elementos na coluna de índice 2 vale: "+somaColuna);
		System.out.println("A soma de todos os elementos da matriz vale: "+somaTotal);
	}

}
