
public class Conta {
	
	protected double saldo;
	
	public Conta(double saldo) {
		setSaldo(saldo);
	}

	//Observer que colocamos o método saque como final
	public final void saque(double valor) {
		if ( saldo > valor ) {
			saldo = saldo - valor;
		}
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	

}
