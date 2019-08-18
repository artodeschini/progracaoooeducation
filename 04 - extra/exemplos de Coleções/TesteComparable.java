import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TesteComparable {
	
	public static void main(String[] args) {
		Set<String> nomes = new TreeSet<String>();
		nomes.add("Joao");
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add("Alberto");
		
		Set<Integer> numeros = new TreeSet<Integer>();
		numeros.add(9);
		numeros.add(9);//duplicado
		numeros.add(129);
		numeros.add(8);
		numeros.add(6);
		//iterator tipado com String
		//Perceba que os resultados foram mostrados ordenados
		System.out.println("Tipado Set<String>");
		for (String n : nomes) {
			System.out.println(n);
		}
		
		//iterator nao tipado
		//Perceba que os resultados foram mostrados ordenados
		System.out.println("Não tipado Set");
		Iterator it = nomes.iterator();
		while (it.hasNext() ) {
			System.out.println(it.next());
		}
		
		//Observe que ele ordenou os numeros e eliminou o 9 duplicado
		System.out.println("Tipado Set<Integer>");
		for (Integer i : numeros) {
			System.out.println(i);
		}
	}

}
