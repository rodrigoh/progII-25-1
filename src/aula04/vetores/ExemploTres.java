package aula04.vetores;

public class ExemploTres {
	public static void main(String[] args) {
		int[] v1 = {1,5,8,7,9,10};
		int[] v2 = v1;
		System.out.print("V1 = ");
		for(int i=0;i<v1.length;i++)
			System.out.print(v1[i]+" ");
		System.out.print("\nV2 = ");
		for(int i=0;i<v2.length;i++)
			System.out.print(v2[i]+" ");

		v1[2] = 100;

		System.out.print("\nV1 = ");
		for(int i=0;i<v1.length;i++)
			System.out.print(v1[i]+" ");
		System.out.print("\nV2 = ");
		for(int i=0;i<v2.length;i++)
			System.out.print(v2[i]+" ");

		//Copia manual de vetores
		int[] v3 = {1,5,8,7,9,10};
		int[] v4 = new int[6];
		//Copiando cada elemento de v3 para v4
		for(int i=0;i<v3.length;i++){
			v4[i] = v3[i];
		}
		//Copia usando o método arrayCopy
		//System.arraycopy(origem, posicaoInicial, destino, posIniDest,quantElementos);
		System.arraycopy(v3,0,v4,0,v3.length);
		v3[3] = 99;

		System.out.print("\nV3 = ");
		for(int i=0;i<v3.length;i++)
			System.out.print(v3[i]+" ");
		System.out.print("\nV4 = ");
		for(int i=0;i<v4.length;i++)
			System.out.print(v4[i]+" ");
	}
}
