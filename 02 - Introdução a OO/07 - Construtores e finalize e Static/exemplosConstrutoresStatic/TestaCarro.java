/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosaula07;

/**
 *
 * @author catia.silveira
 */
public class TestaCarro {
    
    public static void main(String[] args) {
        System.out.println("Velocidade maxima permitida: ");
        System.out.println(Carro.velocidadeMaximaPeritida);
        
        Carro c1 = new Carro("GM", "IBM9876", 50);
        Carro c2 = new Carro("Volks", "ORC3344", 42);
        
        c1.acelerar(16);
        c2.acelerar(30);
        
        System.out.println("Carro "+ c1.getPlaca() + " ultrapssou o limite? ");
        System.out.println(c1.ultrapassouLimite());
        System.out.println("Carro "+ c2.getPlaca() + " ultrapssou o limite? ");
        System.out.println(c2.ultrapassouLimite());
        
        Carro.velocidadeMaximaPeritida = 70;
        System.out.println("\nVelocidade maxima permitida: ");
        System.out.println(Carro.velocidadeMaximaPeritida);
        
        System.out.println("Carro "+ c1.getPlaca() + " ultrapssou o limite? ");
        System.out.println(c1.ultrapassouLimite());
        System.out.println("Carro "+ c2.getPlaca() + " ultrapssou o limite? ");
        System.out.println(c2.ultrapassouLimite());
        
    }
    
}
