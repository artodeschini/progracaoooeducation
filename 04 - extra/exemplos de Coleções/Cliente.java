
//repare que essa classe n�o implementa nenhuma interface
public class Cliente {
	 
	private String nome;
	private int id;
	
	public Cliente(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//sobrescrevemos toString para mostrar as informacoes posteriormente
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", id=" + id + "]";
	}

}
