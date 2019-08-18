import java.io.File;


public class CriadorArquivos {
	
	public void criarArquivo(String nome) {
		//Criancao de um objeto de classe
		//File representa o arquivo com o nome
		File f = new File(nome);
		//tentativa de criar um arquivo em disco
		//Isso não vai compilar
		//f.createNewFile();
	}	

}
