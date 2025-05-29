package aula13.exemploStatic;

import java.util.Random;

public class Conta {
	String titular;
	String identificador;
	float saldo;
	//Que existe mesmo que não tenha instância
	//É único para todas as instâncias
	static String nomeBanco;

	public Conta(String titular, float deposito){
		this.titular = titular;
		saldo = deposito;
		geraIdentificador();
	}

	void geraIdentificador(){
		Random aleatorio = new Random();
		String identificador = "";
		for(int i=0;i<5;i++)
			identificador+=(char)aleatorio.nextInt(65,90);
		identificador+=aleatorio.nextInt(1000,9999);
		this.identificador = identificador;
	}

	void depositar(float valor){
		saldo+=valor;
	}

	boolean sacar(float valor){
		if(saldo>=valor){
			saldo-=valor;
			return true;
		}
		return false;
	}

	String verificaSaldo(){
		return "Seu saldo é de "+String.format("%.2f",saldo);
	}
}
