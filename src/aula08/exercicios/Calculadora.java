package aula08.exercicios;

public class Calculadora {
	public static float subtrai(float n1, float n2){
		return n1-n2;
	}

	public static float soma(float n1, float n2){
		return n1+n2;
	}

	public static float multiplica(float n1, float n2){
		return n1*n2;
	}

	public static float divide(float n1, float n2){
		return n1/n2;
	}

	public static float potencia(float base, float expoente){
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("5+2="+soma(5.6f,2));
		System.out.println("5-2="+subtrai(5,2));
		System.out.println("5/2="+divide(5,2));
		System.out.println("5*2="+multiplica(5,2));
	}
}
