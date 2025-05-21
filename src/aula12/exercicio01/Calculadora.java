package aula12.exercicio01;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Operacoes operacoes = new Operacoes();
		char op;
		do{
			System.out.println("Escolha uma opção");
			System.out.println("+ para soma");
			System.out.println("- para subtração");
			System.out.println("* para multiplicação");
			System.out.println("/ para divisão");
			System.out.println("^ para potenciação");
			System.out.println("s sair");
			op = ler.next().toLowerCase().charAt(0);
			if(op!='s'){
				System.out.print("Informe um número: ");
				operacoes.n1 = ler.nextFloat();
				System.out.print("Informe outro número: ");
				operacoes.n2 = ler.nextFloat();
			}
			switch (op){
				case '+'->{
					float soma = operacoes.soma();
					System.out.printf("%.2f + %.2f = %.2f\n",operacoes.n1,operacoes.n2,soma);
				}
				case '-'->{
					float subtrai = operacoes.subtrai();
					System.out.printf("%.2f - %.2f = %.2f\n",operacoes.n1,operacoes.n2,subtrai);
				}
				case '*'->{
					float mult = operacoes.multiplica();
					System.out.printf("%.2f * %.2f = %.2f\n",operacoes.n1,operacoes.n2,mult);
				}
				case '^'->{
					float resposta = operacoes.potencia();
					System.out.printf("%.2f ^ %.2f = %.2f\n",operacoes.n1,operacoes.n2,resposta);
				}
				case '/'->{
					System.out.println(operacoes.divide());
				}
				default -> {
					System.out.println("Operação inválida ou selecionado opção sair");
				}
			}
		}
		while (op!='s');

	}
}
