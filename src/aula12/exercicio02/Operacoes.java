package aula12.exercicio02;

public class Operacoes {
	float areaQuadrado(float lado){
		return lado*lado;
	}

	float perimetroQuadrado(float lado){
		return 4*lado;
	}

	float areaCirculo(float raio){
		return (float) Math.PI*raio*raio;
	}

	float perimentoCirculo(float raio){
		return (float) Math.PI*2*raio;
	}

	float areaRetangulo(float base, float altura){
		return base*altura;
	}

	float perimetroRetangulo(float base, float altura){
		return (base+altura)*2;
	}

	float areaTrianguloR(float base, float altura){
		return areaRetangulo(base,altura)/2;
	}
}
