
public class GalaoCombustivel implements Inflamavel {
	
	private String nomeCombustivel;
	private double dnsidade;
	private int temperaturaTransporte;
	
	
	
	public GalaoCombustivel(String nomeCombustivel, double dnsidade, int temperaturaTransporte) {
		this.nomeCombustivel = nomeCombustivel;
		this.dnsidade = dnsidade;
		this.temperaturaTransporte = temperaturaTransporte;
	}

	//metodo de Inflamavel
	@Override
	public int getTemperaturaMaxima() {
		return (int) (temperaturaTransporte * 1.4d);
	}

	//metodos de Transportavel
	@Override
	public double getVolume() {
		return 3785d; //galao = 3,785 Litros
	}

	@Override
	public double getPeso() {
		return (getVolume() * dnsidade) / 1000 ;
	}

	@Override
	public int getEmpilhamento() {
		return 3;
	}

	//gets e sets
	public String getNomeCombustivel() {
		return nomeCombustivel;
	}

	public void setNomeCombustivel(String nomeCombustivel) {
		this.nomeCombustivel = nomeCombustivel;
	}

	public double getDnsidade() {
		return dnsidade;
	}

	public void setDnsidade(double dnsidade) {
		this.dnsidade = dnsidade;
	}

	public int getTemperaturaTransporte() {
		return temperaturaTransporte;
	}

	public void setTemperaturaTransporte(int temperaturaTransporte) {
		this.temperaturaTransporte = temperaturaTransporte;
	}

}
