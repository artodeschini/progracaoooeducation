/*
 * 1) Encapsule os atributos da classe Cliente
 */
public class Cliente {

    String nome;
    String cpf;

    /**
     * @param n
     *            nome do cliente
     * @param c
     *            cpf do cliente
     */
    public void inicializaCliente(String n, String c) {
        this.cpf = c;
        this.nome = n;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------------");
    }
}
