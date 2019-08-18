class TestaData{
	public static void main(String[] args){
		Data d = new Data();	 
		d.dia = 12;
		d.mes = 1;
		d.ano = 2004;
		d.imprime();
		
		String bi = d.isAnoBissexto() ? " " : " nao ";
		System.out.println("O ano " + d.ano + " " + bi + "e bissexto");
		
		Data d2 = new Data(); 
		d2.imprime();
		
		d2.dia = -20;
		d2.mes = 23;
		d2.ano = 9;
		d2.imprime();
		
		String bi2 = d2.isAnoBissexto() ? " " : " nao ";
		System.out.println("O ano " + d2.ano + " " + bi2 + "e bissexto");
	}
}