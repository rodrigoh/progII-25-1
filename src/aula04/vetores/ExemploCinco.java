package aula04.vetores;

import java.util.Random;

public class ExemploCinco {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] numeros = new int[20];
		for(int i=0;i<numeros.length;i++){
			numeros[i] = aleatorio.nextInt(10,50);
		}
		System.out.println("\nFor simplificado");
		for(int i:numeros)
			System.out.print(i+" ");

		System.out.println("\nUsando o for normal");
		for(int i=0;i< numeros.length;i++)
			System.out.print(numeros[i]+" ");

	}
}
