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
		//estamos adicionado os enderecos no Set
		enderecos.add(e1);
		enderecos.add(e2);
		enderecos.add(e3);
		
		//Sem tipagem E
		Set enderecos2 = new HashSet();
		enderecos2.add(e1);
		enderecos2.add(e2);
		enderecos2.add(e3);
		
		Iterator<Endereco> it = enderecos.iterator();
		Iterator it2 = enderecos2.iterator();
		
		System.out.println("Lista de endereco tipados E");
		
		while ( it.hasNext() ) {
			Endereco e = it.next();
			System.out.println(e.toString());
		}
		
		//Sem tipagem
		System.out.println("Lista de endereco nao tipados ");
		
		while ( it2.hasNext() ) {
			Endereco e = (Endereco) it2.next();
			System.out.println(e.toString());
		}
	}

}
