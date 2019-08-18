
public class TesteProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.valoresIniciais(10.0, "A");
		p.setDescricao("A");
		p.imprime();
		
		Produto p2 = new Produto();
		p2.valoresIniciais(12.0, "B", "B");
		p2.imprime();
	}

}
