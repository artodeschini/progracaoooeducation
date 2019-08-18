class ExemploMetodos{
	//void indica que o metodo não retorna nada
	void imprime() {
		System.out.println("Este metodo nao retorna nada");
	}
	//o metodo DEVE retornar um int ou tipo primitivo //compativel, caso contrario havera um erro de compilacao!!
	int calculaFrete(){
			return 19;
	}
	//o metodo DEVE retornar um objeto da classe String, ou //seja, um tipo reference
	String getNome(){
		return "Este metodo retorna umma String";
	}
}
