
public class ContaPoupanca extends Conta {

	private double limite = 1000;
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	//se tentarmos fazer sobrescrever o m�todo saque que � final na super classe
	// teremos um erro de compila��o
//	public void saque(double valor) {
//		if ( saldo + limiete > valor ) {
//			saldo = saldo - valor;
//		}
//	}
	

}
