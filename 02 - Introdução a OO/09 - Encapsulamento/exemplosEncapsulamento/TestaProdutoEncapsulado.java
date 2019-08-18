
public class TestaProdutoEncapsulado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProdutoEncapsulado pe = new ProdutoEncapsulado();
		pe.setDescricao("Produto A");
		pe.setMarca("Marca B");
		pe.setPreco(10);
		
		pe.imprime();
		
		//tentarmos acessar um atributo private dar‡ um erro de compilacao;
		//pe.descricao;
	}

}
