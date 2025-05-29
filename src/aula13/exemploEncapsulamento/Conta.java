package aula13.exemploEncapsulamento;

import java.util.Random;

public class Conta {
	private String titular;
	private String identificador;
	private float saldo;
	//Que existe mesmo que não tenha instância
	//É único para todas as instâncias
	static String nomeBanco;

	public Conta(String titular, float deposito){
		this.titular = titular;
		saldo = deposito;
		geraIdentificador();
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

	private void geraIdentificador(){
		Random aleatorio = new Random();
		String identificador = "";
		for(int i=0;i<5;i++)
			identificador+=(char)aleatorio.nextInt(65,90);
		identificador+=aleatorio.nextInt(1000,9999);
		this.identificador = identificador;
	}

	public void depositar(float valor){
		saldo+=valor;
	}

	public boolean sacar(float valor){
		if(saldo>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}

	public String verificaSaldo(){
		return "Seu saldo é de "+String.format("%.2f",saldo);
	}
}
