
class Produto {

	String descricao, marca;
	double preco;
	
	void valoresIniciais(double umPreco, String umaDescricao, String umaMarca) {
		alteraPreco(umPreco);
		setDescricao(umaDescricao);
		setMarca(umaMarca);
	}
	
	void aumentaPreco(double porcentagem) {
		if ( porcentagem > 0) {
			System.out.println("aumentando o preco em " + porcentagem +"  %");
			porcentagem = 1  + (porcentagem/100);
			System.out.println("Novo preco = " + preco);
		} else {
			System.out.println("aumeno dever ser maior que zero");
		}
		
	}
	
	void alteraPreco(double novoPreco) {
		if ( novoPreco > 0 ) {
			preco = novoPreco;
		}
	}
	
	void imprime() {
		System.out.println("-----------------------");
		System.out.println("Produto: " + descricao + "\n");
		System.out.println("Marca:" + marca + "\n");
		System.out.println("Preco" + preco + "\n");
		System.out.println("-----------------------");
	}

	String getDescricao() {
		return descricao;
	}

	 void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	 String getMarca() {
		return marca;
	}

	 void setMarca(String marca) {
		this.marca = marca;
	}

	 double getPreco() {
		return preco;
	}

	 void setPreco(double preco) {
		this.preco = preco;
	}
}
