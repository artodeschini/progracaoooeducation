import java.util.Calendar;


public class TesteCalendarManipulacao {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int minutos = c.get(Calendar.MINUTE);
		int mes = c.get(Calendar.MINUTE);
		System.out.println("agora: " + c.getTime().toString() );
		
		//dia 10 as 21h 3 anos atras
		c.add(Calendar.YEAR, -3);
		c.set(Calendar.DAY_OF_MONTH, 10);
		c.set(Calendar.HOUR_OF_DAY, 21);
		System.out.println("dia 10 as 21h, 3 anos atras " + c.getTime().toString() );
		
		//objeto c ajustado para representar 2h da madrugada
		c.add(Calendar.HOUR_OF_DAY, 5); // + 5 horas
		System.out.println("+ 5 horas com add: " + c.getTime().toString());
		
		//9 da noite do dia 10
		c.set(Calendar.DAY_OF_MONTH, 10);
		c.set(Calendar.HOUR_OF_DAY, 21);
		
		//o objeto c representa as 2 horas da madrugada do dia 10
		c.roll(Calendar.HOUR_OF_DAY, 5); // +5 horas
		System.out.println("+ 5 horas com add: " + c.getTime().toString());
	}

}
