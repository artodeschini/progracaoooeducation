
public class FomatatadorModeloB extends FormatadorRecibo {
	
	private String simboloMoeda;

	public String getSimboloMoeda() {
		return simboloMoeda;
	}

	public void setSimboloMoeda(String simboloMoeda) {
		this.simboloMoeda = simboloMoeda;
	}
	//comente o método concreto gerarRecibo em FormatadorRecibo
	//e descomente o método abstract e essa classe não compilará
	//pois será obrigada a ter uma método gerarRecibo definido como contrato
	
	//correção para a classe compilar
	//sobreescrevermos o metodo gerarRecibo
//	@Override
//	public String gerarRecibo(String nomeCliente, double valor, String data,String motivo) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("Nós da ").append( super.getNomeEmpresa() );
//		sb.append(" recebemos de ").append( nomeCliente );
//		sb.append(" em ").append(data);
//		sb.append(" o valor de ").append(simboloMoeda).append(" ").append(valor);
//		sb.append(" referente a").append(motivo);
//		
//		return sb.toString();
//	}
 
}
