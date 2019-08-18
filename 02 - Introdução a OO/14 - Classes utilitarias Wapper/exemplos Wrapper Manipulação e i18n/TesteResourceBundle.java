import java.util.Locale;
import java.util.ResourceBundle;


public class TesteResourceBundle {
	
	public static void main(String[] args) {
		Locale ptBR = new Locale("pt","BR");
		Locale deGE = Locale.GERMANY;
		Locale usa = new Locale("en", "US");
		
		ResourceBundle bundle = ResourceBundle.getBundle("messages");
		System.out.println( bundle.getString("welcome"));
		
		ResourceBundle bundle_BR = ResourceBundle.getBundle("messages", ptBR);
		System.out.println( bundle_BR.getString("welcome"));
		
		ResourceBundle bundle_GE = ResourceBundle.getBundle("messages", deGE);
		System.out.println( bundle_GE.getString("welcome"));
		
		ResourceBundle bundle_US = ResourceBundle.getBundle("messages", usa);
		System.out.println( bundle_US.getString("welcome"));
	}

}
