package aula13.exemploEncapsulamento;

public class ExemploBanco {
	public static void main(String[] args) {
		Conta c1 = new Conta("Jonas",100);
		//c1.saldo = 0;
		System.out.println("c1 "+c1.getIdentificador());
		//c1.geraIdentificador();
		System.out.println("c1 "+c1.getIdentificador());
	}
}
