package aula11;

import java.util.Scanner;

public class Cadastro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = ler.next();
		System.out.print("Sobrenome: ");
		String sobrenome = ler.next();
		Pessoa pessoaUm = new Pessoa(nome,sobrenome);
//		System.out.print("Nome: ");
//		pessoaUm.nome = ler.next();
//		System.out.print("Sobrenome: ");
//		pessoaUm.sobrenome = ler.next();
		System.out.print("Qual o e-mail do "+pessoaUm.nome+": ");
		pessoaUm.mail = ler.next();
		System.out.print("Qual seu cpf "+pessoaUm.nome+": ");
		pessoaUm.cpf = ler.next();
		System.out.print("Qual sua altura");
		pessoaUm.altura = ler.nextFloat();
		System.out.print("Qual sua idade "+pessoaUm.nome+": ");
		pessoaUm.idade = ler.nextInt();
		//Chamando os métodos
		System.out.println(pessoaUm.obterInformacoes());
		System.out.println(pessoaUm.nome+" é maior de idade? "+pessoaUm.maiorIdade());
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa("Jonas","Silva");
		Pessoa p4 = new Pessoa("Ana","Silva",18);
		System.out.println(p4.maiorIdade());

	}
}
