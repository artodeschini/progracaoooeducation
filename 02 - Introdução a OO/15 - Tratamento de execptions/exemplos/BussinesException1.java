
public class BussinesException1 extends Exception {

	private static final long serialVersionUID = 6809559380640436597L;

	public BussinesException1(String message) {
		super(message);
		this.print();
		//envia e-mail pra o responsvel
	}
	
	public BussinesException1(String message, Exception e) {
		super(message, e);
		this.print();
		//envia e-mail pra o responsvel
	}

	public void print() {
		System.out.println("----  Exception  ----");
		System.out.println(     getMessage()    );
		System.out.println("--- printStackTrace ---");
		
		//Obtivemos a excpetion causadora do problema passada como parametro no construtor
		printStackTrace();
		System.out.println("----- end exception ----");
	}
}
