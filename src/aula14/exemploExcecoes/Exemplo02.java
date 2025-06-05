package aula14.exemploExcecoes;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		boolean valido = false;
		do{
			try{
				System.out.print("Digite um número: ");
				int n = new Scanner(System.in).nextInt();
				valido = true;
				System.out.println(n);
			}
			catch (InputMismatchException e){
				System.out.println("Valor precisa ser um número");
				valido = false;
			}
		}
		while (!valido);
	}
}
