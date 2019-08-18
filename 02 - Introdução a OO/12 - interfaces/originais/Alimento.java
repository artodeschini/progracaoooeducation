
public class Alimento extends AlimentoBase implements Transportavel, Perecivel {
	
	private int empilhamento;
	private int diasValidade;

	public Alimento(String nome, int temperatura, double volumeCm3,int pesoGramas, int empilhamento, int validade) {
		super(nome, temperatura, volumeCm3, pesoGramas);
		this.empilhamento = empilhamento;
		this.diasValidade = validade;
		
	}

	@Override
	public int getTemperaturaConservacao() {
		return super.getTemperatura();
	}

	@Override
	public int getDiasValidade() {
		return this.diasValidade;
	}

	@Override
	public double getVolume() {
		return super.getVolumeCm3();
	}

	@Override
	public double getPeso() {
		return super.getPesoGramas() / 1000;
	}

	@Override
	public int getEmpilhamento() {
		return this.empilhamento;
	}

	//gets e sets
	public void setEmpilhamento(int empilhamento) {
		this.empilhamento = empilhamento;
	}

	public void setDiasValidade(int diasValidade) {
		this.diasValidade = diasValidade;
	}

}