import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TesteCollections1 {

	public static void main(String[] args) {
		
		//Cliente não implementa a interface Comparable
		Cliente c1 = new Cliente("Senai CTAI", 1);
		Cliente c2 = new Cliente("Senai Blumenau", 6);
		Cliente c3 = new Cliente("Senai Sao Jose", 2);
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);

		//Criamos uma instancia de ComparadorById
		System.out.println("Imrimindo a lista conforme a ordem de inclusao");
		
		for (Cliente c : clientes) {
			System.out.println(c);
		}
		
		ComparadorById cId = new ComparadorById();
		//vamos ordenar segundo o criterio
		//estabelecido em ComparadorById
		Collections.sort(clientes, cId );
		
		//java guarda a referencia da lista que foi reordenada
		System.out.println("Imrimindo a lista conforme a ordem do criterio");
		System.out.println("estabelecido em ComparadorById");
		for (Cliente c : clientes) {
			System.out.println(c);
		}
		
		ComparadorByNome cNome = new ComparadorByNome();
		//vamos ordenar segundo o criterio
		//estabelecido em ComparadorByNome
		Collections.sort(clientes, cNome );
		
		//java guarda a referencia da lista que foi reordenada
		System.out.println("Imrimindo a lista conforme a ordem do criterio");
		System.out.println("estabelecido em ComparadorByNome");
		for (Cliente c : clientes) {
			System.out.println(c);
		}
		
	}

}
