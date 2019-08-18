import java.util.Comparator;

/*
 * Veja essa classe implementa a interface Comparator
 * faremos essa classe sem tipagem Comparator
 * e a outra ComparadorById com a tipagem Comparator<Cliente>
 */
public class ComparadorByNome implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Cliente c1 = (Cliente) o1;
		Cliente c2 = (Cliente) o2;
		//lembrando que nome em Cliente é do tipo String
		//Chamamos o metodo de String compareToIgnoreCase
		return c1.getNome().compareToIgnoreCase(c2.getNome());
	}

}
