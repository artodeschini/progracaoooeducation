
public class Funcionario extends Pessoa {
	
	private long carteira;
	private double salario;
	private String dtAdmissao;
	
//para uso em construtores x herança	
//	public Funcionario(String nome, String rg, Endereco endereco) {
//		//qualquer coisa colocada antes da chamada do construtor da superclasse geraria um erro.
//      //System.out.println("Construtor de Funcionario");	
//		super(nome, rg, endereco);
//	}
	
	public long getCarteira() {
		return carteira;
	}
	public void setCarteira(long carteira) {
		this.carteira = carteira;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	
	public void imprimeRecibo(int dia, int mes, int ano) {
		//podemos acessar os atributos nome e rg da classe pessoa pois são pretected
		System.out.print("Eu,  " + nome + ", portador do RG de n " + rg);
		//utilizando super
		//System.out.print("Eu,  " + super.nome + ", portador do RG de n " + super.rg);
		//salario é atributo dessa classe Funcionario
		System.out.print(" declaro que recebi o valor de R$ " + salario);
		System.out.print(" referente ao pgto do dia " + dia + "/" + mes + "/" + ano );
		//Endereço não podemos acessar pos está marcado como private só podemos acessar via get
		System.out.println(getEndereco().getRua() + ", " + getEndereco().getNumero());
		//utilizando super
		//System.out.println(super.getEndereco().getRua() + ", " + super.getEndereco().getNumero());
		
	}
}
