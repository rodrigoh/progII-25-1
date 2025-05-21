package aula10;

public class Exemplo01 {
	public static void main(String[] args) {
		//Criando instâncias da classe carro
		Carro c1 = new Carro();
		c1.marca = "VW";
		c1.modelo = "Fusca";
		c1.anoFabricao = 1980;
		c1.cor = "azul";
		c1.km=100000;
		c1.capacidadeTanque=45;
		Carro c2 = new Carro();
		c2.marca = "Fiat";
		c2.modelo = "500";
		c2.anoFabricao = 1970;
		c2.cor = "vermelho";
		c2.km=100000;
		c2.capacidadeTanque=30;
		System.out.println("Nome "+c1.modelo);

		System.out.println("Abastecendo o carro "+c1.modelo+" "+c1.abastecer(10));
		System.out.println(c1.andar());
		System.out.println(c1.parar());

	}
}
