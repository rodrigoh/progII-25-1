package aula08.exercicios;

import java.util.Scanner;

public class CalculaMedia {

	public static float calculaMedia(float n1, float n2, float n3){
		return (n1+n2+n3)/3;
	}

	public static float leNota(int cont){
		Scanner ler = new Scanner(System.in);
		float nota;
		do{
			System.out.print("Informe a "+cont+"° nota (entre 1 e 10): ");
			nota = ler.nextFloat();
		}
		while (nota<0 || nota>10);
		return nota;
	}

	public static void main(String[] args) {
		float n1 = leNota(1);
		float n2 = leNota(2);
		float n3 = leNota(3);
		float media = calculaMedia(n1,n2,n3);
		System.out.printf("A média do aluno vale %.2f\n",media);
	}
}
