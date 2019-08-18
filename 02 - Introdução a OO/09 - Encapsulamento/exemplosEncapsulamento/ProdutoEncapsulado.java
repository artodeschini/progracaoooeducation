
public class ProdutoEncapsulado {
	
	private double preco;
	private String descricao;
	private String marca;
	
	public void valoresIniciais(double umPreco, String umaDescricao, String umaMarca) {
		alteraPreco(umPreco);
		setDescricao(umaDescricao);
		setMarca(umaMarca);
	}
	
	public void aumentaPreco(double porcentagem) {
		if ( porcentagem > 0) {
			System.out.println("aumentando o preco em " + porcentagem +"  %");
			porcentagem = 1  + (porcentagem/100);
			System.out.println("Novo preco = " + preco);
		} else {
			System.out.println("aumeno dever ser maior que zero");
		}
		
	}
	
	public void alteraPreco(double novoPreco) {
		if ( novoPreco > 0 ) {
			preco = novoPreco;
		}
	}
	
	public void imprime() {
		System.out.println("-----------------------");
		System.out.println("Produto: " + descricao + "\n");
		System.out.println("Marca:" + marca + "\n");
		System.out.println("Preco" + preco + "\n");
		System.out.println("-----------------------");
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
