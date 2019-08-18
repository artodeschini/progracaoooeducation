
public class TesteComparacao {


	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gabriela", 123456L);
		Pessoa p2 = new Pessoa("Gabriela", 123456L);
		
		//comparando com == como primitivos forma errada
		if ( p1 == p2 ) {
			System.out.println("p1 = p2 utilizando comparador == ");
		} else {
			System.out.println("p1 != p2 utilizando comparador == ");
		}
		
		//comparando com equals
		if ( p1.equals(p2) ) {
			System.out.println("p1 = p2 utilizando o metodo equals ");
		} else {
			System.out.println("p1 != p2 utilizando o metodo equals ");
		}
	}

}
