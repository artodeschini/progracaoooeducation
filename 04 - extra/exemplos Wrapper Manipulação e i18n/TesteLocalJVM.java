import java.util.Locale;


public class TesteLocalJVM {

	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		
		System.out.println("Vendo as configuracao padrao do java na sua maquina");
		System.out.println(l.getLanguage());
		System.out.println(l.getCountry());
	}
}
