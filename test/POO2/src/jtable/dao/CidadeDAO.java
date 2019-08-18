
package jtable.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jtable.model.Cidade;


public class CidadeDAO {
    
    
    public Cidade insert(Cidade c) {
        String sql = "INSERT into encidade (nmcidade, sgestado) values ( ? ,? )";
        
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement( sql , PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setObject(1, c.getNmCidade() );
            ps.setObject(2, c.getSgEstado());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            c.setIdCidade( rs.getInt( 1 ) );
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return c;
    }
    
    public void update(Cidade c) {
        String sql = "update encidade set nmcidade = ? , sgestado = ? where idcidade =  ? ";
        
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement( sql );
            ps.setObject(1, c.getNmCidade() );
            ps.setObject(2, c.getSgEstado());
            ps.setObject(3, c.getIdCidade());
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean delete(Cidade c) {
        String sql = "delete from encidade where idcidade =  ? ";
        
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement( sql );
            ps.setObject(1, c.getIdCidade());
            
            ps.executeUpdate();
            
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public List<Cidade> buscarCidadePorNome(Cidade c) {
        return list( c , "select idcidade, nmcidade, sgestado from encidade where nmcidade like ? " );
    }
    
    public List<Cidade> buscarCidadePorEstado(Cidade c) {
        return list( c , "select idcidade, nmcidade, sgestado from encidade where sgestado = ? " );
    }
    
    private List<Cidade> list(Cidade c, String sql) {
        List<Cidade> cidades = new ArrayList<Cidade>();
        
        PreparedStatement ps;
        try {
            ps = Conexao.getConexao().prepareStatement( sql );
            
            if ( c.getNmCidade() != null ) {
                ps.setObject(1, c.getNmCidade() + "%" );
            } else if ( c.getSgEstado() != null ) {
                ps.setObject(1, c.getSgEstado() );
                
            }
            
            
            ResultSet rs = ps.executeQuery();
            
            while ( rs.next() ) {
                cidades.add( new Cidade(rs.getInt("idcidade"), rs.getString("nmcidade"), rs.getString("sgestado") ) );
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cidades;
    }
}
