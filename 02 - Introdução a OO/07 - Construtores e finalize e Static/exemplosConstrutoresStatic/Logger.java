

import java.util.Date;

public class Logger {
	
	private static int qtLogs;
	
	public static void log(String msg) {
		System.out.println(new Date() + " : quantidade de logs: " + qtLogs + " " + msg);
		qtLogs++;
	}

}
