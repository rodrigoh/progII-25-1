package aula01;

public class Exemplo01 {
	public static void main(String[] args) {
		System.out.print("Imprime uma mensagem na tela sem quebrar linha");
		System.out.println("Imprime o texto na tela e quebra linha no final");
		System.out.printf("Imprime o texto formatado com a sintaxe do C\n");

		String nome = "Rodrigo";
		int idade = 37;

		System.out.println("Nome "+nome+" e idade "+idade);
		System.out.printf("Nome %s e idade %d\n",nome,idade);
	}
}
