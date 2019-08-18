
public class TesteEndereco1 {
	
	public static void main(String[] args) {
		try {
			Endereco e = new Endereco("SC 401", 3730);
		} catch (NumeroInvalidoException1 e) {
			e.printStackTrace();
		}
	}

}
