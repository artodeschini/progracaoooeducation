class TesteHashCode {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro Paulo", 119230021L);
		Pessoa p2 = new Pessoa("Armando Silva", 32165498L);
		Pessoa p3 = new Pessoa("Fernanda Santos", 109951162777L);

		System.out.println("codigo hash code de p1: " + p1.hashCode());
		System.out.println("codigo hash code de p2: " + p2.hashCode());
		System.out.println("codigo hash code de p3: " + p3.hashCode());

		System.out.println("p1 equals p2: " + p1.equals(p2));
		System.out.println("p2 equals p3: " + p2.equals(p3));
		System.out.println("p3 equals p1: " + p3.equals(p1));
	}
}