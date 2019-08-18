import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class TesteLocale {
	
	public static void main(String[] args) {
		Locale franca = Locale.FRENCH;
		Locale alemanha = Locale.GERMANY;
		Locale eua = Locale.US;
		Locale brasil =  new Locale("pt", "BR");
		Locale[] langs = { franca, alemanha, eua, brasil };
		
		Date d = new Date();
		System.out.println("data " + d.toString() );
		
		for (Locale local : langs) {
			SimpleDateFormat sdf = new SimpleDateFormat("EEEE MMMM dd", local);
			System.out.println("Locale: " + local.getDisplayCountry() );
			System.out.println(sdf.format( d ) );
		}
	}

}
