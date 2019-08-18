import java.io.IOException;


public class TesteCriadorArquivos1 {
	
	public static void main(String[] args) {
		CriadorArquivos1 ca = new CriadorArquivos1();
		//Tentativa de chamarmos o codigo recem criado
		
		try {
			ca.criarArquivo("teste.txt");
		} catch (IOException e) {
			System.out.println(" --- handled Exception ---");
			System.out.println("Nao foi possivel criar o arquivo " + e.getMessage());
			System.out.println(" -------------------------");
		}
	}

}
