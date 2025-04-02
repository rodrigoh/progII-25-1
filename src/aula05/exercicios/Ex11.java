package aula05.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Ler um vetor de 10 elementos inteiros. Após isto, imprimir na
 * tela os 10 valores lidos e o usuário poderá escolher um destes
 * valores para ser excluído do vetor. Ler o valor escolhido e
 * eliminá-lo do vetor. No momento da exclusão todos os valores
 * posteriores ao valor escolhido deverão ser reorganizados
 * (movidos uma posição para esquerda) a fim de que o vetor
 * resultante não fique com um espaço em branco.
 * Imprimir o novo vetor.
 */
public class Ex11 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int tamanho = 10;
		int[] vetor = new int[tamanho];
		System.out.println("Números no vetor:");
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(20,50);
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDos números acima qual deseja remover: ");
		int remove = new Scanner(System.in).nextInt();
		//Pesquisar no vetor
		int pos = -1;
		for(int i=0;i<vetor.length && pos==-1;i++){
			if(vetor[i]==remove)
				pos = i;
		}
		//Testar e remover
		if(pos!=-1){
			for(int i=pos;i<tamanho-1;i++)
				vetor[i] = vetor[i+1];
			tamanho--;
			//Impressão do vetor
			System.out.println("\nDados restantes...");
			for(int i=0;i<tamanho;i++){
				System.out.print(vetor[i]+" ");
			}
		}
		else{
			System.out.println(remove+" não está na lista");
		}


	}
}
