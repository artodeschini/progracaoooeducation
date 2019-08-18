
public class Pessoa implements Comparable<Pessoa> {

	private long rg;
	private String nome, sobrenome;
	
	public Pessoa(long rg, String nome, String sobrenome) {
		this.rg = rg;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public long getRg() {
		return rg;
	}
	public void setRg(long rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	/*
	 * Observe que sobrescrevemos equals e hashcode
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + (int) (rg ^ (rg >>> 32));
		result = prime * result
				+ ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (rg != other.rg)
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
	@Override
	public int compareTo(Pessoa p) {
		String dadosThis = this.nome + this.sobrenome + this.rg;
		String dadosOther = p.nome + p.sobrenome + p.rg;
		return dadosThis.compareTo(dadosOther);
	}
	@Override
	public String toString() {
		return "Pessoa [rg=" + rg + ", nome=" + nome + ", sobrenome="
				+ sobrenome + "]";
	}

	
}
