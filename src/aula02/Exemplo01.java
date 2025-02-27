package aula02;

import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = ler.nextInt();
		System.out.printf("O valor digitado foi: %d\n",numero);
		//Ler Strings next() -> lê até o primeiro espaço
		//Ler Strings nextLine() -> lê uma string até o enter...
		//Ler float nextFloat() -> lê um número real
		float numeroReal = (float) 5.5;
		numeroReal = 5.5f;

		float raio = 5;
		//π * r²
		float area = (float) (Math.PI * Math.pow(raio,2));

	}
}
