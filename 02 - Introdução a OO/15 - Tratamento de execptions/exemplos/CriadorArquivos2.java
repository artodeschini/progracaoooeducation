import java.io.File;
import java.io.IOException;


public class CriadorArquivos2 {
	
	public void criarArquivo(String nome) throws BussinesException {
		
		try {
			//Criancao de um objeto de classe
			//File representa o arquivo com o nome
			File f = new File(nome);
			//tentativa de criar um arquivo em disco
			//agora compila pois lançamos (throws) IOException
			f.createNewFile();
			
		} catch (IOException e) {
			throw new BussinesException("Erro ao criar o arquivo ", e);
		}
	}	

}
