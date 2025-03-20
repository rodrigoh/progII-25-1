package aula04.exerciciosRepete;

import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = ler.nextInt();
		for(int i=1;i<=10;i++){
			System.out.printf("%d x %d = %d\n",numero,i,numero*i);
		}
		//Calculando a tabuada de todos os números
		for(int i=1;i<=10;i++){
			for(int j=1;j<=10;j++){
				System.out.printf("%d x %d = %d\n",j,i,j*i);
			}
		}
	}
}
