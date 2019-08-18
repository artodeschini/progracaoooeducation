
public class TesteRunTime1 {
	
	public static void main(String[] args) {
		int i = 23;
		int j = 0;
		//erro de RunTime
		
		try {
			double res = i / j;
			System.out.println(i + " / " + j + " = " + res);
		} catch (ArithmeticException ae) {
			System.out.println(" --- handled Exception ---");
			System.out.println("Divisao invalida ! " + ae.getMessage());
			System.out.println("StackTrace");
			ae.printStackTrace();
			System.out.println(" -------------------------");
		}
	}

}
