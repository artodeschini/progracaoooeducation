
public class FomatatadorModeloB extends FormatadorRecibo {
	
	private String simboloMoeda;

	public String getSimboloMoeda() {
		return simboloMoeda;
	}

	public void setSimboloMoeda(String simboloMoeda) {
		this.simboloMoeda = simboloMoeda;
	}
	//comente o m�todo concreto gerarRecibo em FormatadorRecibo
	//e descomente o m�todo abstract e essa classe n�o compilar�
	//pois ser� obrigada a ter uma m�todo gerarRecibo definido como contrato
	
	//corre��o para a classe compilar
	//sobreescrevermos o metodo gerarRecibo
//	@Override
//	public String gerarRecibo(String nomeCliente, double valor, String data,String motivo) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("N�s da ").append( super.getNomeEmpresa() );
//		sb.append(" recebemos de ").append( nomeCliente );
//		sb.append(" em ").append(data);
//		sb.append(" o valor de ").append(simboloMoeda).append(" ").append(valor);
//		sb.append(" referente a").append(motivo);
//		
//		return sb.toString();
//	}
 
}
