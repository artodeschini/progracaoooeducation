
public class FormatadorModeloA extends FormatadorRecibo {

	
	@Override
	public String gerarRecibo(String nomeCliente, double valor, String data,String motivo) {
		StringBuilder sb = new StringBuilder();
		sb.append("Nós da ").append( super.getNomeEmpresa() );
		sb.append(" recebemos de ").append( nomeCliente );
		sb.append(" em ").append(data);
		sb.append(" o valor de R$ ").append(valor);
		sb.append(" referente a").append(motivo);
		
		return sb.toString();
	}
	
}
