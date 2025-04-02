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
public class Ex11Opc2 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		int tamanho = 10;
		int[] vetor = new int[tamanho];
		int[] aux = new int[tamanho];
		int cont = 0;
		System.out.println("Números no vetor:");
		for(int i=0;i< vetor.length;i++){
			vetor[i] = aleatorio.nextInt(20,50);
			System.out.print(vetor[i]+" ");
		}
		System.out.println("\nDos números acima qual deseja remover: ");
		int remove = new Scanner(System.in).nextInt();
		//Removendo
		for(int i=0;i<vetor.length;i++){
			if(vetor[i] != remove){
				aux[cont] = vetor[i];
				cont++;
			}
		}
		vetor = aux;
		//Mostrando
		for(int i=0;i<cont;i++){
			System.out.print(vetor[i]+" ");
		}
	}
}
