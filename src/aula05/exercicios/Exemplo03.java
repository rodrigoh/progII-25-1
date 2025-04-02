package aula05.exercicios;

public class Exemplo03 {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		//Descobrindo o tamanho da matriz
		System.out.println("Quantidade de linhas: "+matriz.length);
		System.out.println("Quantidade de colunas: "+matriz[0].length);
		//For 'simplificado'
		for(int[] linha:matriz){
			for(int i:linha){
				System.out.printf("%02d ",i);
			}
			System.out.println();
		}
	}
}
