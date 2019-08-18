
public class Mobilia implements Transportavel {
	
	private String tipo;
	private String fabricante;
	private String material;
	private double altura, largura, profundidade, peso;
	
	
	public Mobilia(String tipo, String fabricante, String material,
			double altura, double largura, double profundidade, double peso) {
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.material = material;
		this.altura = altura;
		this.largura = largura;
		this.profundidade = profundidade;
		this.peso = peso;
	}

	//metodos da interface Transportavel
	@Override
	public double getVolume() {
		return altura * largura * profundidade;
	}

	@Override
	public double getPeso() {
		return peso;
	}

	@Override
	public int getEmpilhamento() {
		return 2;
	}

	//gets e sets
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(double profundidade) {
		this.profundidade = profundidade;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
