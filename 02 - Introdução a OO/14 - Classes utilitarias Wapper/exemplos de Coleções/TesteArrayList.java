import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Criando instacias de Endereco
		Endereco e1 = new Endereco("r1", 1);
		Endereco e2 = new Endereco("r2", 2);
		Endereco e3 = new Endereco("r3", 3);
		
		//criando uma List de Endereco substituimos E por Endereco
		List<Endereco> enderecos = new ArrayList<Endereco>();
		//estamos adicionado os enderecos na list
		enderecos.add(e1);
		enderecos.add(e2);
		enderecos.add(e3);
		//isso não seria possivel pois TesteList nao e um Endereco  / ou herda o 
		//enderecos.add(new TesteList());
		
		//imprimido os enderecos;
		imprimeElementos(enderecos);
		
		Endereco removido = enderecos.remove(1);
		System.out.println("Removendo o enredeco " + removido.toString() );
		
		//imprimido os enderecos;
		imprimeElementos(enderecos);
		
	}
	
	private static void imprimeElementos(List<Endereco> enderecos) {
		//foreach do java intera sobre as coleçÁıes
		for (Endereco endereco : enderecos) {
			System.out.println(endereco.toString());
		}
		
		//forma caso de recuperar dados convencional
//		for (int i = 0; i < enderecos.size(); i++) {
//			System.out.println(enderecos.get(i).toString());
//		}
	}

}
