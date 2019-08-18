
public class TesteCalculadora {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		System.out.println("1 + 9 = " + calc.soma(1, 9));
		System.out.println("1 + 9.0f = " + calc.soma(1, 9.0f));
		System.out.println("1 + 3 + 6 = " + calc.soma(1, 3, 6) );
		System.out.println("1 + 2 + 3 = " + calc.soma( new int[] { 1, 2,3 } ) );
	}

}
