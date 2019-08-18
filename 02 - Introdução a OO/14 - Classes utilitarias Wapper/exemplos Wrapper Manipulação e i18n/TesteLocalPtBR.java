import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class TesteLocalPtBR {

	public static void main(String[] args) {
		// Locale portugues Brasil
		Locale brasil = new Locale("pt", "BR");

		// Datas
		Date agora = new Date();

		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,brasil);
		System.out.println(dateFormat.format(agora));

		DateFormat timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM,brasil);
		System.out.println(timeFormat.format(agora));

		// para números
		NumberFormat numberFormat = NumberFormat.getNumberInstance(brasil);
		System.out.println(numberFormat.format(13.23));

		// para moedas
		NumberFormat moedaFormat = NumberFormat.getCurrencyInstance(brasil);
		System.out.println(moedaFormat.format(13.23));
		
		try {
			System.out.println(dateFormat.parse( "Sexta-feira, 21 de Setembro de 2007"));
			System.out.println(timeFormat.parse("00:58:16"));
			System.out.println(numberFormat.parse("13,23"));
			System.out.println(moedaFormat.parse("R$ 13,23"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
