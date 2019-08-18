import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TesteCollections {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		//criando pessoas
		//Verifique que a classe Pessoa
		//implementa compareTo
		Pessoa p1 = new Pessoa(1, "Joao", "Silva");
		Pessoa p2 = new Pessoa(2, "Joana", "Soares");
		Pessoa p3 = new Pessoa(4, "Aline", "Santos");
		
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		System.out.println("Imrimindo a lista conforme a ordem de inclusao");
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		//vamos ordenar segundo o criterio
		//estabelecido em compareTo de pessoa agora
		Collections.sort(pessoas);
		
		//java guarda a referencia da lista que foi reordenada
		System.out.println("Imrimindo a lista conforme a ordem do criterio");
		System.out.println("estabelecido em compareTo da Classe Pessoa");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}
