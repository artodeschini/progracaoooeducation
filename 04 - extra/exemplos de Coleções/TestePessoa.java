import java.util.Set;
import java.util.TreeSet;


public class TestePessoa {
	
	public static void main(String[] args) {
		//criando pessoa
		Pessoa p1 = new Pessoa(1, "Joao", "Silva");
		Pessoa p2 = new Pessoa(2, "Joana", "Soares");
		Pessoa p3 = new Pessoa(4, "Aline", "Santos");
		
		Set<Pessoa> pessoas = new TreeSet<Pessoa>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		System.out.println("Listando pessoas");
		for (Pessoa p : pessoas) {
			//podemos mostrar todos os dados do 
			//objeto p pois sobrescrevemos o metodo toString em Pessoa
			System.out.println(p);
		}
	}

}
