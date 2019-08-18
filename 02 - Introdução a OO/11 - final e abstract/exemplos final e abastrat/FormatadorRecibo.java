
public abstract class FormatadorRecibo {
	private String nomeEmpresa;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	//um m�todo comum
//	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo) {
//		return "m�todo em constru��o";
//	}
	
	//agora declara��o de m�todo abstract
	public abstract String gerarRecibo(String cliente, double v, String dt, String m);
}
