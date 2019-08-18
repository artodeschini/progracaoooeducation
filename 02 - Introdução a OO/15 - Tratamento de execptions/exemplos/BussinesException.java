
public class BussinesException extends Exception {

	private static final long serialVersionUID = 6809559380640436597L;

	public BussinesException(String message) {
		super(message);
	}
	
	public BussinesException(String message, Exception e) {
		super(message, e);
	}

	
}
