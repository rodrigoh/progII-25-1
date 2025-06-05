package aula07;

import java.util.Random;

public class Tarefa {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		//ALTERAR O TAMANHO DO VETOR A CADA TESTE
		int tamanho = 10;
		int[] vi = new int[tamanho];
		int[] vs = new int[tamanho];
		System.out.print("\nGerando " + tamanho + " números...");
		//Gerando um vetor aleatório
		for (int i = 0; i < tamanho; i++) {
			//GERAR NÚMEROS ALEATÓRIOS PARA OS VETORES, AMBOS DEVEM TER OS MESMOS NÚMEROS
		}
		System.out.println("[OK]");
		//Mostrando o v gerado
		//(usar com vetores pequenos, a etapa de impressão de dados é demorada)
		if (tamanho < 100) {
			System.out.println("\nMostrando o vetor");
			for (int i : vi)
				System.out.print(i + " ");
		}
		System.out.print("\nOrdenando o vetor com o InsertionSort...");
		long tempoInicial = System.currentTimeMillis();

		//IMPLEMENTAR AQUI O INSERTION SORT

		long tempoFinal = System.currentTimeMillis();
		System.out.println("[OK]");

		long tempoInsertionSort = tempoFinal - tempoInicial;
		//Mostrando o vetor
		if (tamanho < 100) {
			System.out.println("\nOrdenado com Insertion");
			for (int i : vi)
				System.out.print(i + " ");
		}
		System.out.print("\nReordenando o vetor com o InsertionSort...");
		tempoInicial = System.currentTimeMillis();

		//IMPLEMENTAR AQUI O INSERTION SORT

		tempoFinal = System.currentTimeMillis();
		System.out.println("[OK]");
		long tempoReordInsertionSort = tempoFinal - tempoInicial;

		System.out.print("\nOrdenando o vetor com o SelectionSort...");
		tempoInicial = System.currentTimeMillis();

		//IMPLEMENTAR AQUI O SELECTION SORT

		tempoFinal = System.currentTimeMillis();
		long tempoSelectionSort = tempoFinal - tempoInicial;
		System.out.println("[OK]");
		//Mostrando o vetor
		if (tamanho < 100) {
			System.out.println("\nOrdenado com Selection");
			for (int i : vs)
				System.out.print(i + " ");
		}

		System.out.print("\nReordenando o vetor com o SelectionSort...");
		tempoInicial = System.currentTimeMillis();

		//IMPLEMENTAR AQUI O SELECTION SORT
//		ALGORITMO InsertionSort(V)
//						PARA i ← 1 ATÉ tamanho(V) FAÇA
//		chave ← V[i]
//		j ← i - 1
//		ENQUANTO j >= 0 E V[j] > chave FAÇA
//		V[j + 1] ← V[j]
//		j ← j - 1
//		FIM ENQUANTO
//		V[j + 1] ← chave
//		FIM PARA
//		FIM ALGORITMO
		//PARA i ← 1 ATÉ tamanho(V) FAÇA
		for(int i=1;i<vi.length;i++){
			//chave ← V[i]
			int chave = vi[i];
		}
		//Trocar variáveis
		int a = 10;
		int b = 5;
		int c = a;
		a = b;
		b = c;


		tempoFinal = System.currentTimeMillis();
		long tempoReordSelectionSort = tempoFinal - tempoInicial;
		System.out.println("[OK]");
		System.out.println("\nPara ordenar " + tamanho + " elementos o Insertion Sort precisou de " + tempoInsertionSort + "ms");
		System.out.println("\nPara reordenar " + tamanho + " elementos o Insertion Sort precisou de " + tempoReordInsertionSort + "ms");
		System.out.println("\nPara ordenar " + tamanho + " elementos o Selection Sort precisou de " + tempoSelectionSort + "ms");
		System.out.println("\nPara reordenar " + tamanho + " elementos o Selection Sort precisou de " + tempoReordSelectionSort + "ms");
	}
}