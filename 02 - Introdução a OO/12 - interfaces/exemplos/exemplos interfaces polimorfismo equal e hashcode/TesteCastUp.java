
public class TesteCastUp {

	public static void main(String[] args) {
		//ok temos um objeto do tipo cliente declarado com cliente;
		Cliente c = new Cliente();
		
		//Cast up explicit do objeto Cliente para classe Pessoa
		Pessoa p = (Pessoa) c;
		
		//Cast up do objeto Cliente para classe Pessoa
		Pessoa p2 = c;
		
		//Cast up do objeto classe cliente para Pessoa
		Pessoa p3 = new Cliente();
		
		//Cast up explicito do objeto da classe Cliente para classe Objetc
		Object o = (Object) c;
		
		//Casting up objeto da classe Cliente para Object
		Object o2 = c;

	}

}
