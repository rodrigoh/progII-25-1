package aula10.exemplo02;

public class Exemplo02 {
	public static void main(String[] args) {
		Caneta canetaUm = new Caneta();
		canetaUm.fabricante = "BIC";
		canetaUm.cor = "branco";
		canetaUm.quantidadeTinta = 10;
		for (int i = 0; i < 15; i++) {
			canetaUm.escrever("Imprimindo pela "+(i+1)+" vez");
		}
	}
}
