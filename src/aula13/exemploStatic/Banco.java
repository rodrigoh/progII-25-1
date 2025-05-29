package aula13.exemploStatic;

public class Banco {
	public static void main(String[] args) {
		Conta c1 = new Conta("Jonas",100);
		Conta c2 = new Conta("Ana",150);
		c1.nomeBanco = "Banco teste";
		System.out.println("C1: "+c1.nomeBanco);
		System.out.println("C2: "+c2.nomeBanco);

		Conta.nomeBanco = "Novo nome";
		System.out.println("C1: "+c1.nomeBanco);
		System.out.println("C2: "+c2.nomeBanco);

	}
}
