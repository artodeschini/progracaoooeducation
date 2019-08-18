
public class TesteLivroFinal {

	public static void main(String[] args) {
		//Observer que colocamos o objeto reference livro como final
		final Livro livro = new Livro();
		//Ok podemos mudar o valor dos atributos de uma variavel 
		//reference final
		livro.setNome("Core Java 7");
		//está próxima linha dará um erro de compilação
		//livro = new Livro();
		//não podemos atribuir a uma variavel reference outra instancia de classe

	}

}
