import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TesteHashMap {

	public static void main(String[] args) {
		Map<Long, Pessoa> pessoas = new HashMap<Long, Pessoa>();
		//criando pessoa
		Pessoa p1 = new Pessoa(1, "Joao", "Silva");
		Pessoa p2 = new Pessoa(2, "Joana", "Soares");
		Pessoa p3 = new Pessoa(4, "Aline", "Santos");
		
		pessoas.put(p1.getRg(), p1);
		pessoas.put(p2.getRg(), p2);
		pessoas.put(p3.getRg(), p3);
		
		imprimeValores(pessoas);
		imprimeMapSemTipagem(pessoas);
		
		removeElemento(pessoas, 4L);
		
		imprimeValores(pessoas);
		imprimeMapSemTipagem(pessoas);
		
		//tetando achar novamente pessoa com RG 4
		removeElemento(pessoas, 4L);
	}

	public static void imprimeValores(Map<Long, Pessoa> pessoas) {
		System.out.println("imprimindo so os valores ");
		for (Pessoa p : pessoas.values()) {
			System.out.println(p);
		}

	}
	
	public static void removeElemento(Map<Long, Pessoa> m, long key) {
		Pessoa r = null; //pessoa removida
		
		if ( m.containsKey(key)) {
			System.out.println("Removendo pessoa do map ");
			//lembrar de não utilizassemos K,V teriamos que fazer um cast de objetos
			r = m.remove(key);
			System.out.println("Removida pessoa " + r);
			
		} else {
			System.out.println("Chave " + key + " não encontrada");
		}
		
	}
	
	public static void imprimeMapSemTipagem(Map m) {
		System.out.println("imprimindo o map com valores K, V Object, Object");
		//recuperamos todas as chaves de um Map em um Set
		Set chaves = m.keySet(); 
		Iterator it = chaves.iterator();
		
		while ( it.hasNext() ) {
			Object key = it.next();
			System.out.println("Chave:" + String.valueOf( key ) );
			System.out.println("Valor" + m.get( key ));
		}
		
	}

}
