class TesteCaculadora{
	public static void main(String[] args){	
		Calculadora c = new Calculadora();
		c.print("Vamos testar a calculadora");
		
		int resultado1 = c.soma(10, 10);
		System.out.println(" 10 + 10 = " + resultado1);
		
		double resultado2 = c.multiplicacao(10, 10);
		System.out.println(" 10 * 10 = " + resultado2);
		
		boolean resultado3 = c.maior(20, 1000);
		System.out.println(" 20 > 1000 = " + resultado3);	
	}
}