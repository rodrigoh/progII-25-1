package aula04.exerciciosRepete;

import java.util.Scanner;

/*
Uma loja está levantando o valor total de todas as mercadorias em estoque.
Escreva um algoritmo que permita a entrada das seguintes informações:
a) Número total de mercadorias no estoque (quantidade total).
b) Valor de cada mercadoria.
Ao final imprimir o valor total em estoque e a média de valor das mercadorias

 */
public class Ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual o total de mercadorias no estoque: ");
		int quantTotal = ler.nextInt();
		float soma=0;
		for(int i=0;i<quantTotal;i++){
			System.out.print("Qual o valor do "+(i+1)+"° produto: ");
			float valor = ler.nextFloat();
			soma+=valor;
		}
		System.out.printf("O total de %d produtos vale R$%.2f\n",quantTotal,soma);
	}
}
