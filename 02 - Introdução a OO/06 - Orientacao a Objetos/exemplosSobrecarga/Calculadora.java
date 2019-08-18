
public class Calculadora {
	
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int soma(int a, int b, int c) {
		return this.soma(a, b) + c;
	}
	
	public float soma(float a, float b) {
		return a + b;
	}
	
	public long soma(int[] numeros) {
		long result = 0;
		for (int i = 0; i < numeros.length; i++) {
			result += numeros[i];
		}
		return result;
	}

}
