package aula10;

public class Carro {
	String marca;
	String modelo;
	String cor;
	long km;
	int anoFabricao;
	float capacidadeTanque;
	float quanLitros=0;

	boolean abastecer(float quantidade){
		if(capacidadeTanque>quanLitros+quantidade) {
			quanLitros += quantidade;
			return true;
		}
		return false;
	}

	String andar(){
		return marca+" "+modelo+" está andando...";
	}

	String parar(){
		return marca+" "+modelo+" está parado...";
	}
}
