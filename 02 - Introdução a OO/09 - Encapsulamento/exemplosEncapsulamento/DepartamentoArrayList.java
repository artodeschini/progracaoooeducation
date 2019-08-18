import java.util.ArrayList;


public class DepartamentoArrayList {

	private String nome;
	private ArrayList<Pessoa> pessoas;
	
	public DepartamentoArrayList() {
		this("", new ArrayList<Pessoa>());
	}
	
	public DepartamentoArrayList(String nome, ArrayList<Pessoa> pessoas) {
		this.setNome(nome);
		this.pessoas = pessoas;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void imprime() {
		System.out.println("--------------------------");
		System.out.println("Departamento " + nome);
		
		if ( pessoas != null ) {
			for (Pessoa p : pessoas) {
				if ( p != null ) {
					System.out.println( p.getNome() );
				}
			}
		} else {
			System.out.println("Nao ha pessoas neste departamente");
		}
		System.out.println("--------------------------");
	}
}
