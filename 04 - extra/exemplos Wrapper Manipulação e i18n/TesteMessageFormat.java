import java.text.MessageFormat;


public class TesteMessageFormat {
	
	public static void main(String[] args) {
		String msg = "Isto � um exemplo de {0} com {1}.";
		String mensagem = MessageFormat.format(msg, "i18n", "formata��o");
		System.out.println(mensagem);
	}

}
