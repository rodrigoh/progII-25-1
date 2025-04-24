package aula09.exercicios;

import java.util.Scanner;

//C= 5.(F-32)/9 F= (9.C/5) + 32
public class Exercicio05 {

	public static float converteTemp(float origem, char opc){
		float resultado;
		if(opc=='f')
			resultado = 5*(origem-32)/9;
		else
			resultado = (9*origem/5) + 32;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char escolha;
		System.out.println("selecione uma opção");
		System.out.println("F para converter de °F para °C");
		System.out.println("C para converter de °C para °F");
		System.out.print(": ");
		escolha = ler.next().toLowerCase().charAt(0);
		switch (escolha){
			case 'f' ->{
				System.out.print("Entre com uma temperatura em °F ");
				float temp = ler.nextFloat();
				float resp = converteTemp(temp,'f');
				System.out.printf("%.2f°F equivale(m) a %.2f°C\n",temp,resp);
			}
			case 'c'->{
				System.out.print("Entre com uma temperatura em °C ");
				float temp = ler.nextFloat();
				float resp = converteTemp(temp,'c');
				System.out.printf("%.2f°C equivale(m) a %.2f°F\n",temp,resp);
			}
			default -> System.out.println("opção "+escolha+" não é válida");
		}
	}
}
