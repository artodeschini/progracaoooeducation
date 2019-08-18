import java.io.File;
import java.io.IOException;


public class CriadorArquivos1 {
	
	public void criarArquivo(String nome) throws IOException {
		//Criancao de um objeto de classe
		//File representa o arquivo com o nome
		File f = new File(nome);
		//tentativa de criar um arquivo em disco
		//agora compila pois lançamos (throws) IOException
		f.createNewFile();
	}	

}
