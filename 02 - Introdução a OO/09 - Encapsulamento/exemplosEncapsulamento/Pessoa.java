
public class Pessoa {
	
	private String nome;
	private long rg;
	
	public Pessoa() {
		this("", 0l);
	}
	
	public Pessoa(String nome, long rg) {
		this.setNome(nome);
		this.setRg(rg);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	
	
}
