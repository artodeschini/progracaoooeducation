/*
 * 
 * 
 * Analise o codigo
 * 
 */
class Cliente {

    String nome;
    String cpf;

    /**
     * @param n
     *            nome do cliente
     * @param c
     *            cpf do cliente
     */
    void inicializaCliente(String n, String c) {
        cpf = c;
        nome = n;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + nome);
        System.out.println("CPF:" + cpf);
        System.out.println("----------------------");
    }
}
