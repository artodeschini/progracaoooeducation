
public class TesteFuncionario {

	public static void main(String[] args) {
		Endereco e =  new Endereco("SC 401", 3730);
		
		Funcionario f = new Funcionario();
		//metodos de Pessoa
		f.setNome("Funcionario f1");
		f.setEndereco(e);
		f.setRg("123456");
		
		//metodos de funcionario
		f.setSalario(10000.0);
		f.setCarteira(1234L);

		//metodo de pessoa
		f.imprime();

		//teste modificador private e proteted
		//f.imprimeRecibo(16, 5, 2012);
		
		//teste toString
		//System.out.println(f);
	}

}
