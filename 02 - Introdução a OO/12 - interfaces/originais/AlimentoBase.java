
public abstract class AlimentoBase {
	
	private String nome;
	private int temperatura;
	private double volumeCm3;
	private int pesoGramas;
	
	public AlimentoBase(String nome, int temperatura, double volumeCm3, int pesoGramas) {
		this.nome = nome;
		this.temperatura = temperatura;
		this.volumeCm3 = volumeCm3;
		this.pesoGramas = pesoGramas;
	}
	
	//gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	public double getVolumeCm3() {
		return volumeCm3;
	}
	public void setVolumeCm3(double volumeCm3) {
		this.volumeCm3 = volumeCm3;
	}
	public int getPesoGramas() {
		return pesoGramas;
	}
	public void setPesoGramas(int pesoGramas) {
		this.pesoGramas = pesoGramas;
	}
	
}
