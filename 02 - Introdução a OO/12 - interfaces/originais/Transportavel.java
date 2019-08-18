
public interface Transportavel {
	
	//atributos
	//mesmo que esteje sao public static e final;
	String UNIDADE_VOLUME = "cm3";
	String UNIDADE_PESO = "Kg";
	
	//metodos
	//mesmo que nao esteje sao publicos e abstratos
	double getVolume();
	double getPeso();
	int getEmpilhamento();
}
