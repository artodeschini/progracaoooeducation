import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class TesteHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Criando instacias de Endereco
		Endereco e1 = new Endereco("r1", 1);
		Endereco e2 = new Endereco("r2", 2);
		Endereco e3 = new Endereco("r3", 3);
		
		Set<Endereco> enderecos = new HashSet<Endereco>();
		//estamos adicionado os enderecos na list
		enderecos.add(e1);
		enderecos.add(e2);
		enderecos.add(e3);
		
		Iterator<Endereco> it = enderecos.iterator();
		System.out.println("Lista de endereco");
		
		while ( it.hasNext() ) {
			//Str
		}
	}

}
