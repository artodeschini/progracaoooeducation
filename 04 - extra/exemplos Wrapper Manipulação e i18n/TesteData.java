import java.util.Date;


public class TesteData {
	
	public static void main(String[] args) {
		//data atual
		Date agora = new Date();
		System.out.println("agora: " + agora);
		
		//data 01/jan/1970 00h/00m/00s + x millsegundos
		Date instancex = new Date(10800000l);
		System.out.println("instancex: " + instancex);
		
		//capturando a diferença (long) de milisegundos entre
		//objetos instancex e agora
		long diferenca = agora.getTime() - instancex.getTime();
		System.out.println("diferença de tempo " + diferenca);
		
		//05/fev/1998 construtor deprecated
		Date other = new Date(98,1,5);
		System.out.println("outra data " + other);
		
		//16/dez/2009 14h37m19s construtor deprecated
		Date dateTime = new Date(109,11,16,14,37,19);
		System.out.println("data com hora " + dateTime);
		
		//capturando informações parciais
		//metodos deprecated
		int ano = dateTime.getYear();
		int mes = dateTime.getMonth();
		int diaMes = dateTime.getDate();
		int diaSemana = dateTime.getDay();
		int horas = dateTime.getHours();
		int minutos = dateTime.getMinutes();
		int segundos = dateTime.getSeconds();

	}

}
