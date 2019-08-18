
public class TesteCastDown {


	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		
		if ( p instanceof Pessoa) {
			Cliente c = (Cliente) p;//cast down seguro
			System.out.println("cpf " + c.getCpf() );
			
		} else if ( p instanceof Funcionario) {
			Funcionario f = (Funcionario) p;
			System.out.println("Salario " + f.getSalario() );
		
		} else {
			System.out.println("N‹o Ž um Cliente e nem Funcionario");
		}
	}

}
