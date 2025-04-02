package aula06;

import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		//Declarando uma matriz
		int[][] matriz = new int[2][3];
		//Declarando e inicializando uma matriz
		int[][] matrizB = {{1,2,3}, {4,5,6}, {7,8,9}};
		//Lendo uma matriz do teclado
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print("Informe um valor para matriz["+l+"]["+c+"]: ");
				matriz[l][c] = ler.nextInt();
			}
		}
		System.out.println("Quantidade de linhas na matriz: "+matriz.length);
		System.out.println("Quantidade de colunas na matriz: "+matriz[0].length);
		//Mostrar a matriz na tela
		for(int l=0;l<matriz.length;l++){
			for(int c=0;c<matriz[l].length;c++){
				System.out.printf("%02d ",matriz[l][c]);
			}
			System.out.println();
		}
		System.out.println("\nImprimindo uma matriz com o for simplificado...");
		//Usando o para cada
		for(int[] linha: matrizB){
			for(int i:linha){
				System.out.printf("%02d ",i);
			}
			System.out.println();
		}
		System.out.println("Imprimindo a diagonal da matriz B que é quadrada");
		for(int l=0;l<matrizB.length;l++){
			for(int c=0;c<matrizB[l].length;c++){
				if(l==c){
					System.out.print(matrizB[l][c]+" ");
				}
			}
		}
		System.out.println("\nOutra opção para imprimir a diagonal da matriz");
		for(int i=0;i<matriz.length;i++){
			System.out.print(matrizB[i][i]+" ");
		}
		System.out.println("\nImprimindo a diagonal secundária da matriz B que é quadrada");
		for(int l=0;l<matrizB.length;l++){
			for(int c=0;c<matrizB[l].length;c++){
				if(l+c==matrizB.length-1){
					System.out.print(matrizB[l][c]+" ");
				}
			}
		}
	}
}
