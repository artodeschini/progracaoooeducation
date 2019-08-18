
public class Data {
	
	private int dia, mes, ano;
	
	public Data() {
		this(1, 1, 1900);
	}
	
	public Data(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean isAnoBissexto() {
		if ( ( ano % 4 == 0) && !(ano % 100 == 0) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void imprime(){
		System.out.println(dia + "/" + mes + "/" + ano );
	}

}
