package aula15;

import java.util.ArrayList;

public class Teste02 {
	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>(5);
		//Adicionar um elemento
		lista.add("A");
		lista.add("C");
		lista.add("D");
		lista.add(1,"B");
		System.out.println(lista);
		//Verificar se um elemento existe na lista
		//teste?valor_verdadeiro:valor_falso
		//nota>=8?"Aprovado":"Recuperação";
		System.out.println("A lista tem um 'D'? "+(lista.contains("D")?"Sim":"Não"));
		//Verificar a posição de um elemento na lista
		System.out.println("Posição do elemento 'J': "+lista.indexOf("J"));
		System.out.println("Posição do elemento 'C': "+lista.indexOf("C"));
		System.out.println("última posição do elemento 'C': "+lista.lastIndexOf("C"));
		System.out.println("Adicionando mais um 'C' a lista");
		lista.add("C");
		System.out.println("Posição do elemento 'C': "+lista.indexOf("C"));
		System.out.println("última posição do elemento 'C': "+lista.lastIndexOf("C"));
		//Remover um elemento da lista pela posição
		System.out.println("Removendo o elemento da posição 2: "+lista.remove(2));
		//Remover um elemento pelo elemento
		System.out.println("Foi possível remover o elemento 'A' da lista "+(lista.remove("A")?"Sim":"Não"));
		//Verificar o tamanho da lista
		System.out.println("Tamanho: "+lista.size());
		//Apagar todos os elementos
		lista.clear();
		System.out.println(lista);
		//Verifica se a lista está vazia
		System.out.println("A lista está vazia? "+(lista.isEmpty()?"Sim":"Não"));



	}
}
