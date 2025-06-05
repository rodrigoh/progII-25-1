package aula14.exemploFinal;

public class Teste {
	public static void main(String[] args) {
		System.out.println(Operacoes.E);
		Operacoes op = new Operacoes();
		System.out.println(op.valor);
		//Atributos definidos como final, não podem ser alterados...
		//op.valor = 25;
	}
}
