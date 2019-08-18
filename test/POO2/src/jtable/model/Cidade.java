
package jtable.model;

/**
 *
 * @author artur
 */
public class Cidade {
    
    private int idCidade;
    private String nmCidade;
    private String sgEstado;

    public Cidade(int idCidade, String nmCidade, String sgEstado) {
        this.idCidade = idCidade;
        this.nmCidade = nmCidade;
        this.sgEstado = sgEstado;
    }

    public Cidade() {
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getSgEstado() {
        return sgEstado;
    }

    public void setSgEstado(String sgEstado) {
        this.sgEstado = sgEstado;
    }

    @Override
    public String toString() {
        return "Cidade com código = " + idCidade + " nome = " + nmCidade + " do estado = " + sgEstado;
    }
    
    
    
}
