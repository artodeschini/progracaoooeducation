import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class TesteComparador {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Senai CTAI", 1);
		Cliente c2 = new Cliente("Senai Blumenau", 6);
		Cliente c3 = new Cliente("Senai Sao Jose", 2);
		
		//Criamos uma instancia de ComparadorById
		ComparadorById cId = new ComparadorById();
		//Perceba que estamos colocando em um Set
		//e passamos no construtor de TreeSet o comparado
		Set<Cliente> clientes = new TreeSet<Cliente>(cId);
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		System.out.println("ordenando clientes por ID");
		for (Cliente c : clientes) {
			//Invocaremos o metodo toString de Cliente
			System.out.println(c);
		}

		//criamos uma instancia de ComaradorByName
		ComparadorByNome cName = new ComparadorByNome();
		//Criamos outro Set com TreeSet passando para ele cName
		Set clientes2 = new TreeSet(cName);
		//Adicionamos todos os elementos de clientes em clientes2
		//com o uso do metodo addAll
		clientes2.addAll( clientes );
		
		System.out.println("ordenando clientes por Nome");
		
		Iterator it = clientes2.iterator();
		while ( it.hasNext() ) {
			//Invocaremos o metodo toString de Cliente
			System.out.println( it.next() );
		}
	}

}
