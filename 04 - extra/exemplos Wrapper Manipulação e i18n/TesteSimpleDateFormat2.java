import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TesteSimpleDateFormat2 {
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("'São Paulo', EEEE dd 'de' MMMM 'de' yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss S'ms'");
		
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, 25);
		c.set(Calendar.MONTH, Calendar.DECEMBER);
		c.set(Calendar.YEAR, 2012);
		
		System.out.println("data original " + c.getTime().toString() );
		String dataFmt = sdf.format( c.getTime() );
		System.out.println("data formatada: " + dataFmt);
		
		System.out.println("data original " + c.getTime().toString() );
		String dataFmt2 = sdf2.format( c.getTime() );
		System.out.println("data formatada: " + dataFmt2);
		

	}
}
