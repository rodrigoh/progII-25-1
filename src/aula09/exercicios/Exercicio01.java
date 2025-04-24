package aula09.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static float calculaDelta(float a, float b, float c){
		return b*b-4*a*c;
	}

	public static float calculaX(float a, float b, float d, char opc){
		float x;
		if(opc=='+')
			x =  (-b+(float)Math.sqrt(d))/(2*a);
		else
			x =  (-b-(float)Math.sqrt(d))/(2*a);
		return x;
	}

	public static float[] calculaXV(float a, float b, float d){
		float[] x = new float[2];
		x[0] =  (-b+(float)Math.sqrt(d))/(2*a);
		x[1] =  (-b-(float)Math.sqrt(d))/(2*a);
		return x;
	}

	public static float leNumero(String mensagem){
		Scanner ler = new Scanner(System.in);
		System.out.print(mensagem+": ");
		return ler.nextFloat();
	}
	public static void main(String[] args) {
		System.out.println("Dada a equação ax²+bx+c=0 informe:");
		float a = leNumero("a");
		float b = leNumero("b");
		float c = leNumero("c");
		float d = calculaDelta(a,b,c);
		if(d>=0){
			//Usando o método que retorna um vetor
			float[] x = calculaXV(a,b,d);
			System.out.printf("As raízes da equação são x'=%.2f e x\"=%.2f\n",x[0],x[1]);
			//Usando a função que retorna um valor apenas
			float x1 = calculaX(a,b,d,'+');
			float x2 = calculaX(a,b,d,'-');
			System.out.printf("As raízes da equação são x'=%.2f e x\"=%.2f\n",x1,x2);
		}
		else{
			System.out.println("A equação não possui raízes no conjunto dos reais");
		}
	}
}
