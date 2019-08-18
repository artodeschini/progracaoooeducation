package staticos;

public class TesteLooger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger.log("Direto da classe");
		
		Logger l1 = new Logger();
		l1.log("l1");
		
		Logger l2 = new Logger();
		l2.log("l2");
		
		Logger.log("Direto da classe novamente");
	}

}
