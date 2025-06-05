package aula14.exemploExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		try {
			System.out.print("Digite um número: ");
			int n1 = ler.nextInt();
			System.out.print("Digite outro número: ");
			int n2 = ler.nextInt();
			float resp = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + resp);
		}
		catch (InputMismatchException e){
			System.out.println("N1 e N2 precisam ser números");
		}
		catch (ArithmeticException e){
			System.out.println("Não é possível dividir zero");
			//e.printStackTrace();
		}

	}
}
