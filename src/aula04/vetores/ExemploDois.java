package aula04.vetores;

public class ExemploDois {
	public static void main(String[] args) {
		String[] nomes = {"Ana", "Daniela", "Paula", "Paulo", "Jonas", "Pedro"};
		String[] lista = new String[6];

		System.out.println("O tamanho vetor é "+nomes.length);

		for(int i=0;i < nomes.length;i++){
			System.out.print(nomes[i]+" ");
		}
	}
}
