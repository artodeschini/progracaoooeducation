
/**
 * 
 * @author artur
 * @since 7/8/2013
 * @see <a href="http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html">ArrayList</a>
 * 
 * Classe foi criada para demostrar como encapsular de maneira inteligente um atributo array
 */
public class DepartamentoMelhorado {
	
	private String nome;
	private Pessoa[] pessoas;
	private int numeroPosicoesLivres;
	
	public DepartamentoMelhorado() {
		this.pessoas = new Pessoa[10];
		numeroPosicoesLivres = 10;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * @deprecated
	 * observar como isso pode ser devastador 
	 * um array é uma referencia e pode ser alterado fora da classe
	 * podendo estragar toda uma forma de encapsulamento
	 * 
	 * @return Pessoa[]
	 */
	public Pessoa[] getPessoas() {
		return pessoas;
	}
	
	/**
	 * @deprecated
	 * observar como isso pode ser devastador
	 * O que acontece com as referencias que já se encontravam no array originalmente?
	 * 
	 * @param Pessoa[] pessoas
	 */
	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
		
		int livres = 0;
		
		for (Pessoa pessoa : pessoas) {
			if ( pessoa == null ) {
				livres++;
			}
		}
		numeroPosicoesLivres = livres;
	}
	
	public int getNumeroPosicoesLivres() {
		return numeroPosicoesLivres;
	}
	
	public void imprime() {
		System.out.println("--------------------------");
		System.out.println("Departamento " + nome);
		
		if ( pessoas != null ) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if ( numeroPosicoesLivres > this.pessoas.length ) {
					System.out.println( this.pessoas[i].getNome() );
				}
			}
		} else {
			System.out.println("Nao ha pessoas neste departamente");
		}
		System.out.println("--------------------------");
	}
	
	/**
	 * metodo que encapsula um array adicionando Pessoas uma a uma
	 * escondendo do programador a lógica de arrays
	 * @param Pessoa p
	 */
	public void addPessoa(Pessoa p) {
		System.out.println("Adicionado " + p.getNome() + " ao departamento");
		
		if ( numeroPosicoesLivres > 0) {
			
			System.out.println("Esistem " + numeroPosicoesLivres + " posicoes livres no departamento");
			this.pessoas[this.pessoas.length - numeroPosicoesLivres] = p;
			numeroPosicoesLivres--;
		} else {
			System.out.println("Aumentando a capacidade de pessoas no departamento");
			
			Pessoa[] copy = new Pessoa[this.pessoas.length + 10];
			//criando um array com mais 10 posicoes do original
			
			for (int i = 0; i < this.pessoas.length; i++) {
				copy[i] = this.pessoas[i];
			}
			
			pessoas = copy;
			numeroPosicoesLivres = 10;
		}
	}
	
	/**
	 * Procura uma pessoa pelo seu rg no array de pessoas
	 * @param String rg
	 * @return Pessoa
	 */
	public Pessoa getPessoa(long rg) {
		for (int i = 0; i < this.pessoas.length; i++) {
			if (  this.pessoas[i] != null &&  this.pessoas[i].getRg() == rg ) {
				return this.pessoas[i];
			}
		}
		// caso nao encontre retorne null
		return null;
	}
	
	/**
	 * Remove uma pessoa se ela tiver o rg repetido
	 * @param Pessoa p
	 * @return Pessoa
	 */
	public Pessoa removePessoa(Pessoa p) {
		long rg = p.getRg();
		
		int i = 0;
		
		while ( i < this.pessoas.length - numeroPosicoesLivres) {
			if ( this.pessoas[i] != null &&  this.pessoas[i].getRg() == rg ) {
				Pessoa removido = pessoas[i];
				pessoas[i] = this.pessoas[ (this.pessoas.length -1) - numeroPosicoesLivres];
				pessoas[ ( this.pessoas.length -1 ) - numeroPosicoesLivres] = null;
				numeroPosicoesLivres++;
				System.out.println( removido.getRg() + " Foi removido do departamento");
				return removido;
			}
			i++;
		}
		return null;
	}

}
