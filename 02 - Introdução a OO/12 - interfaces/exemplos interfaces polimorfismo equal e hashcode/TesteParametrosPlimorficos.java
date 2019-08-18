
public class TesteParametrosPlimorficos {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Pessoa1");
		p1.setRg(123456789L);
		
		Cliente c1 = new Cliente();
		c1.setNome("Cliente1");
		c1.setRg(987654L);
		c1.setCpf("123.456.789/00");
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Funcionario1");
		f1.setRg(456L);
		f1.setSalario(5000.0d);
		f1.setCarteiraProfissional("SC/123456");
		
		Pessoa[] pessoas = {p1, c1, f1};
		
		RelatorioPessoas relatorio = new RelatorioPessoas();
		relatorio.imprimeArrya(pessoas);
		
	}

}
