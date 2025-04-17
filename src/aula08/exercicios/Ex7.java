package aula08.exercicios;

import java.util.Random;

/*
Leia uma matriz de 5x5 elementos. Calcule a soma dos elementos que estão acima da
diagonal principal.
Calcule a soma dos elementos que estão abaixo da
diagonal principal.
Os números que estão na diagonal
 */
public class Ex7 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[][] matriz = new int[5][5];
		System.out.println("Dados na matriz");
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = aleatorio.nextInt(1,50);
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		int somaAcima = 0;
		int somaAbaixo = 0;
		int somaD = 0;
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				if(l<c)
					somaAcima+=matriz[l][c];
				else if(l>c)
					somaAbaixo+=matriz[l][c];
				else
					somaD+=matriz[l][c];
			}
		}
		System.out.println("As somas");
		System.out.println("Dos números acima da diagonal vale "+somaAcima);
		System.out.println("Dos números abaixo da diagonal vale "+somaAbaixo);
		System.out.println("Dos elementos na diagonal vale "+somaD);
	}
}
