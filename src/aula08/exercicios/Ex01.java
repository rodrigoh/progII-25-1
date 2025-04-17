package aula08.exercicios;

import java.util.Scanner;

/**
 * Ler 6 números inteiros para preencher uma matriz D 2x3, ou seja,
 * com 2 linhas e 3 colunas (considere que não serão informados
 * valores duplicados). A seguir, ler um número inteiro X e escrever
 * uma mensagem indicando se o valor de X existe ou não na matriz D.
 */
public class Ex01 {
	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		Scanner ler = new Scanner(System.in);
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				System.out.printf("matriz[%d][%d]: ",l,c);
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.print("Entre com um número para pesquisar: ");
		int numero = ler.nextInt();
		boolean achei = false;
		for (int l = 0; l < matriz.length && !achei; l++) {
			for (int c = 0; c < matriz[l].length && !achei; c++) {
				if(matriz[l][c]==numero)
					achei = true;
			}
		}
		if(achei)
			System.out.println("O número "+numero+" existe na matriz");
		else
			System.out.println("O número "+numero+" não existe na matriz");
	}
}
