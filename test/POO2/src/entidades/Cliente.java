/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author daniel.s.oliveira
 */
public class Cliente {
    
    private int id;
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
