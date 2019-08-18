
public class TesteRecibo {

	public static void main(String[] args) {
		FormatadorRecibo fr;
		//Essa linha não irá compilar
		//fr = new FormatadorRecibo();
		
		//Ok o objeto fr do tipo FormatadorRecibo está recebendo
		//uma de suas classes filhas
		fr = new FormatadorModeloA();
		fr.setNomeEmpresa("Senai/SC");
		String recibo = fr.gerarRecibo("Catia", 110.0, "18/5/2012", "telefone");

		System.out.println(recibo);
	}

}
