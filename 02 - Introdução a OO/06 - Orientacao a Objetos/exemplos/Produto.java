class Produto {
	double preco;
	String descricao;
	String marca;
	
	void inicializaValores(double umPreco, String umaDescricao, String umaMarca){
		preco = umPreco;
		descricao = umaDescricao;
		marca = umaMarca;	
	}
	
	void imprime(){
		System.out.println("--------------------------");
		System.out.println("Produto: " + descricao);
		System.out.println("Marca: " + marca);
		System.out.println("Preco: " + preco);
		System.out.println("--------------------------");	
	}
}