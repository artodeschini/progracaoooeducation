import java.util.Comparator;

/*
 * Veja essa classe implementa a interface Comparator
 * faremos essa classe com tipagem Comparator<Cliente>
 * e a outra ComparadorByName sem a tipagem
 */
public class ComparadorById implements Comparator<Cliente> {

	@Override
	public int compare(Cliente c1, Cliente c2) {
		return c1.getId() - c2.getId();
	}

}
