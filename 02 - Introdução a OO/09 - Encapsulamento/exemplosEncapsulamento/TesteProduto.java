
public class TesteProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Produto p = new Produto();
		p.valoresIniciais(9.0d, "ProdutoX", "MarcaXYZ");
		p.imprime();
		p.aumentaPreco(10d);
		p.setDescricao("Produto: Linguagem");
		p.setMarca("Java");
		p.imprime();

	}

}
