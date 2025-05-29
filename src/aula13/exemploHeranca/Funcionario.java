package aula13.exemploHeranca;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String eMail;
	private int altura;
	private String cpf;

	public Funcionario(String nome, String sobrenome, String eMail){
		this.nome = nome;
		this.eMail = eMail;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String obterDados(){
		String info="Nome: "+nome+" "+sobrenome;
		info+="\nCPF: "+cpf;
		info+="\nE-mail: "+eMail;
		return info;
	}
}
