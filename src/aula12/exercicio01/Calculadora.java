package aula12.exercicio01;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Operacoes operacoes = new Operacoes();
		char op;
		boolean primeira = true;
		do{
			System.out.println("Escolha uma opção");
			System.out.println("+ para soma");
			System.out.println("- para subtração");
			System.out.println("* para multiplicação");
			System.out.println("/ para divisão");
			System.out.println("^ para potenciação");
			System.out.println("! para calcular o fatorial");
			System.out.println("r reset");
			System.out.println("s sair");
			op = ler.next().toLowerCase().charAt(0);
			if(primeira && op!='s' && op!='r' && op!='!'){
				System.out.println("Realizando uma "+op);
				System.out.print("Informe n1: ");
				operacoes.n1 = ler.nextFloat();
				System.out.print("Informe n2: ");
				operacoes.n2 = ler.nextFloat();
			}
			else if(op!='s' && op!='r' && op!='!'){
				System.out.println("Realizando uma "+op+" n1 vale "+String.format("%.2f",operacoes.n1));
				System.out.print("Informe um n2: ");
				operacoes.n2 = ler.nextFloat();
			}
			else if(primeira && op=='!'){
				System.out.print("Informe um n1: ");
				operacoes.n1 = ler.nextFloat();
			}
			switch (op){
				case '+'->{
					float soma = operacoes.soma();
					System.out.printf("%.2f + %.2f = %.2f\n",operacoes.n1,operacoes.n2,soma);
					primeira = false;
					operacoes.n1 = soma;
				}
				case '-'->{
					float subtrai = operacoes.subtrai();
					System.out.printf("%.2f - %.2f = %.2f\n",operacoes.n1,operacoes.n2,subtrai);
					primeira = false;
					operacoes.n1 = subtrai;
				}
				case '*'->{
					float mult = operacoes.multiplica();
					System.out.printf("%.2f * %.2f = %.2f\n",operacoes.n1,operacoes.n2,mult);
					primeira = false;
					operacoes.n1 = mult;
				}
				case '^'->{
					float resposta = operacoes.potencia();
					System.out.printf("%.2f ^ %.2f = %.2f\n",operacoes.n1,operacoes.n2,resposta);
					primeira = false;
					operacoes.n1 = resposta;
				}
				case '!'->{
					float fatorial = operacoes.fatorial();
					System.out.printf("%.2f! = %.2f\n",operacoes.n1, fatorial);
					primeira = false;
					operacoes.n1 = fatorial;
				}
				case '/'->{
					System.out.println(operacoes.divide());
					primeira = true;
				}
				case 'r'-> {
					primeira = true;
				}
				default -> {
					System.out.println("Operação inválida ou selecionado opção sair");
				}
			}
		}
		while (op!='s');
	}
}
