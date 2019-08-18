
public class RelatorioPessoas {
	
	public void imprime(Pessoa p){
		System.out.println("Nome: " +  p.getNome() + "\nRG: " + p.getRg() );
	}
	
	public int imprimeArrya(Pessoa[] pessoas) {
		int qtde = 0;
		for ( int i = 0 ; i < pessoas.length ; i ++ ) {
			imprime(pessoas[i]);
			qtde++;
		}
		return qtde;
	}
}
