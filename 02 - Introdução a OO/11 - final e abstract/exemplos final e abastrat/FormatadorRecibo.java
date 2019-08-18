
public abstract class FormatadorRecibo {
	private String nomeEmpresa;

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	//um método comum
//	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo) {
//		return "método em construção";
//	}
	
	//agora declaração de método abstract
	public abstract String gerarRecibo(String cliente, double v, String dt, String m);
}
