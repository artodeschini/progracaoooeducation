
public class Departamento {
	
	private String nome;
	private Pessoa[] pessoas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @deprecated
	 * @return
	 */
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	
	/**
	 * @deprecated
	 */
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
	
	public void imprime() {
		System.out.println("--------------------------");
		System.out.println("Departamento " + nome);
		
		if ( pessoas != null) {
			for (int i = 0; i < pessoas.length; i++) {
				System.out.println(pessoas[i].getNome());
			}
		} else {
			System.out.println("Nao ha pessoas neste departamente");
		}
		System.out.println("--------------------------");
	}

}
