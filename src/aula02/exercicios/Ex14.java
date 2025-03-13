package aula02.exercicios;

import java.util.Scanner;

/**
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
 * Sabendo-se que o preço do combustível é de R$ 4,15, escreva um programa
 * para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km)
 * no final do dia, o número de litros de combustível gasto e o valor total
 * (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em
 * Km/L e o lucro (líquido) do dia.
 */
public class Ex14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Qual a km inicial: ");
		int kmInicial = ler.nextInt();
		System.out.print("Qual a km final: ");
		int kmFinal = ler.nextInt();
		System.out.print("Quantos litros de combustível foram usados: ");
		float litros = ler.nextFloat();
		System.out.print("Qual o valor total recebido: ");
		float valorBruto = ler.nextFloat();
		float distancia = kmFinal-kmInicial;
		float autonomia = distancia/litros;
		float valorLiquido = valorBruto - litros * (float) 4.15;
		System.out.printf("Seu veículo percorre %.2f km/l\n",autonomia);
		System.out.printf("Seu lucro foi de R$%.2f\n",valorLiquido);
	}
}
