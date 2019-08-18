import java.util.Calendar;
import java.util.Date;


public class TesteCalendarInstance {

	public static void main(String[] args) {
		//data atual
		Calendar c = Calendar.getInstance();
		//o método getTime retorna um objeto java.util.Date
		Date d = c.getTime();
		System.out.println("data em c: " + d.toString() );
		
		long timeMillisegundos = c.getTimeInMillis();
		long _2horas = 2 * 3600 * 1000l; //2 horas em milisegundos
		c.setTimeInMillis(timeMillisegundos - _2horas);
		System.out.println("data ajustada em c: " + c.getTime().toString() );
		
		//data atual
		Calendar c2 = Calendar.getInstance();
		Date d2 = c2.getTime();
		System.out.println("data em c2" + d2.toString());
		d2.setYear(99); //setando o ano para 1999
		c2.setTime(d2);
		System.out.println("data ajustada em c2: " + c2.getTime().toString());
	}	
}
