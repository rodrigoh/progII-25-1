package aula14.conta;

import java.util.Random;

public class Conta {
	private String titular;
	private String identificador;
	protected float saldo;
	private String senha;

	public Conta(String titular, String senha){
		this.titular = titular;
		this.senha = senha;
		identificador = geraIdentificador();
	}

	private String geraIdentificador(){
		String id = "";
		Random aleatoria = new Random();
		for (int i = 0; i < 5; i++) {
			id+=(char)aleatoria.nextInt(65,90);
		}
		id+=aleatoria.nextInt(1000,9999);
		return id;
	}

	public String getIdentificador(){
		return identificador;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean validaAcesso(String identificador, String senha){
		return this.identificador.equals(identificador) && this.senha.equals(senha);
	}
}
