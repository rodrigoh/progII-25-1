package aula04.exercicios;

import java.util.Scanner;

/**
 * Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
 * Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
 * Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo
 * Positivo', senão escrever a mensagem 'Saldo Negativo'.
 */
public class Ex18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Entre com o número da conta: ");
		String numeroConta = ler.next();
		System.out.print("Qual seu saldo R$");
		float saldo = ler.nextFloat();
		System.out.print("Quais os valores de débito R$");
		float debito = ler.nextFloat();
		System.out.print("Quais os valores de crédito R$");
		float credito = ler.nextFloat();
		float saldoAtual = saldo+credito-debito;
		System.out.printf("Seu saldo atual é de R$%.2f\n",saldoAtual);
		if(saldoAtual>0)
			System.out.println("Seu saldo é positivo");
		else if(saldoAtual<0)
			System.out.println("Seu saldo atual é negativo");
		else
			System.out.println("Sua conta está zerada");
	}
}
