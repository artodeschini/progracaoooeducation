
public class TesteInterface {


	public static void main(String[] args) {
		Mobilia m = new Mobilia("Mesa", "Bergamo", "madeira/fomica", 115, 70, 90, 11);
		
		System.out.println("Mobilia: " + m.getTipo());
		System.out.println("Volume: " + m.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("Peso: " + m.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("Empilhamento max: " + m.getEmpilhamento() );
		
		//String nome, int temperatura, double volumeCm3,int pesoGramas, int empilhamento, int validade
		Alimento a = new Alimento("hamburguer", -2, 350, 260, 6, 30);
		
		System.out.println("Alimento: " + a.getNome());
		System.out.println("Volume: " + a.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("Peso: " + a.getPeso());
		System.out.println("Empilhameno max: " + a.getEmpilhamento());
		System.out.println("Conservacao: " + a.getTemperaturaConservacao() + "C");
		System.out.println("Dias de validade: " + a.getDiasValidade());
		

	}

}
