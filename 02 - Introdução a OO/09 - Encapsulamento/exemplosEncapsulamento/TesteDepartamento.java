
public class TesteDepartamento {

	public static void main(String[] args) {
		//criacao das pessoas para o array de pessoas do departamento
		Pessoa p1 = new Pessoa();
		p1.setNome("A");
		p1.setRg(1);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("B");
		p2.setRg(2);
		
		//criando o array de pessoas para o departamento;
		Pessoa[] colaboradores = { p1, p2 };
		DepartamentoMelhorado dm = new DepartamentoMelhorado();
		dm.setNome("Departamento Pessoal");
		dm.setPessoas(colaboradores);
		System.out.println("Departamento recem criado");
		dm.imprime();
		
		//criando nova Pessoa
		Pessoa np = new Pessoa();
		np.setNome("C");
		np.setRg(3);
		
		//adicionado a pessoa criado ao departamento;
		dm.addPessoa(np);
		dm.imprime();
		
		//retirando p1 do departamento
		dm.removePessoa(p1);
		dm.imprime();
		
		//procurando a pessoa com rg 3
		System.out.println("Procurando a pessoa com rg = 3");
		Pessoa filtro = new Pessoa();
		filtro.setRg(3);
		filtro.setNome("Teste remocao");
		
		dm.imprime();
		
		DepartamentoArrayList da = new DepartamentoArrayList();
		da.setNome("Almoxarifado");
		da.getPessoas().add( p1 );
		da.getPessoas().add( p2 );
		da.getPessoas().add( new Pessoa("Almoxarife", 4));
		
		da.imprime();
		
		da.getPessoas().remove( p1 );
		da.imprime();
	}

}
