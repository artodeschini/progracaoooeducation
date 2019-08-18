import java.text.MessageFormat;


public class TesteMessageFormat {
	
	public static void main(String[] args) {
		String msg = "Isto é um exemplo de {0} com {1}.";
		String mensagem = MessageFormat.format(msg, "i18n", "formatação");
		System.out.println(mensagem);
	}

}
