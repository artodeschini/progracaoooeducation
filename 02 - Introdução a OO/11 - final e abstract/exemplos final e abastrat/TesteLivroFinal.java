
public class TesteLivroFinal {

	public static void main(String[] args) {
		//Observer que colocamos o objeto reference livro como final
		final Livro livro = new Livro();
		//Ok podemos mudar o valor dos atributos de uma variavel 
		//reference final
		livro.setNome("Core Java 7");
		//est� pr�xima linha dar� um erro de compila��o
		//livro = new Livro();
		//n�o podemos atribuir a uma variavel reference outra instancia de classe

	}

}
