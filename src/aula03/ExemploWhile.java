package aula03;

import java.util.Scanner;

public class ExemploWhile {
	public static void main(String[] args) {
		int cont = 0;
		while(cont<10){
			System.out.print(cont+" ");
			cont++;
//			cont+=1;
//			cont = cont+1;
		}
		System.out.println("\nOutro exemplo");
		//Exemplo 2
		char resposta = 's';
		while(resposta=='s'){
			//Código...
			System.out.print("Continuar (s - sim / n - não): ");
			resposta = new Scanner(System.in).next().toLowerCase().charAt(0);
		}

	}
}
