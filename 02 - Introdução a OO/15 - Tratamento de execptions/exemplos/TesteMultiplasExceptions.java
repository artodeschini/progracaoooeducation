

public class TesteMultiplasExceptions {
	
	public static void main(String[] args) {
		
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			
			double res = i / j;
			System.out.println(i + " / " + j + " = " + res);
			
		} catch (ArithmeticException e) {
			System.out.println(" --- handled Exception ---");
			System.out.println(" --- msg erro ao usr   ---");
			System.out.println("Divisao invalida ! " + e.getMessage());
			System.out.println("StackTrace");
			e.printStackTrace();
			System.out.println(" -------------------------");
		} catch (NumberFormatException e) {
			System.out.println(" --- handled Exception ---");
			System.out.println(" --- msg erro ao usr   ---");
			System.out.println("Dados invalidos ! " + e.getMessage());
			System.out.println("StackTrace");
			e.printStackTrace();
			System.out.println(" -------------------------");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" --- handled Exception ---");
			System.out.println(" --- msg erro ao usr   ---");
			System.out.println("Digite dois parametros no main ! " + e.getMessage());
			System.out.println("StackTrace");
			e.printStackTrace();
			System.out.println(" -------------------------");
		} finally {
			System.out.println("Passou pelo finally");
		}
	}

}
