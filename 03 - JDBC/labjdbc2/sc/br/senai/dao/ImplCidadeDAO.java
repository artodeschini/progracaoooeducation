
package sc.br.senai.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import sc.br.senai.model.Cidade;

/**
 * @author senai
 */
class ImplCidadeDAO implements CidadeDAO {

	private final String CALL_LISTAR_CIDADES_UF = "{call listar_cidades_UF( ? )}";
	private final String INSERT = "insert into encidade (nmcidade, sgestado) values (?,?)";
	private final String UPDATE = "update encidade set nmcidade = ?, sgestado = ? where idcidade = ?";
	private final String DELETE = "delete from encidade where idcidade = ?";
	private final String ALL = "select idcidade, nmcidade, sgestado from encidade";
	private final String LIKE = "select idcidade, nmcidade, sgestado from encidade where nmcidade like ?";

	private ConnectionManager connectionManager;
	private static Connection connection;

	ImplCidadeDAO() {
		this.openConnection();
	}
	

	@Override
	public boolean isConnectionClose() {
		try {
			return connection.isClosed();
		} catch (SQLException ex) {
			return false;
		}
	}
	
	@Override
	public void openConnection() {
		if ( connectionManager == null ) {
			connectionManager = ConnectionManager.getInstance();
		}
		
		if ( connection == null) {
			connection = connectionManager.getConnection();
		}
		
		if ( isConnectionClose() ) {
			connection = connectionManager.getConnection();
		}
	}

	@Override
	public void closeConnection() {
		if ( connection != null && connectionManager != null) {
			if ( ! this.isConnectionClose() ) {
				connectionManager.closeConnection(connection);
			}
		}
	}


	@Override
	public Cidade salvar(Cidade c) {
		try {
			PreparedStatement ps = null;
			//1 crie um instancia de PreparedStatement
			//para obter a chave gerada pelo banco
			
			ps.setObject(1, c.getNmCidade());
			ps.setObject(2, c.getSgEstado());
			
			ps.executeUpdate();
			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			
			c.setIdCidade( rs.getInt(1));
			
		} catch (SQLException ex) {
			Logger.getLogger(ImplCidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			this.closeConnection();
		}
		return c;
	}
	
	@Override
	public void alterar(Cidade e) {
		PreparedStatement ps = null;
		try {
			//2 crie uma instancia de PreparedStatement 
			//passe para ela a instrucao para realizar alteracoes em uma registro do banco 
						
			ps.setObject(1, e.getNmCidade());
			ps.setObject(2, e.getSgEstado());
			ps.setObject(3, e.getIdCidade());
			
			ps.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(ImplCidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			this.closeConnection();
		}
	}

	@Override
	public void deletar(Cidade e) {
		try {
			PreparedStatement ps = null;
			ps = connection.prepareStatement(DELETE);
			//3 passe para o PreparedStatement o valor do id que deve ser excluido do banco de dados 
			
			ps.executeUpdate();

		} catch (SQLException ex) {
			Logger.getLogger(ImplCidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			this.closeConnection();
		}
	}
	
	@Override
	public List<Cidade> findAll() {
		List<Cidade> cidades = new ArrayList<Cidade>();

		try {
			PreparedStatement ps = null;
			ResultSet rs = null;
			ps = connection.prepareStatement(ALL);

			//4 Obtenha uma instancia de resultset
			
			while (rs.next()) {
				//5 crie uma instancia de cidade com os dados
				//obtidos do banco e adicione a lista de cidades
				
			}

		} catch (SQLException ex) {
			Logger.getLogger(ImplCidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			this.closeConnection();
		}
		return cidades;
	}

	@Override
	public List<Cidade> buscaCidadesPorNome(Cidade cidade) {
		List<Cidade> cidades = new ArrayList<Cidade>();
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = connection.prepareStatement(LIKE);
			//6 informe o parmetro para instrucao like
			
			rs = ps.executeQuery();

			while (rs.next()) {
				cidades.add(new Cidade(
						rs.getInt("idcidade"),
						rs.getString("nmcidade"),
						rs.getString("sgestado")));
			}

		} catch (SQLException ex) {
			Logger.getLogger(ImplCidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			this.closeConnection();
		}
		return cidades;
	}
	
	public List<Cidade> buscaCidadesPorUF(Cidade c) {
		List<Cidade> cidades = new ArrayList<Cidade>();

		try {
			CallableStatement cs = null;
			ResultSet rs = null;
			
			
			//7 crie uma instancia de CallableStatement 
			// para chamar a constante CALL_LISTAR_CIDADES_UF
			
			cs.setObject(1, c.getSgEstado() );

			rs = cs.executeQuery();

			while (rs.next()) {
				cidades.add(new Cidade(
						rs.getInt("idcidade"),
						rs.getString("nmcidade"),
						rs.getString("sgestado")));
			}

		} catch (SQLException ex) {
			Logger.getLogger(ImplCidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			this.closeConnection();
		}

		return cidades;
	}
}
