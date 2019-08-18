
public class Unica {

	private static Unica u;
	
	private Unica() {
		
	}
	
	/**
	 * Só haverá uma instancia dessa classe em todo o sistema
	 * @return
	 */
	public static Unica getInstance() {
		if ( u == null ) {
			u = new Unica();
		}
		return u;
	}

}
