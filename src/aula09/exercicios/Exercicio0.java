package aula09.exercicios;

public class Exercicio0 {
	public static boolean ePrimo(int n){
		int contDiv = 0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0)
				contDiv++;
		}
		return contDiv==2;
	}

	public static void main(String[] args) {
		System.out.println("São primos entre 1 e 1000 os seguintes números");
		for (int i = 1; i <=1000; i++) {
			if(ePrimo(i))
				System.out.print(i+" ");
		}
	}
}
