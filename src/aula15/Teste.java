package aula15;

import aula11.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Lista<String> l1 = new Lista<>(3);
		Lista<Double> l2 = new Lista<>(10);
		Lista<Pessoa> listaPessoa = new Lista<>(10);
		l1.adiciona("A");
		l1.adiciona("C");
		l1.adiciona("D");
		System.out.println(l1);
		l1.adiciona(1,"B");
		System.out.println(l1);
		System.out.println(l1.remove(1));
		System.out.println(l1);
		l2.adiciona(12.56);
		System.out.println(l2);
	}
}
