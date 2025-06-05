package aula14.exemploPolimorfismo;

import java.time.Period;

public class Teste {
	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		System.out.println(op.soma("Aula de ","programação"));
		System.out.println(op.soma(5,6));
		int[] vetor = {1,2,3};
		System.out.println(op.soma(vetor));

		Pessoa p1 = new Pessoa();
		p1.setNome("Jonas");
		p1.setSobrenome("Silva");
		System.out.println(p1);
	}
}
