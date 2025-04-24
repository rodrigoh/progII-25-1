package aula09.exercicios;

import java.util.Random;

public class Exercicio03 {

	public static int dado(){
		Random aleatorio = new Random();
		return aleatorio.nextInt(6);
	}

	public static void main(String[] args) {
		float quantidade = 1000000;
		int[] lancamentos = new int[6];
		for (int i = 0; i < quantidade; i++) {
			int face = dado();
			lancamentos[face]++;
		}
		for (int i = 0; i < lancamentos.length; i++) {
			float pFace = lancamentos[i]/(float)quantidade*100;
			System.out.printf("A face %d do dado foi lançada %d vezes o que representa %.2f%%\n",(i+1),lancamentos[i],pFace);
		}
	}
}
