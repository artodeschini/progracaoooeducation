class Calculadora {
	//a passagem de dois valores do tipo int (ou tipo compativel) //e obrigatoria
	
	int soma(int x, int y){
		return x + y; 
	}
	
	//a passagem de dois parametros do tipo double (ou tipo //compativel) e obrigatoria
	
	double multiplicacao(double d1, double d2){
		double resultado = d1 * d2;
			return resultado;
	}
	
	//a passagem de dois valores do tipo int e obrigatoria
	
	boolean maior (int num1, int num2){
		if (num1 > num2)
			return true;
		else
			return false;
	}

	void print(String texto){
		System.out.println("Texto: " + texto);
	}
}