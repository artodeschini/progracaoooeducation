/*
 * 
 * 
 * 1) Seguindo o modelo da classe Conta, crie o metodo 
 *    inicializaAgencia da classe Agencia
 * 
 */
class Agencia {

    String numero;
    int banco;

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + numero);
        System.out.println("Banco no." + banco);
        System.out.println("----------------------");
    }
}
