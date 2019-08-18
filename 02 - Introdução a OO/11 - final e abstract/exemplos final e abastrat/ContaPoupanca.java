
public class ContaPoupanca extends Conta {

	private double limite = 1000;
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	//se tentarmos fazer sobrescrever o método saque que é final na super classe
	// teremos um erro de compilação
//	public void saque(double valor) {
//		if ( saldo + limiete > valor ) {
//			saldo = saldo - valor;
//		}
//	}
	

}
