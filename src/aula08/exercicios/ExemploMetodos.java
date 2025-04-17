package aula08.exercicios;

import java.util.Scanner;

public class ExemploMetodos {

	//tipo acesso modificador estático tipo retorno nome(parâmetros opcionais)
	public static int somaNumero(int n1, int n2){
		return n1+n2;
	}

	public static int leNumero(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextInt();
	}

	public static void main(String[] args) {
			int v1 = leNumero("Digite um número");
			int v2 = leNumero("Digite outro número");
			int resultado = somaNumero(v1,v2);
		System.out.println("A soma dos números vale "+resultado);
	}
}
