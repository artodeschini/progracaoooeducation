
public class TesteWrapperClasses {
	
	public static void main(String[] args) {
		System.out.println("Exemplo de utilização da classe Boolean");
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("TrUe");
		Boolean b4 = new Boolean(Boolean.TRUE);
		Boolean b5 = new Boolean("qualquer outra coisa");
		Boolean b6 = Boolean.valueOf("true");
		Boolean b7 = Boolean.valueOf(true);
		boolean b8 = b7.booleanValue(); 
			
		System.out.println("b1 " + b1.booleanValue());
		System.out.println("b2 " + b2.booleanValue());
		System.out.println("b3 " + b3.booleanValue());
		System.out.println("b4 " + b4.booleanValue());
		System.out.println("b5 " + b5.booleanValue());
		System.out.println("b6 " + b6.booleanValue());
		System.out.println("b7 " + b7.booleanValue());
		System.out.println("b8 " + b8);
		
		System.out.println("Exemplo de utilização da classe Integer");
		Integer i1 = new Integer(1);
		Integer i2 = new Integer("2");
		int i3 = Integer.parseInt("3");
		Integer i4 = Integer.valueOf("4");
		Integer i5 = Integer.valueOf(5);
		String bin = Integer.toBinaryString(23);
		
		System.out.println("i1 " + i1.intValue());
		System.out.println("i2 " + i2.intValue());
		System.out.println("i3 " + i3);
		System.out.println("i4 " + i4);
		System.out.println("i5 " + i5);
		System.out.println("23 em binario " + bin);
	
		System.out.println("Exemplo de utilização da classe Double");
		Double d1 = new Double(1);
		Double d2 = new Double(2.1);
		Double d3 = Double.valueOf("3");
		Double d4 = Double.valueOf(4.5);
		double d5 = d4.doubleValue();
		System.out.println("transformando Double para inteiro com intValue()");
		int i = d3.intValue();
		
		System.out.println("d1 " + d1.doubleValue());
		System.out.println("d2 " + d2.doubleValue());
		System.out.println("d3 " + d3.doubleValue());
		System.out.println("d4 " + d4.doubleValue());
		System.out.println("d5 " + d5);
		System.out.println("transformamos i (int) d3 com intValue() " + i);
		
		System.out.println("Exemplos com a classe Character");
		Character c1 = new Character('a');
		Character c2 = new Character('2');
		Character c3 = new Character('?');
		char c4 = c2.charValue();
		char c5 = c1.charValue();
		
		boolean isDigit = Character.isDefined(c4);
		boolean isLetter = Character.isLetter(c5);
		
		System.out.println("c1 " + c1.charValue());
		System.out.println("c2 " + c2.charValue());
		System.out.println("c3 " + c3.charValue());
		System.out.println("c4 é digito " + isDigit);
		System.out.println("c5 é letra " + isLetter);
		
	}

}
