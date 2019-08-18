/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author daniel.s.oliveira
 */
public class ClienteDAO extends AbstractDAO {

    public ArrayList<Cliente> select() {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM cliente";
            PreparedStatement prest = connection.prepareStatement(sql);
            ResultSet rs = prest.executeQuery();

            ArrayList<Cliente> listaClientes = montarObjeto(rs);

            connection.close();
            return listaClientes;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public ArrayList<Cliente> select(String n) {

        Connection connection = Conexao.getConexao();
        try {

            String sql = "SELECT * FROM cliente WHERE nome LIKE ?;";
            PreparedStatement prest = connection.prepareStatement(sql);
            prest.setObject(1, n);
            ResultSet rs = prest.executeQuery();

            ArrayList<Cliente> listaClientes = montarObjeto(rs);

            connection.close();
            return listaClientes;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }


    private ArrayList<Cliente> montarObjeto(ResultSet rs) throws SQLException {
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        while (rs.next()) {
            Cliente c = new Cliente();
            int id = rs.getInt("id");
            String nome = rs.getString("nome");
            c.setId(id);
            c.setNome(nome);
            listaClientes.add(c);
        }

        return listaClientes;
    }

//    public void insert(Cliente clienteNovo) {
//        Connection connection = Conexao.getConexao();
//        try {
//            String sql = "INSERT INTO cliente (nome) VALUES (?);";
//            PreparedStatement prest = connection.prepareStatement(sql);
//            prest.setString(1, clienteNovo.getNome());
//
//            prest.execute();
//            connection.close();
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
    public void insert(Cliente cliente) {

        String sql = "INSERT INTO cliente (nome) VALUES (?);";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(cliente.getNome());
        operacaoEscrita(sql, params);

    }

    public void update(Cliente cliente) {

        String sql = "UPDATE cliente SET nome = ? WHERE id = ?";
        //String sql = "UPDATE cliente SET nome = ? WHERE id = ?";
        ArrayList<Object> params = new ArrayList<Object>();
        params.add(cliente.getNome());
        params.add(cliente.getId());
        operacaoEscrita(sql, params);

    }

    public void delete(Cliente cliente) {

        String sql = "DELETE FROM cliente WHERE id = ?";
        //String sql = "UPDATE cliente SET nome = ? WHERE id = ?";

        ArrayList<Object> params = new ArrayList<Object>();
        params.add(cliente.getId());
        operacaoEscrita(sql, params);
    }
    
}
