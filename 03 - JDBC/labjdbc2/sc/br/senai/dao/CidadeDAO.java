package sc.br.senai.dao;

import java.util.List;

import sc.br.senai.model.Cidade;

/**
 * @author senai
 */
public interface CidadeDAO extends AbstractDAO<Cidade> {
	
	List<Cidade> buscaCidadesPorNome(Cidade cidade);
    
    List<Cidade> buscaCidadesPorUF(Cidade cidade);
}
