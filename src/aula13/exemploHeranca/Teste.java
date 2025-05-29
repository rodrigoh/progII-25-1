package aula13.exemploHeranca;

public class Teste {
	public static void main(String[] args) {
		Motorista m1 = new Motorista("Jonas","Silva","jonas@terra.com.br","AB564654");
//		m1.setNome("Jonas");
//		m1.setSobrenome("Silva");
		m1.setCpf("000.000.000-00");
//		m1.seteMail("jonas@terra.com.br");
//		m1.setCnh("AB564654");

		System.out.println(m1.obterDados());
		System.out.println(m1.getCnh());
	}
}
