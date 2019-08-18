package sc.br.senai.model;

import java.io.Serializable;

/**
 * @author artur
 */
public class Cidade implements Serializable {
    
	private static final long serialVersionUID = 1141637700168423401L;
	
	private int idCidade;
    private String nmCidade;
    private String sgEstado;
    
    public Cidade() {}

	public Cidade(int idCidade, String nmCidade, String sgEstado) {
        this.idCidade = idCidade;
        this.nmCidade = nmCidade;
        this.sgEstado = sgEstado;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCidade;
		result = prime * result
				+ ((nmCidade == null) ? 0 : nmCidade.hashCode());
		result = prime * result
				+ ((sgEstado == null) ? 0 : sgEstado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (idCidade != other.idCidade)
			return false;
		if (nmCidade == null) {
			if (other.nmCidade != null)
				return false;
		} else if (!nmCidade.equals(other.nmCidade))
			return false;
		if (sgEstado == null) {
			if (other.sgEstado != null)
				return false;
		} else if (!sgEstado.equals(other.sgEstado))
			return false;
		return true;
	}

    @Override
    public String toString() {
        return nmCidade;
    }
}
