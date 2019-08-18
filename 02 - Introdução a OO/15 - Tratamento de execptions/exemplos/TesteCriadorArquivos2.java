

public class TesteCriadorArquivos2 {
	
	public static void main(String[] args) {
		CriadorArquivos2 ca = new CriadorArquivos2();
		//Tentativa de chamarmos o codigo recem criado
		
		try {
			ca.criarArquivo("teste.txt");
		} catch (BussinesException e) {
			System.out.println(" --- handled Exception ---");
			System.out.println("Nao foi possivel criar o arquivo " + e.getMessage());
			System.out.println(" -------------------------");
		}
	}

}
