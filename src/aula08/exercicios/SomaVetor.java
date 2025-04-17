package aula08.exercicios;

import java.util.Random;

public class SomaVetor {

	public static int somaVetor(int[] vetor){
		int soma = 0;
		for(int i=0;i< vetor.length;i++)
			soma+=vetor[i];
		return soma;
	}

	public static int[] geraVetor(int capacidade){
		int[] v = new int[capacidade];
		Random aleatorio = new Random();
		for(int i=0;i<v.length;i++)
			v[i] = aleatorio.nextInt(1,capacidade*4);
		return v;
	}

	public static void main(String[] args) {
		int[] vetor = geraVetor(10);
		for(int i:vetor)
			System.out.print(i+" ");
		int soma = somaVetor(vetor);
		System.out.println("\nA soma dos números vale "+soma);
	}
}
