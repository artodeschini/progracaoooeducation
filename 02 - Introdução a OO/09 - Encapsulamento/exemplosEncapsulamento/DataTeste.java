
class DataTeste {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.setDia(20);
		d.setMes(4);
		d.setAno(2012);
		
		d.imprime();
		
		String str = d.isAnoBissexto() ? "" : " nao ";
		
		System.out.println("O ano " + str + "e dissexto");
	}

}
