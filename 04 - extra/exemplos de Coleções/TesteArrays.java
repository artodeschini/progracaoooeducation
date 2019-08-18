import java.util.Arrays;
import java.util.Collections;

public class TesteArrays {


	public static void main(String[] args) {
		
		//criando pessoas
		//Verifique que a classe Pessoa
		//implementa compareTo
		Pessoa p1 = new Pessoa(1, "Joao", "Silva");
		Pessoa p2 = new Pessoa(2, "Joana", "Soares");
		Pessoa p3 = new Pessoa(4, "Aline", "Santos");
		
		//Cliente não implementa a interface Comparable
		Cliente c1 = new Cliente("Senai CTAI", 1);
		Cliente c2 = new Cliente("Senai Blumenau", 6);
		Cliente c3 = new Cliente("Senai Sao Jose", 2);
		
		Pessoa[] pessoas = {p1,p2, p3};
		Cliente[] clientes = {c1,c2,c3};
		
		System.out.println("Teste com Pessoa que implementa Comparable");
		System.out.println("Imrimindo o array conforme a ordem de inclusao");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		//vamos ordenar segundo o criterio
		//estabelecido em compareTo de pessoa agora
		Arrays.sort(pessoas);
		
		//java guarda a referencia do array que foi reordenado
		System.out.println("Imrimindo o array conforme a ordem do criterio");
		System.out.println("estabelecido em compareTo da Classe Pessoa");
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		//Testando com clientes agora
		System.out.println("Teste com Cliente que nao implementa Comparable");
		//Criamos uma instancia de ComparadorById
		System.out.println("Imrimindo o array conforme a ordem de inclusao");
		
		for (Cliente c : clientes) {
			System.out.println(c);
		}
		
		ComparadorById cId = new ComparadorById();
		//vamos ordenar segundo o criterio
		//estabelecido em ComparadorById
		Arrays.sort(clientes, cId );
		
		//java guarda a referencia da lista que foi reordenada
		System.out.println("Imrimindo o array conforme a ordem do criterio");
		System.out.println("estabelecido em ComparadorById");
		for (Cliente c : clientes) {
			System.out.println(c);
		}
		
		ComparadorByNome cNome = new ComparadorByNome();
		//vamos ordenar segundo o criterio
		//estabelecido em ComparadorByNome
		Arrays.sort(clientes, cNome );
		
		//java guarda a referencia da lista que foi reordenada
		System.out.println("Imrimindo o array conforme a ordem do criterio");
		System.out.println("estabelecido em ComparadorByNome");
		for (Cliente c : clientes) {
			System.out.println(c);
		}

	}

}
