package aula05.exercicios;

import java.util.Random;
import java.util.Scanner;

/*
Ler dois vetores, A e B com um número variável de conteúdo (números)
(no máximo 10). O programa deve solicitar antes da leitura dos vetores
 a quantidade de dados a serem lidos (1 a 10), os dois vetores terão
 o mesmo número de elementos. Gerar um terceiro vetor chamado Soma
 (de no máximo 10 elementos) que seja a soma dos dados do vetor
 A com os do vetor B.
 */
public class Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.print("Qual a capacidade do vetor: ");
		int cap = ler.nextInt();
		while(cap<1 || cap>10){
			System.out.print("A quantidade deve estar entre 1 e 10: ");
			cap = ler.nextInt();
		}
		int[] va = new int[cap];
		int[] vb = new int[cap];
		int[] soma = new int[cap];
		for(int i=0;i<cap;i++){
			va[i] = aleatorio.nextInt(10,50);
			vb[i] = aleatorio.nextInt(10,50);
			soma[i] = va[i]+vb[i];
			System.out.printf("%d + %d = %d\n",va[i],vb[i],soma[i]);
		}
	}
}
