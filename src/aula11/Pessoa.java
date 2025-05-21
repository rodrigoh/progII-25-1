package aula11;

public class Pessoa {
	String nome;
	String sobrenome;
	String mail;
	float altura;
	String cpf;
	int idade;
	int contador;

	public Pessoa(){
	}

	public Pessoa(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
		contador = 0;
	}

	public Pessoa(String nome, String sobrenome, int idade){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		contador = 0;
	}

	boolean maiorIdade(){
		return idade>=18;
	}

	String obterInformacoes(){
		return String.format("Nome: %s %s, idade: %d anos, altura: %.2f ",nome,sobrenome,idade,altura);
	}

	void alteraMail(String mail){
		this.mail = mail;
	}



}
