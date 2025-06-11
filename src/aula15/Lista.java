package aula15;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade){
		elementos = (T[]) new Object[capacidade];
		tamanho = 0;
	}

	/**
	 * Adiciona um elemento no final da lista
	 * @param elemento a ser adicionado
	 */
	public void adiciona(T elemento){
		aumentaCapacidade();
		elementos[tamanho] = elemento;
		tamanho++;
	}

	/**
	 * Permite adicionar um elemento a qualquer posição da lista
	 * @param posicao
	 * @param elemento
	 */
	public void adiciona(int posicao, T elemento){
		if(posicao<0 || posicao>=tamanho){
			throw new IllegalArgumentException("A posição "+posicao+" não é válida");
		}
		aumentaCapacidade();
		for(int i=tamanho-1;i>=posicao;i--){
			elementos[i+1] = elementos[i];
		}
		elementos[posicao] = elemento;
		tamanho++;
	}

	private void aumentaCapacidade(){
		if(tamanho==elementos.length){
			T[] aux = (T[]) new Object[tamanho*2];
			for (int i = 0; i < elementos.length; i++) {
				aux[i] = elementos[i];
			}
			elementos = aux;
		}
	}

	/**
	 * Método que retorna a posição de determinado elemento na lista
	 * @param elemento a ser procurado
	 * @return posição do elemento ou -1 se o elemento não for encontrado
	 */
	public int posicaoDe(T elemento){
		for(int i=0;i<tamanho;i++){
			if(elementos[i].equals(elemento))
				return i;
		}
		return -1;
	}

	public T obter(int posicao){
		if(posicao<0 || posicao>=tamanho){
			throw new IllegalArgumentException("A posição "+posicao+" não é válida");
		}
		return elementos[posicao];
	}
	//Construtor que não recebe capacidade inicial
	//Verifica tamanho
	//Está vazio
	//Ultima posição de
	//Contém
	//Remove pelo elemento
	public T remove(int posicao){
		if(posicao<0 || posicao>=tamanho){
			throw new IllegalArgumentException("A posição "+posicao+" não é válida");
		}
		T copia = elementos[posicao];
		for(int i=posicao;i<tamanho-1;i++){
			elementos[i] = elementos[i+1];
		}
		tamanho--;
		return  copia;
	}

	//["A", "B", "C"]
	@Override
	public String toString(){
		String retorno = "[";
		if(tamanho>0){
			for(int i=0;i<tamanho-1;i++){
				retorno+=elementos[i]+", ";
			}
			retorno+=elementos[tamanho-1];
		}
		return retorno+"]";
	}
}
