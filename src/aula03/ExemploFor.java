package aula03;

public class ExemploFor {
	public static void main(String[] args) {
		int i;
		//for inicialização
		//teste (i<10) loop
		//comandos...
		//incremento (passo) i++
		for(i=0;i<10;i++)
			System.out.print(i+" ");
		System.out.println(i);
		System.out.println("\nOutro exemplo");
		int cont =10;
		for(;cont>=0;cont-=2){
			System.out.print(cont+" ");
		}

		System.out.println("\nFor com mais de um contador");
		for(int o=0,j=9; o<10; o++,j--){
			System.out.println("o="+o+", j="+j);
		}

		System.out.println("\nFor sem passo");
		for(i=0;i<10;){
			System.out.print(i+" ");
			i++;
		}
	}
}
