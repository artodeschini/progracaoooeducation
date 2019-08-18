
public class Endereco {
	
	private String rua;
	private int numero;
	
	public Endereco(String rua, int numero) throws NumeroInvalidoException1 {
		this.setRua(rua);
		this.setNumero(numero);
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) throws NumeroInvalidoException1 {
		if ( numero > 0) {
			this.numero = numero;
		} else {
			throw new NumeroInvalidoException1(numero + " nao e valido");
		}
	}
	

}
