/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosaula07;

/**
 *
 * @author catia.silveira
 */
public class Carro {
    private String fabricante;
    private String placa;
    private int velocidade;
    public static int velocidadeMaximaPeritida = 60;

    public Carro(String fabricante, String placa, int velocidade){
        this.fabricante = fabricante;
        this.placa = placa;
        this.velocidade = velocidade;    
    }
    
    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public void acelerar(int deltaV){
        velocidade += deltaV;
    }
    
    public boolean ultrapassouLimite(){
        return velocidade > velocidadeMaximaPeritida;    
    }  
    
}
