package aula05.exercicios;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] nomes = {"Ana", "João", "Maria", "Pedro", "Sofia", "Lucas",
						"Isabela", "Gabriel", "Manuela", "Augusto"};
		System.out.print("Qual nome devo pesquisar: ");
		String pesquisa = ler.next();
		boolean achei = false;
		for(int i=0;i<nomes.length;i++){
			if(nomes[i].equalsIgnoreCase(pesquisa))
				achei = true;
		}
		if(achei)
			System.out.println("Achei");
		else
			System.out.println("Não achei");
	}
}
