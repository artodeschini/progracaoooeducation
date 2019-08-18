/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um construtor para classe Cliente e remova o metodo inicializaCliente
 */
public class Cliente {

    private String nome;
    private String cpf;

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
     * @return cpf do cliente
     */
    public String getCpf() {
        return this.cpf;
    }

    /**
     * @return nome do cliente
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param cpf
     *            CPF
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param nome
     *            Nome do Cliente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + getNome());
        System.out.println("CPF:" + getCpf());
        System.out.println("----------------------");
    }
}
