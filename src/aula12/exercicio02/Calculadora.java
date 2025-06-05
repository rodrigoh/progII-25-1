package aula12.exercicio02;


import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		Scanner ler = new Scanner(System.in);
		char opcao;
		System.out.println("Selecione uma opção");
		System.out.println("Calcular área e perímetro de um quadrado aperte q");
		System.out.println("Calcular área e perímetro de um retângulo aperte r");
		System.out.println("Calcular área e perímetro de um círculo aperte c");
		opcao = ler.next().toLowerCase().charAt(0);
		switch (opcao){
			case 'q'->{
				System.out.println("Qual o lado do quadrado: ");
				float lado = ler.nextFloat();
				System.out.println("A área do quadrado vale "+op.areaQuadrado(lado)+" cm²");
				System.out.println("O perímetro do quadrado vale "+op.perimetroQuadrado(lado)+" cm");
			}
			case 'r'->{
				System.out.println("Qual o valor da base do retângulo: ");
				float base = ler.nextFloat();
				System.out.println("Qual o valor da altura do retângulo: ");
				float altura = ler.nextFloat();
				System.out.println("A área do retângulo vale "+op.areaRetangulo(base,altura)+" cm²");
				System.out.println("O perímetro do retângulo vale "+op.perimetroRetangulo(base,altura)+" cm");
			}
			case 'c'->{
				System.out.println("Qual o valor do raio: ");
				float raio = ler.nextFloat();
				System.out.println("A área do círculo vale "+op.areaCirculo(raio)+" cm²");
				System.out.println("O perímetro do retângulo vale "+op.perimentoCirculo(raio)+" cm");
			}
		}
	}
}
