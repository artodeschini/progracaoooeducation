public class TesteCPMF {

    public static void main(String[] args) {

        System.out.println("Taxa CPMF Vigente: " + Conta.getTaxaCPMF());
        
        Conta conta1 = new Conta(600, "987444", "Gabriel Monteiro da Silva", "3456", 202);
        Conta conta2 = new Conta(800, "435357", "Bernardino de Campos", "3456", 202);
        
        conta1.imprimeDados();
        conta2.imprimeDados();
        
        conta1.saque(200);
        conta2.saque(400);
        
        System.out.println("cpmf devido por conta1:" + conta1.getCPMFAcumulado());
        System.out.println("cpmf devido por conta2:" + conta2.getCPMFAcumulado());
        
        // alterando o CPMF
        Conta.setTaxaCPMF(0.03);
        System.out.println("\n\nNova Taxa CPMF: " + Conta.getTaxaCPMF());
        conta1.saque(150);
        conta2.saque(300);
        
        System.out.println("cpmf devido por conta1:" + conta1.getCPMFAcumulado());
        System.out.println("cpmf devido por conta2:" + conta2.getCPMFAcumulado());
    
    }
}
