
public class TesteOperadorInstanceOf {


	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		//cast up de Cliente para Pessoa
		Pessoa p = c;
		
		//cast down de pessoa para cliente;
		Cliente c2 = (Cliente) p;
		
		//criando uma instancia de Pessoa
		Pessoa p2 = new Pessoa();
		
		//cast down invalido de pessoa para Cliente
		//n‹o tem todos os dados necessarios para criar um Cliente
		//vai compilar mas vai dar um erro de Runtime ClassCastException
		Cliente c3 = (Cliente) p2;
	}

}
