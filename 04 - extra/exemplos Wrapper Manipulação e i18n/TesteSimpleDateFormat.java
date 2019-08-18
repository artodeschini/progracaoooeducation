import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TesteSimpleDateFormat {
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		System.out.println("data original " + d.toString() );
		String dataFmt = sdf.format(d);
		System.out.println("data formatada: " + dataFmt);
		
		String converte = "25/12/2012";
		Date d2 = null;
		try {
			d2 = sdf.parse(converte);
			System.out.println("data convertida: " + d2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
