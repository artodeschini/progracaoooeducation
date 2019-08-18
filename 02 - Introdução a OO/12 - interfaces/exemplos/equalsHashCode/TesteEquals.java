public class TesteEquals {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Priscila", 1112345L);
		Pessoa p2 = new Pessoa("Priscila", 1112345L);

		if (p1.equals(p2)) {
			System.out.println("p1 = p2 utilizando equals");
		} else {
			System.out.println("p1 é diferente de  p2 utilizando equals");
		}
	}

}