/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosaula07;

/**
 *
 * @author catia.silveira
 */
public class Curso {
    private String nome;
    private String descricao;
    private String codigo;
    private int cargaHoraria;

    public void inicializaCurso(String nome,  String desc, String cod, int carga){
        setNome(nome);
        setCodigo(cod);
        setCargaHoraria(carga);
        setDescricao(desc);   
   }
    
   public void imprime(){
       System.out.println("Nome: " + this.getNome());
       System.out.println("Descricao: " + this.getDescricao());
       System.out.println("Codigo: " + this.getCodigo());
       System.out.println("Carga Horária: " + this.getCargaHoraria());
       
   
   }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    
    
    
}
