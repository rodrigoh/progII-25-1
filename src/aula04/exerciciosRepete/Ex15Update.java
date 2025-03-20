package aula04.exerciciosRepete;

import java.util.Scanner;

public class Ex15Update {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos tipos de mercadorias tem no estoque: ");
		int quantTotal = ler.nextInt();
		float soma=0;
		int contProduto = 0;
		for(int i=0;i<quantTotal;i++){
			System.out.print("Qual o valor do "+(i+1)+"° produto: ");
			float valor = ler.nextFloat();
			System.out.print("Quantas unidades tem em estoque: ");
			int quantEstoque = ler.nextInt();
			float valorItem = valor*quantEstoque;
			contProduto+=quantEstoque;
			soma+=valorItem;
		}
		System.out.printf("O total de %d produtos vale R$%.2f\n",contProduto,soma);
	}
}
