
public class Pessoa {
	protected String nome, rg;
	private Endereco endereco;

//	para uso em construtores x herança	
//	public Pessoa(String nome, String rg, Endereco endereco) {
//		this.nome = nome;
//		this.rg = rg;
//		this.endereco = endereco;
//	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void imprime() {
		System.out.println("Nome: " + this.getNome() );
		System.out.println("RG: " + this.getRg() );
		System.out.print("Enderecço: " + this.getEndereco().getRua() );
		System.out.println(", " + this.getEndereco().getNumero());
	}
//sobreescrita de toString	
//	@Override
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append("Nome: ");
//		sb.append(nome);
//		sb.append("\nRG ");
//		sb.append(rg);
//		sb.append("\nEndereço: ");
//		sb.append( endereco.getRua() );
//		sb.append( ",");
//		sb.append( endereco.getNumero() );
//		return sb.toString();
//	}
	
}
