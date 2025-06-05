package aula12.exercicio04;

/**
 * Crie uma classe Pessoa com os seguintes atributos, nome, eMail, telefone, endereço. Em outra classe, criar uma lista de até 10 pessoas, o usuário deverá informar os dados de cada pessoa. E o programa deverá questionar, continuar cadastrando? Ao final mostrar a lista de usuários cadastrados.
 */
public class Pessoa {
	String nome;
	String eMail;
	String telefone;
	String endereco;

	String oberInformacoes(){
		String info = "Nome: "+nome;
		info+="\nE-mail: "+eMail;
		info+="\nTelefone: "+telefone;
		info+="\nEndereço: "+endereco;
		return info;
	}
}
