package aula12.exercicio01;

public class Operacoes {
	float n1;
	float n2;

	float soma(){
		return n1+n2;
	}

	float subtrai(){
		return n1-n2;
	}

	float multiplica(){
		return n1*n2;
	}

	String divide(){
		if(n2!=0){
			return String.format("%.2f / %.2f = %.2f",n1,n2,n1/n2);
		}
		return "Não é possível dividir por zero";
	}

	float potencia(){
		float resp = 1;
		for(int i=1;i<=n2;i++){
			resp*=n1;
		}
		return resp;
	}

	float fatorial(){
		int resp = 1;
		for(int i=1;i<=n1;i++){
			resp*=i;
		}
		return resp;
	}
}
