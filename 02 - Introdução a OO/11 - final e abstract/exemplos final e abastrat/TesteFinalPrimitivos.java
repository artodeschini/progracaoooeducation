
public class TesteFinalPrimitivos {

	public static void main(String[] args) {
		FinalPrimitivos fp = new FinalPrimitivos();
		//podemos ver uma variavel final
		System.out.println(fp.i);
		//essa próxima linha dará um erro de compilação
		//não podemos substituir o valor de uma variavel primitiva final
		//fp.i = 2;

	}

}
