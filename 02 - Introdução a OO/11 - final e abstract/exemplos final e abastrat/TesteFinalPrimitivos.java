
public class TesteFinalPrimitivos {

	public static void main(String[] args) {
		FinalPrimitivos fp = new FinalPrimitivos();
		//podemos ver uma variavel final
		System.out.println(fp.i);
		//essa pr�xima linha dar� um erro de compila��o
		//n�o podemos substituir o valor de uma variavel primitiva final
		//fp.i = 2;

	}

}
